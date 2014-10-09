package com.spring.daoexample.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.daoexample.dao.SpringJDBCDaoImpl;
import com.spring.daoexample.model.Circle;

public class DAOMainClass {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springAppCOntext.xml");
		
		SpringJDBCDaoImpl dao = ctx.getBean("springJDBCDaoImpl",SpringJDBCDaoImpl.class);
		
		Circle circle  = dao.getCirlce(1);
	//	System.out.println(circle.getName());

	//	System.out.println(dao.getCircleCount());
	//	
		System.out.println("Name:" + dao.getCircleName(1));
		//
		Circle result = dao.getCircleForID(2);
		System.out.println(result.getName());
		
		for ( Circle c: dao.getAllCircles()) {
			System.out.println(c.getId()+":"+c.getName());
		}
	}

}
