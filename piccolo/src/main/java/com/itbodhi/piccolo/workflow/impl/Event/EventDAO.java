package  com.itbodhi.piccolo.workflow.impl.Event;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.itbodhi.piccolo.db.HibernateUtil;
import com.itbodhi.piccolo.entity.Event;

public class EventDAO {
	public boolean SubmitDetails(Event sb)
	{
		try
		{
			
		//Get Session
		SessionFactory submit = com.db.HibernateUtil.getSessionAnnotationFactory();
		Session session = submit.getCurrentSession();
		//start transaction
		session.beginTransaction();
		//Save the Model object
		session.save(sb);
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

