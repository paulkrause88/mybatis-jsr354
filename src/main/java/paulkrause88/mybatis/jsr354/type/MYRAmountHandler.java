package paulkrause88.mybatis.jsr354.type;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("MYRAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class MYRAmountHandler extends AbstractMonetaryAmountHandler {

	private static final CurrencyUnit MYR = MonetaryCurrencies.getCurrency("MYR");

	@Override
	public CurrencyUnit getCurrency() {
		return MYR;
	}

}
