package com.pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
// HCQL with add method for single restriction
		
//		Criteria ct = s.createCriteria(Student.class);
//		ct.add(Restrictions.gt("age", 23));
//		List l = ct.list();
//		Iterator it = l.iterator();
//		while(it.hasNext()) {
//			Student st = (Student)it.next();
//			System.out.println(st);
//		}
		
		
// HCQL with add method for multiple restrictions and sorted
		
//		Criteria ct = s.createCriteria(Student.class);
//		Criterion age = Restrictions.gt("age", 23);
//		Criterion name = Restrictions.like("name", "r%");
//		LogicalExpression le = Restrictions.or(age, name);
//		ct.add(le);
//		ct.addOrder(Order.asc("name"));
//		List l = ct.list();
//		Iterator it = l.iterator();
//		while(it.hasNext()) {
//			Student st = (Student)it.next();
//			System.out.println(st);
//		}
		
// HCQL with projections
		
//		Criteria ct = s.createCriteria(Student.class);
//		ct.setProjection(Projections.rowCount()); // min, max, avg, sum, rowCount, countDistinct
//		Object result = (Object)ct.uniqueResult();
//		System.out.println(result);
		
// HCQL with projections to get single property from rows
		
//		Criteria ct = s.createCriteria(Student.class);
//		ct.setProjection(Projections.property("name"));
//		List l = ct.list();
//		Iterator it = l.iterator();
//		while(it.hasNext()) {
//			String strng = (String)it.next();
//			System.out.println(strng);
//		}
		
// HCQL with projections using ProjectionList to get multiple properties from rows
		
		Criteria ct = s.createCriteria(Student.class);
		ProjectionList p = Projections.projectionList();
		p.add(Projections.property("name"));
		p.add(Projections.property("age"));
		ct.setProjection(p);
		List l = ct.list();
		Iterator it = l.iterator();
		while(it.hasNext()) {
			Object[] obj = (Object[])it.next();
			System.out.println(obj[0] + " " +obj[1]);
		}
		t.commit();
	}

}
