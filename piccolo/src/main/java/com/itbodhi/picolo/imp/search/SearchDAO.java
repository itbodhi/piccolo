package com.itbodhi.picolo.imp.search;



import org.hibernate.Session;

import com.itbodhi.piccolo.db.HibernateUtil;
import com.itbodhi.piccolo.entity.Search;


public class SearchDAO<SessionFactory> {
public Search getSearch(Object object){
		
	Search sr = new Search();
	
	
	//Get Session
	org.hibernate.SessionFactory sessionFactory = HibernateUtil.getSessionAnnotationFactory();
	Session session = sessionFactory.getCurrentSession();
	//start transaction
	session.beginTransaction();
	//Save the Model object
	sr = (Search)session.get(Search.class,new Integer(1));
	//Commit transaction
	session.getTransaction().commit();
	System.out.println("Event Details="+sr.getEvent());
	
	//terminate session factory, otherwise program won't end
	sessionFactory.close();
	return sr;
}
}
