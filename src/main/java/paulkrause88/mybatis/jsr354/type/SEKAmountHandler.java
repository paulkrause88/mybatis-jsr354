package paulkrause88.mybatis.jsr354.type;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("SEKAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class SEKAmountHandler extends AbstractMonetaryAmountHandler {

	private static final CurrencyUnit SEK = MonetaryCurrencies.getCurrency("SEK");

	@Override
	public CurrencyUnit getCurrency() {
		return SEK;
	}
}
