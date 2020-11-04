package com.pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s =sf.openSession();
		Transaction t=s.beginTransaction();
		User2 u1 = new User2();
		User2 u2 = new User2();
		Vehicle2 v1 = new Vehicle2();
		Vehicle2 v2 = new Vehicle2();
			
		v1.setName("honda");
		v1.getUser().add(u1);
		v1.getUser().add(u2);
		
		v2.setName("audi");
		v2.getUser().add(u1);
		v2.getUser().add(u2);
		
		u1.setUsername("sam");
		u1.getVehicle().add(v1);
		u1.getVehicle().add(v2);
		
		u2.setUsername("samu");
		u2.getVehicle().add(v1);
		u2.getVehicle().add(v2);
		
		s.persist(u1);
		s.persist(u2);
		s.persist(v1);
		s.persist(v2);
		
		t.commit();
	}

}
