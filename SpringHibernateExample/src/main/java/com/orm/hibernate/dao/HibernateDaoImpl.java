package com.orm.hibernate.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.orm.hibernate.model.Circle;

@Repository
public class HibernateDaoImpl  {

	@Autowired
	private SessionFactory sessionFactory;
	
	public int getCircleCount() {
		int result = 0;
		
	
		
		String hql ="select count(c) from Circle c";
		Query query = sessionFactory.openSession().createQuery(hql);
		result = ((Long)query.uniqueResult()).intValue();
		
		
		
		return result;
	}
	
	public void saveCircle() {
		
		Circle c = new Circle();
		c.setId(6);
		c.setName("Hello");
		sessionFactory.openSession().save(c);
	}

	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
