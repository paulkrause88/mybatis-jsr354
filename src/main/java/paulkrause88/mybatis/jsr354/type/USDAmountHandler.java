package paulkrause88.mybatis.jsr354.type;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("USDAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class USDAmountHandler extends AbstractMonetaryAmountHandler {

	private static final CurrencyUnit USD = MonetaryCurrencies.getCurrency("USD");

	@Override
	public CurrencyUnit getCurrency() {
		return USD;
	}
}
