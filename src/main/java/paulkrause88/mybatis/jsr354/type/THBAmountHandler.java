package paulkrause88.mybatis.jsr354.type;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("THBAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class THBAmountHandler extends AbstractMonetaryAmountHandler {

	private static final CurrencyUnit THB = MonetaryCurrencies.getCurrency("THB");

	@Override
	public CurrencyUnit getCurrency() {
		return THB;
	}

}
