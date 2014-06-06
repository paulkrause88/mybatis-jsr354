package paulkrause88.mybatis.jsr354.type;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("COPAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class COPAmountHandler extends AbstractMonetaryAmountHandler {

	private static final CurrencyUnit COP = MonetaryCurrencies.getCurrency("COP");

	@Override
	public CurrencyUnit getCurrency() {
		return COP;
	}
}
