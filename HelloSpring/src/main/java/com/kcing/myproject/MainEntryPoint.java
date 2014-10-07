package com.kcing.myproject;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kcing.model.Shape;


public class MainEntryPoint {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("springAppContext.xml");
//		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("springAppContext.xml");
//		appContext.registerShutdownHook();
		Shape triangle = (Shape) appContext.getBean("triangle");
		triangle.draw();
		
		Shape c1 = (Shape) appContext.getBean("circle");
		c1.draw();
		
		Shape c2 = (Shape) appContext.getBean("circle2");
		c2.draw();
		
		String msg = appContext.getMessage("helloMSG", null,"Hello(Default)",Locale.US);
		System.out.println("Localized MSG:" + msg);
		
		
	}

}
