package com.journaldev.hibernate.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.journaldev.hibernate.model.Employee1;
import com.journaldev.hibernate.util.HibernateUtil;

public class GetObject {

	public static void main(String[] args) {
		Employee1 emp = new Employee1();
	
		
		//Get Session
		SessionFactory sessionFactory = HibernateUtil.getSessionAnnotationFactory();
		Session session = sessionFactory.getCurrentSession();
		//start transaction
		session.beginTransaction();
		//Save the Model object
		emp = (Employee1)session.get(Employee1.class, 19);
		//Commit transaction
		session.getTransaction().commit();
		System.out.println("Employee ID="+emp.getName());
		
		//terminate session factory, otherwise program won't end
		sessionFactory.close();
	}
}
