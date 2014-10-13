package com.hibernate.mapping.dto;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name="VEHICLE_MAP")
public class Vehicle {

	@Id
	@GeneratedValue
	@Column(name = "VEHICLE_ID")
	private int vehicleID;
	
	@Column(name = "VEHICLE_NAME")
	private String vehicleName;
	
	@ManyToOne
	@JoinColumn(name="USER_ID")
	@NotFound(action=NotFoundAction.IGNORE)
	private UserDetails user;
	
//	@ManyToMany(mappedBy="vehicleList")
//	private Collection<UserDetails> userList = new ArrayList<UserDetails>();

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



	/**
	 * @return the user
	 */
	public UserDetails getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(UserDetails user) {
		this.user = user;
	}
}
