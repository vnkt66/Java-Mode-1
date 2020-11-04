package com.pack.dao;

import com.pack.model.Student;

import java.util.List;

public interface StudentDao {
	public void saveStudent(Student student);

	public List<Student> fetchStudent();

	public Student fetchStudentById(int id);

	public void updateStudent(Student student);

	public void deleteStudentById(Student student, int id);
}
