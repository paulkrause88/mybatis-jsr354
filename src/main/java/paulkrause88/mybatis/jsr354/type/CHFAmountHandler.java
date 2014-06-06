package paulkrause88.mybatis.jsr354.type;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("CHFAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class CHFAmountHandler extends AbstractMonetaryAmountHandler {

	private static final CurrencyUnit CHF = MonetaryCurrencies.getCurrency("CHF");

	@Override
	public CurrencyUnit getCurrency() {
		return CHF;
	}

}
