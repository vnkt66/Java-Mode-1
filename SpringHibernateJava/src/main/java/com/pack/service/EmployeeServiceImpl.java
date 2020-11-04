package com.pack.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pack.controller.EmployeeController;
import com.pack.dao.EmployeeDao;
import com.pack.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	private static final Logger log = Logger.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeDao employeeDao;

	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		log.info("SaveEmployee Service");
		employeeDao.saveEmployee(employee);
	}

	public List<Employee> fetchEmployee() {
		// TODO Auto-generated method stub
		List<Employee> empList = employeeDao.fetchEmployee();
		return empList;
	}

	public Employee fetchEmployeeById(int id) {
		// TODO Auto-generated method stub
		Employee employee = employeeDao.fetchEmployeeById(id);
		return employee;
	}

	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.updateEmployee(employee);
	}

	public void deleteEmployeeById(Employee employee, int id) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmployeeById(employee, id);
	}

}
