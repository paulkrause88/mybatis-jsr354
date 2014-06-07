package paulkrause88.mybatis.jsr354.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Year;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Alias("YearHandler")
@MappedJdbcTypes(JdbcType.INTEGER)
public class YearHandler extends BaseTypeHandler<Year> {

	@Override
	public Year getNullableResult(CallableStatement cs, int col) throws SQLException {
		return Year.of(cs.getInt(col));
	}

	@Override
	public Year getNullableResult(ResultSet rs, int col) throws SQLException {
		return Year.of(rs.getInt(col));
	}

	@Override
	public Year getNullableResult(ResultSet rs, String col) throws SQLException {
		return Year.of(rs.getInt(col));
	}

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Year x, JdbcType type) throws SQLException {
		ps.setInt(i, x.getValue());
	}
}
