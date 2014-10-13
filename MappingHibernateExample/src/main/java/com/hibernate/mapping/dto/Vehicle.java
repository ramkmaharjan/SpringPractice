package com.hibernate.mapping.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLE_MAP")
public class Vehicle {

	@Id
	@GeneratedValue
	@Column(name = "VEHICLE_ID")
	private int vehicleID;
	
	@Column(name = "VEHICLE_NAME")
	private String vehicleName;
	
//	@ManyToOne
//	@JoinColumn(name="USER_ID")
//	private UserDetails user;
	
	@ManyToMany(mappedBy="vehicleList")
	private Collection<UserDetails> userList = new ArrayList<UserDetails>();

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
	 * @return the userList
	 */
	public Collection<UserDetails> getUserList() {
		return userList;
	}

	/**
	 * @param userList the userList to set
	 */
	public void setUserList(Collection<UserDetails> userList) {
		this.userList = userList;
	}
}
