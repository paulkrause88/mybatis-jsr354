package paulkrause88.mybatis.jsr354.type;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("AEDAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class AEDAmountHandler extends AbstractMonetaryAmountHandler {

	private static final CurrencyUnit AED = MonetaryCurrencies.getCurrency("AED");

	@Override
	public CurrencyUnit getCurrency() {
		return AED;
	}	
}
