package paulkrause88.mybatis.jsr354.type;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("MXNAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class MXNAmountHandler extends AbstractMonetaryAmountHandler {

	private static final CurrencyUnit MXN = MonetaryCurrencies.getCurrency("MXN");

	@Override
	public CurrencyUnit getCurrency() {
		return MXN;
	}
}
