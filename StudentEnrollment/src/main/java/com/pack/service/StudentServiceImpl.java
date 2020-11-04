package com.pack.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pack.controller.StudentController;
import com.pack.dao.StudentDao;

import com.pack.model.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	private static final Logger log = Logger.getLogger(StudentServiceImpl.class);

	@Autowired
	private StudentDao studentDao;

	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		log.info("SaveStudent Service");
		studentDao.saveStudent(student);
	}

	@Override
	public List<Student> fetchStudent() {
		// TODO Auto-generated method stub
		List<Student> studentList = studentDao.fetchStudent();
		return studentList;
	}

	@Override
	public Student fetchStudentById(int id) {
		// TODO Auto-generated method stub
		Student student = studentDao.fetchStudentById(id);
		return student;
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.updateStudent(student);
	}

	@Override
	public void deleteStudentById(Student student, int id) {
		// TODO Auto-generated method stub
		studentDao.deleteStudentById(student, id);
	}

}
