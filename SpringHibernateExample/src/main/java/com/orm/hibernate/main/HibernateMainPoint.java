package com.orm.hibernate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orm.hibernate.dao.HibernateDaoImpl;

public class HibernateMainPoint {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springAppContext.xml");
		HibernateDaoImpl dao = ctx.getBean("hibernateDaoImpl",HibernateDaoImpl.class);
		System.out.println(dao.getCircleCount()+": Using Hibernate");
		
		dao.saveCircle();
	}
}
