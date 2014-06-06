package paulkrause88.mybatis.jsr354.type;

import javax.money.MonetaryAmountFactory;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("TWDAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class TWDAmountHandler extends AbstractMonetaryAmountHandler {

	@Override
	protected MonetaryAmountFactory<?> getFactory() {
		return getFactory("TWD");
	}	
}
