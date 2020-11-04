package com.pack;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		SessionFactory sd = c.buildSessionFactory();
		Session s = sd.openSession();
		Transaction t = s.beginTransaction();
//		Book b = new Book();
//		b.setName("narnia");
//		b.setPrice(300.0);
//		s.persist(b);
//		Query q = s.getNamedQuery("findBook");
//		q.setParameter("bid", 1);
//		Book b1 = (Book)q.uniqueResult();
//		System.out.println(b1);
//		q = s.getNamedQuery("findBookPrice");
//		Double price = (Double)q.uniqueResult();
//		System.out.println(price);
		
		// Native Queries
		Query q = s.getNamedQuery("findAll");
		Book b1 = (Book)q.uniqueResult();
		System.out.println(b1);
		q = s.getNamedQuery("findById");
		q.setParameter("bid", 1);
		Book b2 = (Book)q.uniqueResult();
		System.out.println(b2);
		t.commit();
	}

}
