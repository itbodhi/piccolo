package  com.itbodhi.piccolo.workflow.impl.EventSubmit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.itbodhi.piccolo.db.HibernateUtil;
import com.itbodhi.piccolo.entity.Eventsubmit;

public class EventSubmitDAO {
	public boolean SubmitDetails(Eventsubmit sb)
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

