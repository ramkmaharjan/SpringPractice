package org.hibernate.hqlexample.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.hqlexample.dto.UserDetails;

public class HQLMain {

	public static void main(String[] args) {
		Configuration c = new Configuration().configure();
		SessionFactory sessionFactory = c.buildSessionFactory();
		Session session = sessionFactory.openSession();

		session.beginTransaction();
		
//		Query query = session.createQuery("from UserDetails where userId = ?");
//		query.setInteger(0, 2);
		
//		Query query = session.createQuery("from UserDetails where userId = :userID");
//		query.setInteger("userID", 2);
//		query.setMaxResults(5);
//		query.setFirstResult(0);
		
//		Query query = session.getNamedQuery("findUserDetails");
//		query.setInteger(0, 2);
//		List<UserDetails> list = query.list();
		
		Criteria criteria = session.createCriteria(UserDetails.class);
		//criteria.add(Restrictions.eq("userId", 2)).add(Restrictions.eq("userName","Ramesh"));
		criteria.add(Restrictions.or(Restrictions.eq("userId", 2),Restrictions.eq("userId", 2)));
		
		List<UserDetails> list = (List<UserDetails>)criteria.list();
		for(UserDetails d : list) {
			System.out.println(d.getUserName());
		}
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
