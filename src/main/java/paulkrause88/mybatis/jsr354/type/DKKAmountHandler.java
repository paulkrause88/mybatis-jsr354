package paulkrause88.mybatis.jsr354.type;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("DKKAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class DKKAmountHandler extends AbstractMonetaryAmountHandler {

	private static final CurrencyUnit DKK = MonetaryCurrencies.getCurrency("DKK");

	@Override
	public CurrencyUnit getCurrency() {
		return DKK;
	}

}
