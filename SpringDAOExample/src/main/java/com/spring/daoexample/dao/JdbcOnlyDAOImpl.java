package com.spring.daoexample.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.spring.daoexample.model.Circle;

public class JdbcOnlyDAOImpl {

	public Circle searchCircle(int circleId) {
	    Circle result = null;
	    
	    Connection conn = null;
	    
	    String driver = "com.mysql.jdbc.Driver";
	   
	    try {
	     Class.forName(driver).newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/springtest?user=root&password=NepalKCC123");
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM circle where id = ?");
			ps.setInt(1, 2);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				result = new Circle(circleId,rs.getString("name"));
				
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (InstantiationException e) {
			
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	    
		return result;
	}
}
