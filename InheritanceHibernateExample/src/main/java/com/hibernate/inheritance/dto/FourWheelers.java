package com.hibernate.inheritance.dto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="CAR")
public class FourWheelers extends Vehicle {

	private String steeringWheel;

	/**
	 * @return the steeringWheel
	 */
	public String getSteeringWheel() {
		return steeringWheel;
	}

	/**
	 * @param steeringWheel the steeringWheel to set
	 */
	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}
	
}
