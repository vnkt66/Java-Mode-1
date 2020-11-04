package com.pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s =sf.openSession();
		Transaction t=s.beginTransaction();
		Employee e=new Employee();
		e.setName("Ram");
		RegularEmployee r=new RegularEmployee();
		r.setName("Sam");
		r.setSalary(20000.0);
		r.setBonus(20.0);
		ContractEmployee c=new ContractEmployee();
		c.setName("Somu");
		c.setPay_per_hour(20);
		c.setDuration("2 years");
		s.persist(e);
		s.persist(r);
		s.persist(c);
		t.commit();
	}

}
