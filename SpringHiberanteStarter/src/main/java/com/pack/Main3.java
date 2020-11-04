package com.pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
// select in native sql query
		
//		NativeQuery q = s.createSQLQuery("select * from student");
//		q.addEntity(Student.class); // can be removed but need to type cast with Object[]
//		List l = q.list();
//		Iterator it = l.iterator();
//		while(it.hasNext()) {
//			Object[] obj = (Object[])it.next(); // used without addEntity()
//			Student st = (Student)it.next(); // used with addEnity()
//			System.out.println(obj[0] + " " + obj[1] + " " + obj[2] + " " + obj[3]);
//			System.out.println(st); // used with addEntity()
//		}
		
// update using named parameters in native sql query
		
//		NativeQuery q = s.createSQLQuery("update student set name=:sname where id=:sid");
//		q.setParameter("sid", 6);
//		q.setParameter("sname", "somuuuuuuuu");
//		int result = q.executeUpdate();
		t.commit();
	}

}
