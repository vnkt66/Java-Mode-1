package com.pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration ac = new AnnotationConfiguration().configure();
		SessionFactory sf = ac.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
//		Person p = new Person();
//		p.setId(3);
//		p.setName("sam");
//		p.setAge(null);
//		p.setRole("web developer");
//		s.persist(p);
		Person p1 = (Person) s.get(Person.class, 1);
		p1.setName("sam suthar");
		s.update(p1);
		t.commit();
	}

}
