package com.pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s =sf.openSession();
		Transaction t=s.beginTransaction();
		Vehicle1 v1 = new Vehicle1();
		v1.setName("honda");
		Vehicle1 v2 = new Vehicle1();
		v2.setName("audi");
		User1 u = new User1();
		u.setUsername("sam");
		u.getVehicle().add(v1);
		u.getVehicle().add(v2);
		s.persist(u);
		t.commit();
	}

}
