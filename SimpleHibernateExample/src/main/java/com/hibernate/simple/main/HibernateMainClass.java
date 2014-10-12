package com.hibernate.simple.main;

import java.util.Date;

import com.hibernate.simple.dto.Address;
import com.hibernate.simple.dto.UserDetailsDto;
import com.hibernate.simple.service.HibernateDaoSericeImpl;

public class HibernateMainClass {

	public static void main(String[] args) {
		HibernateDaoSericeImpl service = new HibernateDaoSericeImpl();
		
		UserDetailsDto user = new UserDetailsDto();
		user.setUserId(2);
		user.setUserName("Ramesh");
	//	user.setAddess("KTM");
		Address homeAdd = new Address();
		homeAdd.setState("Florida");
		homeAdd.setZipCode("3334");
		homeAdd.setStreetName("X");;
	//	user.setHomeAddress(homeAdd);
		
		Address offAdd = new Address();
		offAdd.setState("Florida");
		offAdd.setZipCode("3334");
		offAdd.setStreetName("y");;
		//user.setOfficeAddress(offAdd);
		
		user.setDescription("Helloxyzloremepsum");
		user.setJoinDate(new Date());
		
		user.getListOfAddress().add(homeAdd);
		user.getListOfAddress().add(offAdd);
		service.insertUser(user);
		
		
		//UserDetailsDto readUser = service.readUser(2);
//		System.out.println(readUser.getUserName()+":"+readUser.getDescription());

	}

}

