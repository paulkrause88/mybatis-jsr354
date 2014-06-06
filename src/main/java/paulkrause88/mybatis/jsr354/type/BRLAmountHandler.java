package paulkrause88.mybatis.jsr354.type;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("BRLAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class BRLAmountHandler extends AbstractMonetaryAmountHandler {

	private static final CurrencyUnit BRL = MonetaryCurrencies.getCurrency("BRL");

	@Override
	public CurrencyUnit getCurrency() {
		return BRL;
	}
}
