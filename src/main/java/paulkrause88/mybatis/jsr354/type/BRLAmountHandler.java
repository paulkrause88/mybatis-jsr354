package paulkrause88.mybatis.jsr354.type;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.money.MonetaryAmount;
import javax.money.MonetaryAmountFactory;
import javax.money.MonetaryAmounts;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("BRLAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class BRLAmountHandler extends AbstractMonetaryAmountHandler {
	
	private static final ThreadLocal<MonetaryAmountFactory<? extends MonetaryAmount>> BRL_FACTORIES = new ThreadLocal<>();
	
	static MonetaryAmount toBRL(BigDecimal big) {
		if (big == null) return null;
		MonetaryAmountFactory<? extends MonetaryAmount> factory = BRL_FACTORIES.get();
		if (factory == null) {
			factory = MonetaryAmounts.getAmountFactory();
			factory.setCurrency("BRL");
			BRL_FACTORIES.set(factory);
		}
		factory.setNumber(big);
		final MonetaryAmount amount = factory.create();
		return amount;
	}

	@Override
	public MonetaryAmount getNullableResult(ResultSet rs, String col) throws SQLException {
		return toBRL(rs.getBigDecimal(col));
	}

	@Override
	public MonetaryAmount getNullableResult(ResultSet rs, int col) throws SQLException {
		return toBRL(rs.getBigDecimal(col));
	}

	@Override
	public MonetaryAmount getNullableResult(CallableStatement cs, int col) throws SQLException {
		return toBRL(cs.getBigDecimal(col));
	}

}
