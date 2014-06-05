package paulkrause88.mybatis.jsr354;

import static org.apache.ibatis.io.Resources.getResourceAsReader;
import static org.junit.Assert.*;

import java.io.Reader;
import java.sql.Connection;

import org.apache.ibatis.jdbc.ScriptRunner;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.money.dao.PublicDebtMapper;
import domain.money.model.PublicDebt;

public class PublicDebtTest {

	private static SqlSessionFactory sqlSessionFactory;

	@BeforeClass
	public static void setUp() throws Exception {
		// create a SqlSessionFactory
		try (Reader reader = getResourceAsReader("databases/money/mybatis-config.xml")) {
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		}

		String[] scripts = {
			"databases/money/money-hsqldb-schema.sql",
			"databases/money/money-hsqldb-dataload.sql",
		};

		// populate in-memory database
		try (SqlSession session = sqlSessionFactory.openSession();
				Connection conn = session.getConnection()) {
			for (String script : scripts) {
				try (Reader reader = getResourceAsReader(script)) {
					ScriptRunner runner = new ScriptRunner(conn);
					runner.setLogWriter(null);
					runner.runScript(reader);
				}
			}
		}
	}
		
	@Test
	public void testShouldGetUS() {
		try (SqlSession session = sqlSessionFactory.openSession()) {
			PublicDebtMapper mapper = session.getMapper(PublicDebtMapper.class);
			PublicDebt us = mapper.selectMostRecent("US");
			assertNotNull(us);
			assertEquals("US", us.getCountryCode());
			
		}
	}

}
