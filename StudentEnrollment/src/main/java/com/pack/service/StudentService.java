package com.pack.service;

import java.util.List;

import com.pack.model.Student;

public interface StudentService {
	public void saveStudent(Student student);

	public List<Student> fetchStudent();

	public Student fetchStudentById(int id);

	public void updateStudent(Student student);

	public void deleteStudentById(Student student, int id);
}
