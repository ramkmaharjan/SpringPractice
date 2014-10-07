package com.kcing.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape {
	
	private int x;
	private int y;
	private int z;
	
	
	private MyPoint point;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	public void draw() {
		System.out.println("X:"+x+":Y:"+y+":Z:"+z);
		
		if(getPoint() !=null) {
			System.out.println("Point(x,y): ("+getPoint().getX()+","+getPoint().getY()+")");
		}
		
	}
//	public void destroy() throws Exception {
//		System.out.println("Triangle Obj is destroyed");
//		
//	}
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("Triangle Obj's properties set");
//		
//	}
	/**
	 * @return the point1
	 */
	public MyPoint getPoint() {
		return point;
	}
	/**
	 * @param point1 the point1 to set
	 */
	@Autowired
	@Qualifier("point2")
	public void setPoint(MyPoint point) {
		this.point = point;
	}
	/*
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		context = applicationContext;
		
	}
	public void setBeanName(String name) {
		System.out.println("Bean Name is "+name);
		
	}
	*/
	

}
