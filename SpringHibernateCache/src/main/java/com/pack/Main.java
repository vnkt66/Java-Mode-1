package com.pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
//		Employee e = new Employee();
//		e.setId(1);
//		e.setName("sam");
//		e.setSalary(22000.0);
//		s.persist(e);
		
		// first loads from db and stores in 1st level cache and second level cache
		Employee e1 = s.load(Employee.class, 1);
		System.out.println(e1);
		t.commit();
		// after closing session 1st level cache is cleared
		s.close();
		
		Session s1 = sf.openSession();
		Transaction t1 = s1.beginTransaction();
		// loads from second level cache
		Employee e2 = s1.load(Employee.class, 1);
		System.out.println(e2);
		t1.commit();
		s1.close();
	}

}
