package paulkrause88.mybatis.jsr354.type;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.money.MonetaryAmount;
import javax.money.MonetaryAmountFactory;
import javax.money.MonetaryAmounts;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("CHFAmountHandler")
@MappedJdbcTypes(JdbcType.DECIMAL)
public class CHFAmountHandler extends BaseTypeHandler<MonetaryAmount> {
	
	private static final ThreadLocal<MonetaryAmountFactory<? extends MonetaryAmount>> CHF_FACTORIES = new ThreadLocal<>();
	
	static MonetaryAmount toCHF(BigDecimal big) {
		if (big == null) return null;
		MonetaryAmountFactory<? extends MonetaryAmount> factory = CHF_FACTORIES.get();
		if (factory == null) {
			factory = MonetaryAmounts.getAmountFactory();
			factory.setCurrency("CHF");
			CHF_FACTORIES.set(factory);
		}
		factory.setNumber(big);
		final MonetaryAmount amount = factory.create();
		return amount;
	}

	@Override
	public MonetaryAmount getNullableResult(ResultSet rs, String col) throws SQLException {
		return toCHF(rs.getBigDecimal(col));
	}

	@Override
	public MonetaryAmount getNullableResult(ResultSet rs, int col) throws SQLException {
		return toCHF(rs.getBigDecimal(col));
	}

	@Override
	public MonetaryAmount getNullableResult(CallableStatement cs, int col) throws SQLException {
		return toCHF(cs.getBigDecimal(col));
	}

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, MonetaryAmount x, JdbcType type) throws SQLException {
		ps.setBigDecimal(i, x.getNumber().numberValueExact(BigDecimal.class));
	}

}
