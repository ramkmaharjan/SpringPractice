package com.hibernate.mapping.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USER_TABLE_MAP")
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	@Column(name = "USER_NAME")
	private String userName;

	//
	// @OneToOne
	// @JoinColumn(name="VEHICLE_ID")
	// private Vehicle vehicle;

//	@OneToMany
//	@JoinTable(name="USER_VEHICLE",joinColumns = @JoinColumn(name="USERID"),
//				inverseJoinColumns=@JoinColumn(name="VEHICLE_ID"))
	
	@OneToMany(mappedBy="user")
	private Collection<Vehicle> vehicleList = new ArrayList<Vehicle>();
//	@ManyToMany
//	private Collection<Vehicle> vehicleList = new ArrayList<Vehicle>();

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the vehicleList
	 */
	public Collection<Vehicle> getVehicleList() {
		return vehicleList;
	}

	/**
	 * @param vehicleList
	 *            the vehicleList to set
	 */
	public void setVehicleList(Collection<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

}
