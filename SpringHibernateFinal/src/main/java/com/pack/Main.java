package com.pack;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Product p = new Product();
		p.setId(1);
		p.setName("Sony");
		p.setPrice(35000);
		s.persist(p);
		t.commit();
	}

}
