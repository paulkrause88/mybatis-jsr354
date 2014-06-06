package paulkrause88.mybatis.jsr354.type;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("SGDAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class SGDAmountHandler extends AbstractMonetaryAmountHandler {

	private static final CurrencyUnit SGD = MonetaryCurrencies.getCurrency("SGD");

	@Override
	public CurrencyUnit getCurrency() {
		return SGD;
	}
}
