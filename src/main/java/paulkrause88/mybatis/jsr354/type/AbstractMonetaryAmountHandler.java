package paulkrause88.mybatis.jsr354.type;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.money.MonetaryAmount;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

public abstract class AbstractMonetaryAmountHandler extends
		BaseTypeHandler<MonetaryAmount> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, MonetaryAmount x, JdbcType type) throws SQLException {
		ps.setBigDecimal(i, x.getNumber().numberValueExact(BigDecimal.class));
	}

}