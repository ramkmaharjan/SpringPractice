package com.spring.daoexample.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.daoexample.model.Circle;

@Component
public class SpringJDBCDaoImpl {

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Circle getCirlce2(int circleId) {
		Circle result = null;

		Connection conn = null;
		try {

			conn = getDataSource().getConnection();
			PreparedStatement ps = conn
					.prepareStatement("SELECT * FROM circle where id = ?");
			ps.setInt(1, 2);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				result = new Circle(circleId, rs.getString("name"));

			}
			rs.close();
			ps.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return result;
	}
	
	/* Using JDBC Teemplate */
	public Circle getCirlce(int circleId) {
		Circle result = null;

		Connection conn = null;
		try {

			conn = getDataSource().getConnection();
			PreparedStatement ps = conn
					.prepareStatement("SELECT * FROM circle where id = ?");
			ps.setInt(1, 2);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				result = new Circle(circleId, rs.getString("name"));

			}
			rs.close();
			ps.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return result;
	}
	
	public int getCircleCount() {
		String sql = "SELECT count(*) FROM circle";
		int returnVal = jdbcTemplate.queryForInt(sql);
		return returnVal;
	}

	/**
	 * @return the dataSource
	 */
	public DataSource getDataSource() {
		return dataSource;
	}

	/**
	 * @param dataSource the dataSource to set
	 */
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	/**
	 * @return the jdbcTemplate
	 */
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
