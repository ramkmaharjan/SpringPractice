package com.hibernate.inheritance.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "VEHICLE_IN")
@Inheritance(strategy = InheritanceType.JOINED)
@org.hibernate.annotations.Entity(selectBeforeUpdate = true)
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
//	@Column(name = "VEHICLE_ID")
	private int vehicleID;

	@Column(name = "VEHICLE_NAME")
	private String vehicleName;

	public int getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

}
