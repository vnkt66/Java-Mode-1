package com.pack.dao;

import com.pack.model.Employee;
import java.util.List;

public interface EmployeeDao {
	public void saveEmployee(Employee employee);

	public List<Employee> fetchEmployee();

	public Employee fetchEmployeeById(int id);

	public void updateEmployee(Employee employee);

	public void deleteEmployeeById(Employee employee, int id);
}
