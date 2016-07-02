package com.itbodhi.piccolo;

import org.hibernate.SessionFactory;

import com.itbodhi.piccolo.db.HibernateUtil;

public class PSVM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory fac = HibernateUtil.getSessionAnnotationFactory();
		
		fac.close();
	}

}
