package com.journaldev.hibernate.main;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.journaldev.hibernate.model.Employee1;
import com.journaldev.hibernate.util.HibernateUtil;

public class GetObjectList {
	public static void main(String[] args) {
		
	
		
		//Get Session
		SessionFactory sessionFactory = HibernateUtil.getSessionAnnotationFactory();
		Session session = sessionFactory.getCurrentSession();
		//start transaction
		session.beginTransaction();
		//Save the Model object
		
		
		List<Employee1> employees = session.createQuery("FROM Employee1").list(); 
		
		for (Iterator iterator = employees.iterator(); iterator.hasNext();){
		 Employee1 employee = (Employee1) iterator.next(); 
		 System.out.print("First Name: " + employee.getName()); 
		 System.out.print("  Last Name: " + employee.getRole()); 
		 System.out.println("  Salary: " + employee.getInsertTime()); 
		}
		
		session.getTransaction().commit();
		//System.out.println("Employee ID="+emp.getName());
		
		//terminate session factory, otherwise program won't end
		sessionFactory.close();
	}
}
