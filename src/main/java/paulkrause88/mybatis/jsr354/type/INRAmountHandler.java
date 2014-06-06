package paulkrause88.mybatis.jsr354.type;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("INRAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class INRAmountHandler extends AbstractMonetaryAmountHandler {

	private static final CurrencyUnit INR = MonetaryCurrencies.getCurrency("INR");

	@Override
	public CurrencyUnit getCurrency() {
		return INR;
	}
}
