package paulkrause88.mybatis.jsr354.type;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("LocalDateHandler")
@MappedJdbcTypes(JdbcType.DATE)
public class LocalDateHandler extends BaseTypeHandler<LocalDate> {

	static LocalDate toLocalDate(Date date) {
		return date == null ? null : date.toLocalDate();
	}

	@Override
	public LocalDate getNullableResult(CallableStatement cs, int col) throws SQLException {
		return toLocalDate(cs.getDate(col));
	}


	@Override
	public LocalDate getNullableResult(ResultSet rs, int col) throws SQLException {
		return toLocalDate(rs.getDate(col));
	}

	@Override
	public LocalDate getNullableResult(ResultSet rs, String col) throws SQLException {
		return toLocalDate(rs.getDate(col));
	}

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, LocalDate x, JdbcType type) throws SQLException {
		ps.setDate(i, Date.valueOf(x));
	}

}
