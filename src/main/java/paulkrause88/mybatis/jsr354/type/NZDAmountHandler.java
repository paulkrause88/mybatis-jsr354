package paulkrause88.mybatis.jsr354.type;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("NZDAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class NZDAmountHandler extends AbstractMonetaryAmountHandler {

	private static final CurrencyUnit NZD = MonetaryCurrencies.getCurrency("NZD");

	@Override
	public CurrencyUnit getCurrency() {
		return NZD;
	}

}
