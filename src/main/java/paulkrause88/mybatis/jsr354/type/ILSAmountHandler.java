package paulkrause88.mybatis.jsr354.type;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("ILSAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class ILSAmountHandler extends AbstractMonetaryAmountHandler {

	private static final CurrencyUnit ILS = MonetaryCurrencies.getCurrency("ILS");

	@Override
	public CurrencyUnit getCurrency() {
		return ILS;
	}
}
