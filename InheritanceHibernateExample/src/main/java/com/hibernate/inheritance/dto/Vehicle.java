package com.hibernate.inheritance.dto;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.DiscriminatorOptions;

@Entity
@Table(name = "VEHICLE_IN")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="VEHICLE_TYPE",discriminatorType=DiscriminatorType.STRING)
public class Vehicle {

	@Id
	@GeneratedValue
	@Column(name = "VEHICLE_ID")
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
