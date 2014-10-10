package com.spring.daoexample.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.daoexample.model.Circle;

@Component
public class SpringJDBCDaoImpl {

	
	private DataSource dataSource;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	private NamedParameterJdbcTemplate namedParamJdbcTemplate;
	
	
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
	
	/* Using JDBC Template */
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

	public String getCircleName(int id) {
		String sql = "SELECT name FROM circle where id = ?";
		String circleName = jdbcTemplate.queryForObject(sql, String.class,1);
		return circleName;
	}
	
	public List<Circle> getAllCircles() {
		String sql = "SELECT * FROM circle";
		List<Circle> circleList = jdbcTemplate.query(sql,new CircleMapper());
		return circleList;
		
	}
	public Circle getCircleForID(int circleID) {
		String sql = "SELECT * FROM circle where id = ?";
		Circle circle = jdbcTemplate.queryForObject(sql, new Object[]{circleID},new CircleMapper());
		return circle;
	}
	
	public void insertCircle(Circle circle) {
		String sql = "INSERT into CIRCLE (ID,NAME) values(?,?)";
		jdbcTemplate.update(sql, circle.getId(),circle.getName());
	}
	

	/*Example of Named Parameter */
	public void insertCircleNamedParameter(Circle circle) {
		String sql = "INSERT into CIRCLE (ID,NAME) values(:id,:name)";
		SqlParameterSource namedParam = new MapSqlParameterSource("id",circle.getId()).addValue("name", circle.getName());
		getNamedParamJdbcTemplate().update(sql, namedParam);
	}
	private static final class CircleMapper implements RowMapper<Circle> {

		@Override
		public Circle mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			Circle circle = new Circle();
			circle.setId(resultSet.getInt("ID"));
			circle.setName(resultSet.getString("NAME"));
			return circle;
		}
		
		
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
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		// this.jdbcTemplate = new JdbcTemplate(dataSource);
		 this.namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
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

	/**
	 * @return the namedParamJdbcTemplate
	 */
	public NamedParameterJdbcTemplate getNamedParamJdbcTemplate() {
		return namedParamJdbcTemplate;
	}

	/**
	 * @param namedParamJdbcTemplate the namedParamJdbcTemplate to set
	 */
	public void setNamedParamJdbcTemplate(NamedParameterJdbcTemplate namedParamJdbcTemplate) {
		this.namedParamJdbcTemplate = namedParamJdbcTemplate;
	}

}
