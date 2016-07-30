package com.itbodhi.piccolo.workflow.impl.Search;

import java.util.ArrayList;
import java.util.List;

import javax.naming.ConfigurationException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.itbodhi.piccolo.db.HibernateUtil;
import com.itbodhi.piccolo.entity.Search;
import com.itbodhi.piccolo.entity.base.SearchBase;;


@SuppressWarnings("hiding")
public class SearchDAO {
public Search getSearch(String Event, String Location){
	
	SearchDAO sd=new SearchDAO();
		
	Search sr = new Search();
	
	//Get Session
	SessionFactory sessionFactory = HibernateUtil.getSessionAnnotationFactory();
	Session session = sessionFactory.getCurrentSession();
	//start transaction
	session.beginTransaction();
	//Save the Model object
	sr = (Search)session.get(Search.class,new Integer(1));
	//Commit transaction
	session.getTransaction();
	
	List<Search> allFound = _sd.getSearch(Event);
	ArrayList<SearchBase> Search = new ArrayList<SearchBase>();
	
	
	for (Search b : allFound)
    {
       Search bm = new Search();
       bm.setEvent(b.getEvent());
       bm.setLocation(b.getLocation());
       
       Search.add(bm);
    }
	
	//terminate session factory, otherwise program won't end
	session.close();
}
}
