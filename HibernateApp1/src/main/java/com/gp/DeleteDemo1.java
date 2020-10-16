package com.gp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteDemo1 {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		
		Student student = new Student ();
		student.setId(5);
	
		
		
		session.delete(student);
		
		Transaction tx = session.beginTransaction();
		tx.commit();
		System.out.println("Object deleted successfully");
		

	}

}
