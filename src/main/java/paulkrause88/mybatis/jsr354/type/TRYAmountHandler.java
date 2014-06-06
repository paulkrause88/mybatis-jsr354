package paulkrause88.mybatis.jsr354.type;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("TRYAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class TRYAmountHandler extends AbstractMonetaryAmountHandler {

	private static final CurrencyUnit TRY = MonetaryCurrencies.getCurrency("TRY");

	@Override
	public CurrencyUnit getCurrency() {
		return TRY;
	}

}
