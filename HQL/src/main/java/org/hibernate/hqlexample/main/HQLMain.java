package org.hibernate.hqlexample.main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.hqlexample.dto.UserDetails;

public class HQLMain {

	public static void main(String[] args) {
		Configuration c = new Configuration().configure();
		SessionFactory sessionFactory = c.buildSessionFactory();
		Session session = sessionFactory.openSession();

		session.beginTransaction();
		
		Query query = session.createQuery("from UserDetails where userId = ?");
		query.setInteger(0, 2);
		List<UserDetails> list = query.list();
		
		for(UserDetails d : list) {
			System.out.println(d.getUserName());
		}
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
