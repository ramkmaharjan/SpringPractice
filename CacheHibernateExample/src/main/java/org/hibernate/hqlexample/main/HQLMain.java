package org.hibernate.hqlexample.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.hqlexample.dto.UserDetails;

public class HQLMain {

	public static void main(String[] args) {
		Configuration c = new Configuration().configure();
		SessionFactory sessionFactory = c.buildSessionFactory();
		Session session = sessionFactory.openSession();

		session.beginTransaction();
	
		//1st Search query
		UserDetails user1 = (UserDetails) session.get(UserDetails.class,2);
		
		//2nd Search query
		//This one is not called because of one level cache.
		UserDetails user2 = (UserDetails) session.get(UserDetails.class,2);
		user2.setUserName("Lali");
		System.out.println(user2.getUserName());
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
