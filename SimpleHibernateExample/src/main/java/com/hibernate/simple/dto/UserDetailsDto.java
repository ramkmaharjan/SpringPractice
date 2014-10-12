package com.hibernate.simple.dto;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity//(name="USER_TABLE")
@Table(name="USER_TABLE")
public class UserDetailsDto {

	@Id
	//@Column(name="USER_ID")
	private int userId;
	
	@Column(name="USER_NAME")
	// @Basic
	private String userName;
	
// 	private String address;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="streetName",column=@Column(name="HOME_STREET")),
		@AttributeOverride(name="zipCode",column=@Column(name="HOME_ZIP")),
		@AttributeOverride(name="state",column=@Column(name="HOME_STATE"))
		
	})
	private Address homeAddress;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="streetName",column=@Column(name="OFF_STREET")),
		@AttributeOverride(name="zipCode",column=@Column(name="OFF_ZIP")),
		@AttributeOverride(name="state",column=@Column(name="OFF_STATE"))
		
	})
	private Address officeAddress;
	@Lob
	private String description;
	
	@Temporal(TemporalType.DATE)
	private Date joinDate;
	
	@Transient // Won't be saved to DB
	private int found;
	
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
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public int getFound() {
		return found;
	}
	public void setFound(int found) {
		this.found = found;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	
}
