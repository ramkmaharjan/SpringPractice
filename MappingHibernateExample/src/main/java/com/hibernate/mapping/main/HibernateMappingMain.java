package com.hibernate.mapping.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.mapping.dto.UserDetails;
import com.hibernate.mapping.dto.Vehicle;

public class HibernateMappingMain {

	public static void main(String[] args) {

		UserDetails user = new UserDetails();
		user.setUserName("Harry Name");
		
//		UserDetails user2 = new UserDetails();
//		user2.setUserName("sally Name");
		
		Vehicle v = new Vehicle();
		v.setVehicleName("BMX");
		
		Vehicle v2 = new Vehicle();
		v2.setVehicleName("Landcruiser");
		
		user.getVehicleList().add(v);
		v.setUser(user);

//		user.getVehicleList().add(v);
//		user.getVehicleList().add(v2);
//		
//		v.getUserList().add(user);
//		v2.getUserList().add(user);
		
		// v.setUser(user);
		
		
		Configuration c = new Configuration().configure();
		SessionFactory sessionFactory = c.buildSessionFactory();
		Session session = sessionFactory.openSession();

		session.beginTransaction();
		session.save(v);
		session.save(v2);
		session.save(user);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
