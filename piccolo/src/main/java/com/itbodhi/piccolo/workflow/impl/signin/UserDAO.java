package com.itbodhi.piccolo.workflow.impl.signin;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.itbodhi.piccolo.db.HibernateUtil;
import com.itbodhi.piccolo.entity.Employee1;
import com.itbodhi.piccolo.entity.User;

public class UserDAO {

	public User getUser(String loginid){
		
		User user = null;
		  
		   //get session 
		   SessionFactory sessionFactory = HibernateUtil.buildSessionAnnotationFactory();
		   Session session=sessionFactory.getCurrentSession();
		   
		   //start transaction
		   session.beginTransaction();
		   
		   //save the model object
		   String hql = "from User where loginId = loginid";
		   user=(User)session.createQuery(hql);
		   
		   //commit transaction
		   session.getTransaction().commit();
		   
		  // System.out.println("Employee id= "+ user);
		   
		   //terminate session factory, otherwise program won't end
		   sessionFactory.close();
		
		// Hibernate code to get user
		// from User where loginId = loginid
		
		return user;
	}
}
