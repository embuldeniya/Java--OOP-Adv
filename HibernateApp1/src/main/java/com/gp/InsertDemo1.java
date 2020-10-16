package com.gp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertDemo1 {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		
		Student student = new Student ();
		student.setName("Harry");
//		student.setCourse("Dark Arts");
//		student.setFees(998.99);
		session.save(student);
		
		Transaction tx = session.beginTransaction();
		tx.commit();
		System.out.println("Object saved successfully");
		

	}

}
