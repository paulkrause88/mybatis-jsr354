package paulkrause88.mybatis.jsr354.type;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("GBPAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class GBPAmountHandler extends AbstractMonetaryAmountHandler {

	private static final CurrencyUnit GBP = MonetaryCurrencies.getCurrency("GBP");

	@Override
	public CurrencyUnit getCurrency() {
		return GBP;
	}
}
