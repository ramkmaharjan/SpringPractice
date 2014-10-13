package com.hibernate.mapping.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.mapping.dto.UserDetails;
import com.hibernate.mapping.dto.Vehicle;

public class HibernateMappingMain {

	public static void main(String[] args) {

		UserDetails user = new UserDetails();
		user.setUserName("First Name");
		
		Vehicle v = new Vehicle();
		v.setVehicleName("BMX");
		
		user.setVehicle(v);
		Configuration c = new Configuration().configure();
		SessionFactory sessionFactory = c.buildSessionFactory();
		Session session = sessionFactory.openSession();

		session.beginTransaction();
		session.save(user);
		session.save(v);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
