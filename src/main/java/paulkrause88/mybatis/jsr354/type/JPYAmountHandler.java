package paulkrause88.mybatis.jsr354.type;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("JPYAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class JPYAmountHandler extends AbstractMonetaryAmountHandler {

	private static final CurrencyUnit JPY = MonetaryCurrencies.getCurrency("JPY");

	@Override
	public CurrencyUnit getCurrency() {
		return JPY;
	}

}
