package com.pack.service;

import java.util.List;

import com.pack.model.Employee;

public interface EmployeeService {
	public void saveEmployee(Employee employee);

	public List<Employee> fetchEmployee();

	public Employee fetchEmployeeById(int id);

	public void updateEmployee(Employee employee);

	public void deleteEmployeeById(Employee employee, int id);
}
