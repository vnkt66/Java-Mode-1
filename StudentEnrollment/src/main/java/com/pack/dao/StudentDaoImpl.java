package com.pack.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pack.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	private static final Logger log = Logger.getLogger(StudentDaoImpl.class);
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		log.info("saveStudent Dao");
		sessionFactory.getCurrentSession().save(student);
	}

	@Override
	public List<Student> fetchStudent() {
		// TODO Auto-generated method stub
		Query query = sessionFactory.getCurrentSession().createQuery("from Student student");
		List<Student> studentList = query.list();
		return studentList;
	}

	@Override
	public Student fetchStudentById(int id) {
		// TODO Auto-generated method stub
		Student student = (Student) sessionFactory.getCurrentSession().get(Student.class, id);
		return student;
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(student);
	}

	@Override
	public void deleteStudentById(Student student, int id) {
		// TODO Auto-generated method stub
//      using normal delete method from session interface
//		sessionFactory.getCurrentSession().delete(employee);
//      using hql query to delete employee based on id
		Query query = sessionFactory.getCurrentSession().createQuery("delete from Student student where id=:sid");
		query.setParameter("sid", id);
		query.executeUpdate();
	}

}
