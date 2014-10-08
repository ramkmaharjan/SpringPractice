package com.kcing.aopexample.model;

public class Triangle {

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
		System.out.println("Triangle Name is: " + name);
	}
}
