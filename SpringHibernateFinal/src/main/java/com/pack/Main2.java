package com.pack;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

@SuppressWarnings("deprecation")
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration ac = new AnnotationConfiguration().configure();
		SessionFactory sf = ac.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		EmployeeIdOne eid = new EmployeeIdOne(1, "chennai");
//		Employee1 e = new Employee1();
//		e.setId(eid);
//		e.setFirstname("sam");
//		e.setLastname("suthar");
//		e.setSalary(50000);
//		s.persist(e);
		Employee1 e = (Employee1)s.get(Employee1.class, eid);
		System.out.println(e);
		t.commit();
	}

}
