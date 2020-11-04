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
//		Product p = new Product();
//		p.setName("Vivo");
//		p.setPrice(35000);
//		s.persist(p);
//		t.commit();
		Product p1 = (Product) s.get(Product.class, 1);
		s.close();
		p1.setPrice(22000);
		Session s1 = sf.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.merge(p1);
		t1.commit();
	}

}
