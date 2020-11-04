package com.pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main1 {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s =sf.openSession();
		Transaction t=s.beginTransaction();
		Employee1 e=new Employee1();
		e.setName("Ram");
		RegularEmployee1 r=new RegularEmployee1();
		r.setName("Sam");
		r.setSalary(20000.0);
		r.setBonus(20.0);
		ContractEmployee1 c=new ContractEmployee1();
		c.setName("Jam");
		c.setPay_per_hour(20);
		c.setContract_duration("2 Years");
		s.persist(e);
		s.persist(r);
		s.persist(c);
		t.commit();
	}

}
