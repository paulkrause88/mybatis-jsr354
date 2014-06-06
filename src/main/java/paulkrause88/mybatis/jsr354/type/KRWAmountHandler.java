package paulkrause88.mybatis.jsr354.type;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("KRWAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class KRWAmountHandler extends AbstractMonetaryAmountHandler {

	private static final CurrencyUnit KRW = MonetaryCurrencies.getCurrency("KRW");

	@Override
	public CurrencyUnit getCurrency() {
		return KRW;
	}
}
