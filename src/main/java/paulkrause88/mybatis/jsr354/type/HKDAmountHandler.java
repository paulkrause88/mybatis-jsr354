package paulkrause88.mybatis.jsr354.type;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("HKDAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class HKDAmountHandler extends AbstractMonetaryAmountHandler {

	private static final CurrencyUnit HKD = MonetaryCurrencies.getCurrency("HKD");

	@Override
	public CurrencyUnit getCurrency() {
		return HKD;
	}
}
