package com.kcing.aopexample.model;

public class Circle {

	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void draw() {
		System.out.println("Cirlce Name is: " + name);
	}
}
