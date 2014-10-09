package com.spring.daoexample.jdbc;

import com.spring.daoexample.dao.JdbcOnlyDAOImpl;
import com.spring.daoexample.model.Circle;

public class JdbcOnlyNotSpringMain {

	public static void main(String[] args) {

		Circle circle = new JdbcOnlyDAOImpl().searchCircle(1);
		System.out.println("Name:" + circle.getName());
	}

}
