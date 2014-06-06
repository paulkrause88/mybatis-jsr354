package paulkrause88.mybatis.jsr354.type;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("CADAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class CADAmountHandler extends AbstractMonetaryAmountHandler {

	private static final CurrencyUnit CAD = MonetaryCurrencies.getCurrency("CAD");

	@Override
	public CurrencyUnit getCurrency() {
		return CAD;
	}
}
