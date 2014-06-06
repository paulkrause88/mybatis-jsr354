package paulkrause88.mybatis.jsr354.type;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("IDRAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class IDRAmountHandler extends AbstractMonetaryAmountHandler {

	private static final CurrencyUnit IDR = MonetaryCurrencies.getCurrency("IDR");

	@Override
	public CurrencyUnit getCurrency() {
		return IDR;
	}	
}
