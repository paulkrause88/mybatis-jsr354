package paulkrause88.mybatis.jsr354.type;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("ZARAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class ZARAmountHandler extends AbstractMonetaryAmountHandler {

	private static final CurrencyUnit ZAR = MonetaryCurrencies.getCurrency("ZAR");

	@Override
	public CurrencyUnit getCurrency() {
		return ZAR;
	}
}
