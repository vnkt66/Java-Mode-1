package com.pack;

import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

@SuppressWarnings("rawtypes")
public class Main1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

// select multiple objects of class

//		Query q = s.createQuery("from Student st");
//		Query q = s.createQuery("select st from Student st");
//		List l = q.list();
//		Iterator it = l.iterator();
//		while(it.hasNext()) {
//			Student s1 = (Student)it.next();
//			System.out.println(s1);
//		}

// select multiple properties

//		Query q = s.createQuery("select st.age, st.name from Student st");
//		List l = q.list();
//		Iterator it = l.iterator();
//		while(it.hasNext()) {
//			Object[] o = (Object[])it.next();
//			System.out.println(o[0] + " " + o[1]);
//		}

// select single property

//		Query q = s.createQuery("select st.age from Student st");
//		List l = q.list();
//		Iterator it = l.iterator();
//		while(it.hasNext()) {
//			Integer i = (Integer)it.next();
//			System.out.println(i);
//		}

// select single object

//		Query q = s.createQuery("select st from Student st where st.id=6");
//
//		Student s1 = (Student) q.uniqueResult();
//		System.out.println(s1);
		
// select single property from single object

//		Query q = s.createQuery("select st.name from Student st where st.id=6");
//
//		String strng = (String) q.uniqueResult();
//		System.out.println(strng);
		
// select single object using named parameter at runtime
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your id");
//		int id = Integer.parseInt(sc.nextLine());
//		Query q = s.createQuery("select st from Student st where st.id=:sid");
//		q.setParameter("sid", id);
//		Student s1 = (Student)q.uniqueResult();
//		System.out.println(s1);
		
// select single object using positional parameter at runtime
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your id");
//		int id = Integer.parseInt(sc.nextLine());
//		Query q = s.createQuery("select st.name from Student st where st.id=?0 and st.name=?1");
//		q.setParameter(0, id);
//		q.setParameter(1, "hum");
//		String strng = (String)q.uniqueResult();
//		System.out.println(strng);
		
// update single object using named parameter at runtime
		
//		Query q = s.createQuery("update Student st set st.name=:sname where st.id=:sid");
//		q.setParameter("sid", 6);
//		q.setParameter("sname", "sanju");
//		int result = q.executeUpdate();
//		System.out.println(result);
		
// pagination
		
//		Query q = s.createQuery("from Student st");
//		q.setFirstResult(1);
//		q.setMaxResults(4);
//		List l = q.list();
//		Iterator it = l.iterator();
//		while(it.hasNext()) {
//			Student st = (Student)it.next();
//			System.out.println(st);
//		}
		t.commit();
	}

}
