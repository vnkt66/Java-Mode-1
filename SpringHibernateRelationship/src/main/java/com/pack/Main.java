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
		Vehicle v = new Vehicle();
		v.setName("honda");
		User u = new User();
		u.setUsername("sam");
		u.setVehicle(v);
		s.persist(u);
		t.commit();
	}

}
