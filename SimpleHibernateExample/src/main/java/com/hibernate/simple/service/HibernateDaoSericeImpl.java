package com.hibernate.simple.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.simple.dto.UserDetailsDto;
import com.hibernate.simple.dto.Vehicle;

public class HibernateDaoSericeImpl {

	public void insertUser(UserDetailsDto user) {

		Configuration c = new Configuration().configure();
		SessionFactory sessionFactory = c.buildSessionFactory();
		Session session = sessionFactory.openSession();

		session.beginTransaction();

		session.save(user);

		session.flush();

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

	public void insertUserAndVehicle(UserDetailsDto user, Vehicle v) {

		Configuration c = new Configuration().configure();
		SessionFactory sessionFactory = c.buildSessionFactory();
		Session session = sessionFactory.openSession();

		session.beginTransaction();

		session.save(v);
		session.save(user);
		session.flush();

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

	public UserDetailsDto readUser(int i) {
		UserDetailsDto readUser = new UserDetailsDto();
		Configuration c = new Configuration().configure();
		SessionFactory sessionFactory = c.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		readUser = (UserDetailsDto) session.get(UserDetailsDto.class, i);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

		return readUser;
	}
}
