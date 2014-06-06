package paulkrause88.mybatis.jsr354.type;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("EURAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class EURAmountHandler extends AbstractMonetaryAmountHandler {

	private static final CurrencyUnit EUR = MonetaryCurrencies.getCurrency("EUR");

	@Override
	public CurrencyUnit getCurrency() {
		return EUR;
	}
}
