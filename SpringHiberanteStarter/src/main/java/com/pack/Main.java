package com.pack;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		try {
			Configuration c = new Configuration().configure();
			SessionFactory sf = c.buildSessionFactory();
			Session s = sf.openSession();
			Transaction t = s.beginTransaction();
			/*
			 * Student st = new Student(); st.setId(4); st.setName("ram"); st.setAge(23);
			 * st.setDepartment("Apps&Delivery"); // s.persist(st); Integer i = (Integer)
			 * s.save(st); System.out.println("Success" + i);
			 */
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your ID to Change Your Age");
			Integer id = Integer.parseInt(sc.nextLine());
			/*
			 * System.out.println("Enter your Age"); int age =
			 * Integer.parseInt(sc.nextLine()); Student st1 = s.get(Student.class, id);
			 * st1.setAge(age);; s.update(st1);
			 */
			Student st1 = s.load(Student.class, id);
			s.delete(st1);
			sc.close(); 
			t.commit();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
