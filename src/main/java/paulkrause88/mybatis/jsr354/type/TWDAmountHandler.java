package paulkrause88.mybatis.jsr354.type;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("TWDAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class TWDAmountHandler extends AbstractMonetaryAmountHandler {

	private static final CurrencyUnit TWD = MonetaryCurrencies.getCurrency("TWD");

	@Override
	public CurrencyUnit getCurrency() {
		return TWD;
	}
}
