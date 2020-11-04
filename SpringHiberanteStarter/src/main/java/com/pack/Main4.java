package com.pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		SessionFactory sd = c.buildSessionFactory();
		Session s = sd.openSession();
		Transaction t = s.beginTransaction();
		// named queries using xml
		Query q = s.getNamedQuery("allh");
		q.setParameter("cid", 4);
		Student s1 = (Student)q.uniqueResult();
		System.out.println(s1);
		t.commit();
	}

}
