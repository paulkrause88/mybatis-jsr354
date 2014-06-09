package paulkrause88.mybatis.jsr354.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@MappedJdbcTypes(JdbcType.CHAR)
public class CountryCodeHandler extends BaseTypeHandler<Locale> {
	
	private static final Map<String, Locale> LOCALE_MAP = new HashMap<>();
	
	static {
		for (Locale loc : Locale.getAvailableLocales()) {
			if (loc.getCountry().length() == 2) {
				LOCALE_MAP.put(loc.getCountry(), loc);
			}
		}
		for (String iso : Locale.getISOCountries()) {
			if (LOCALE_MAP.get(iso) == null) {
				LOCALE_MAP.put(iso, new Locale.Builder().setRegion(iso).build());
			}
		}
	}

	private static Locale toLocale(String country) throws SQLException {
		final Locale loc = LOCALE_MAP.get(country);
		if (loc == null) throw new SQLDataException(country);
		return loc;
	}

	@Override
	public Locale getNullableResult(CallableStatement cs, int col) throws SQLException {
		return toLocale(cs.getString(col));
	}

	@Override
	public Locale getNullableResult(ResultSet rs, int col) throws SQLException {
		return toLocale(rs.getString(col));
	}

	@Override
	public Locale getNullableResult(ResultSet rs, String col) throws SQLException {
		return toLocale(rs.getString(col));
	}

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Locale x, JdbcType type) throws SQLException {
		ps.setString(i, x.getCountry());
	}

}
