package com.mvcexample.myapp.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Size;

public class Student {

	private String studentName;
	@Size(min=2,max=4, message ="Please Enter correct Address size between {min} and {max}")
	private String studentAddress;
	private Long phoneNumber;
	private Date dateOfBirth;
	private List<String> hobbies = new ArrayList<String>();
	
	private Address address;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
