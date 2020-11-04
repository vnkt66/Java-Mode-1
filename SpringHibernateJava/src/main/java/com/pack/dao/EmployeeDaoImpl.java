package com.pack.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pack.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    private static final Logger log = Logger.getLogger(EmployeeDaoImpl.class);
	@Autowired
	private SessionFactory sessionFactory;

	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		log.info("saveEmployee Dao");
		sessionFactory.getCurrentSession().save(employee);
	}

	public List<Employee> fetchEmployee() {
		// TODO Auto-generated method stub
		Query query = sessionFactory.getCurrentSession().createQuery("from Employee emp");
		List<Employee> empList = query.list();
		return empList;
	}

	public Employee fetchEmployeeById(int id) {
		// TODO Auto-generated method stub
		Employee employee = (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
		return employee;
	}

	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(employee);
	}

	public void deleteEmployeeById(Employee employee, int id) {
		// TODO Auto-generated method stub
//      using normal delete method from session interface
//		sessionFactory.getCurrentSession().delete(employee);
//      using hql query to delete employee based on id
		Query query = sessionFactory.getCurrentSession().createQuery("delete from Employee emp where id=:eid");
		query.setParameter("eid", id);
		query.executeUpdate();
	}

}
