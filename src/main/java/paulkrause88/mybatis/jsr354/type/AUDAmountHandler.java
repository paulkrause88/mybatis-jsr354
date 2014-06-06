package paulkrause88.mybatis.jsr354.type;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("AUDAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class AUDAmountHandler extends AbstractMonetaryAmountHandler {

	private static final CurrencyUnit AUD = MonetaryCurrencies.getCurrency("AUD");

	@Override
	public CurrencyUnit getCurrency() {
		return AUD;
	}
}
