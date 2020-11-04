package com.pack;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		AnnotationConfiguration ac = new AnnotationConfiguration().configure();
		SessionFactory sd = ac.buildSessionFactory();
		Session s = sd.openSession();
		Transaction t = s.beginTransaction();
		Employee e = new Employee();
		e.setName("sam");
		e.setAddress("chennai");
		Date d = new Date();
		e.setJoined(d);
		e.setGender(Gender.MALE);
		e.setStatus(true);
		s.persist(e);
		t.commit();
	}

}
