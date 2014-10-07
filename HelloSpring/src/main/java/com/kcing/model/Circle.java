package com.kcing.model;

public class Circle implements Shape {

	private int radius;
	private String circleName;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public Circle(int radius,String name) {
		this.radius = radius;
		this.circleName = name;
	}


	/**
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void draw() {
		if(circleName == null) {
			circleName ="No value";
		}
		System.out.println("Circle: Radius" +radius +":Name:" + circleName);
	}
	
}
