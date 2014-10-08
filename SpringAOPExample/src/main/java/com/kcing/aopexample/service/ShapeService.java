package com.kcing.aopexample.service;

import com.kcing.aopexample.aspect.Loggable;
import com.kcing.aopexample.model.Circle;
import com.kcing.aopexample.model.Triangle;

public class ShapeService {

	private Circle circle;
	private Triangle triangle;
	
	@Loggable
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
}
