package paulkrause88.mybatis.jsr354.type;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("RUBAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class RUBAmountHandler extends AbstractMonetaryAmountHandler {

	private static final CurrencyUnit RUB = MonetaryCurrencies.getCurrency("RUB");

	@Override
	public CurrencyUnit getCurrency() {
		return RUB;
	}
}
