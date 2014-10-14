package com.hibernate.inheritance.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.inheritance.dto.FourWheelers;
import com.hibernate.inheritance.dto.TwoWheelers;
import com.hibernate.inheritance.dto.Vehicle;

public class HibernateInheritanceMain {

	public static void main(String[] args) {

		
		
		Vehicle v = new Vehicle();
		v.setVehicleName("BMX");
		
		TwoWheelers v2 = new TwoWheelers();
		v2.setVehicleName("Honda Unicorn");
		v2.setSteeringHandle("SteeringHandle");
				
		FourWheelers f1 = new FourWheelers();
		f1.setVehicleName("Kia I20");
		f1.setSteeringWheel("Sterring Wheel");
		
		Configuration c = new Configuration().configure();
		SessionFactory sessionFactory = c.buildSessionFactory();
		Session session = sessionFactory.openSession();

		session.beginTransaction();
		
		session.save(v);
		session.save(v2);
		session.save(f1);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
