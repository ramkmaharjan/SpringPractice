package com.kcing.aopexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kcing.aopexample.service.ShapeService;

public class AOPMainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springAppContext.xml");
	//	ShapeService shapeService = (ShapeService) context.getBean("shapeService");
		//Alternate method other than Casting
		
		ShapeService shapeService = context.getBean("shapeService",ShapeService.class);
		
		shapeService.getCircle().setNameAndReturn("YouCircle");
		// System.out.println(shapeService.getCircle().getName());
		// System.out.println(shapeService.getTriangle().getName());
	
	}
}
