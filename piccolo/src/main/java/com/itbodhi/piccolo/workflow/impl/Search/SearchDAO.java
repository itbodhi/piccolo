package com.itbodhi.piccolo.workflow.impl.Search;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.itbodhi.piccolo.db.HibernateUtil;
import com.itbodhi.piccolo.entity.Search;



public class SearchDAO {
public Search getSearch(String Event){
		
Configuration con=new Configuration();
con.configure("hibernate.cfg.xml");
SessionFactory sessionFactory = HibernateUtil.getSessionAnnotationFactory();
Session session = sessionFactory.getCurrentSession();
//start transaction
session.beginTransaction();
//Save the Model object

Search s = (Search)session.get(Search.class,new String(Event));
//Commit transaction
session.getTransaction().commit();
Search sr;

Object OB=session.load(Search.class, new String(Event));
Search DP=(Search)OB;
DP.getEvent();

session.getTransaction().commit();

//terminate session factory, otherwise program won't end
sessionFactory.close();
return(DP);

}
}
