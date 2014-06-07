package paulkrause88.mybatis.jsr354.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.util.Locale;

import javax.money.MonetaryAmount;
import javax.money.format.MonetaryAmountFormat;
import javax.money.format.MonetaryFormats;
import javax.money.format.MonetaryParseException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

@MappedTypes(MonetaryAmount.class)
@MappedJdbcTypes(JdbcType.VARCHAR)
public class MixedCurrencyAmountHandler extends BaseTypeHandler<MonetaryAmount> {

	private static final MonetaryAmountFormat MAF = MonetaryFormats.getAmountFormat(Locale.ROOT);

	private static MonetaryAmount toMonetaryAmount(String val) throws SQLException {
		if (val == null) return null;
		try {
			return MAF.parse(val);
		} catch (MonetaryParseException e) {
			throw new SQLSyntaxErrorException(val, e);
		}
	}

	@Override
	public MonetaryAmount getNullableResult(ResultSet rs, String col) throws SQLException {
		return toMonetaryAmount(rs.getString(col));
	}


	@Override
	public MonetaryAmount getNullableResult(ResultSet rs, int col) throws SQLException {
		return toMonetaryAmount(rs.getString(col));
	}

	@Override
	public MonetaryAmount getNullableResult(CallableStatement cs, int col) throws SQLException {
		return toMonetaryAmount(cs.getString(col));
	}

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, MonetaryAmount x, JdbcType type) throws SQLException {
		try {
			ps.setString(i, MAF.format(x));
		} catch (UnsupportedOperationException e) {
			throw new SQLSyntaxErrorException(x.toString(), e);
		}
	}

}
