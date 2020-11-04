package com.pack;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

@SuppressWarnings("deprecation")
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration ac = new AnnotationConfiguration().configure();
		SessionFactory sf = ac.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
//		Employee e = new Employee();
//		e.setId(2);
//		e.setBranch("chennai");
//		e.setFirstname("sam");
//		e.setLastname("suthar");
//		e.setSalary(50000);
//		s.persist(e);
		EmployeeId eid = new EmployeeId(1, "chennai");
		Employee e = (Employee)s.get(Employee.class, eid);
		System.out.println(e);
		t.commit();
	}

}
