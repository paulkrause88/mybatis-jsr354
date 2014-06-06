package paulkrause88.mybatis.jsr354.type;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("NOKAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class NOKAmountHandler extends AbstractMonetaryAmountHandler {

	private static final CurrencyUnit NOK = MonetaryCurrencies.getCurrency("NOK");

	@Override
	public CurrencyUnit getCurrency() {
		return NOK;
	}
}
