package com.itbodhi.piccolo.workflow.impl.ratereview;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.itbodhi.piccolo.db.HibernateUtil;
import com.itbodhi.piccolo.entity.RateReview;

public class RateReviewDAO {

	public boolean setRateReview(RateReview rrb)
	{
		try{
			
			SessionFactory SF = HibernateUtil.getSessionAnnotationFactory();
			Session session=SF.getCurrentSession();
			
			session.beginTransaction();
			session.save(rrb);
			session.getTransaction().commit();
	    	
	    	System.out.println("Rate inserted");
			session.close();
		    SF.close();
			return true;   
			
		}
		catch(Throwable ex)
		{
			System.out.println(ex);
			return false;
		}
	}
}
