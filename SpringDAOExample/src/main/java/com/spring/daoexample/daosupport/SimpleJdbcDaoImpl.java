package com.spring.daoexample.daosupport;

import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

@SuppressWarnings("deprecation")
public class SimpleJdbcDaoImpl extends SimpleJdbcDaoSupport {

	public int getCircleCount() {
		String sql = "SELECT count(*) FROM circle";
		int returnVal = getSimpleJdbcTemplate().queryForInt(sql);
		return returnVal;
	}
}
