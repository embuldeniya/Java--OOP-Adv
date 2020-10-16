package com.gp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectDemo2 {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		
		
		Query query = session.createQuery("From Student");
		List <Student> list = query.list();
		
		System.out.println(list);
	
		

	}

}
