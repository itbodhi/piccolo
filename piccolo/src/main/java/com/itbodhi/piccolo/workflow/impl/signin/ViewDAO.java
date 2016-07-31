package  com.itbodhi.piccolo.workflow.impl.EventSubmit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.itbodhi.piccolo.db.HibernateUtil;
import com.itbodhi.piccolo.entity.Eventsubmit;

public class ViewDAO {
	public boolean ViewDetails(View v)
	{
		try
		{
			
		//Get Session
		SessionFactory view = com.db.HibernateUtil.getSessionAnnotationFactory();
		Session session = submit.getCurrentSession();
		//start transaction
		session.beginTransaction();
		//Save the Model object
		session.save(v);
		session.getTransaction().commit();
		
		System.out.println("submit");
		session.close();
		submit.close();
		return true;
		
	}
	
catch (Throwable ex)
		{ System.out.println(ex);
		return false;
		}
	
		}
}
