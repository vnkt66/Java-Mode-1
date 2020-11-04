package com.pack.controller;

import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pack.model.Employee;
import com.pack.service.EmployeeService;

@Controller
public class EmployeeController {
	private static final Logger log = Logger.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/redirect")
	public String loadRegistrationForm(ModelMap map) {
		log.info("Inside loadRegistration Form");
		Employee employee = new Employee();
		map.addAttribute("empForm", employee);
		return "EmployeeRegister";
	}

	@RequestMapping(value = "/saveEmp", method = RequestMethod.POST)
	public String saveEmployee(@Validated @ModelAttribute("empForm") Employee employee, BindingResult br,
			ModelMap map) {
		String viewPage;
		log.info(employee.getDoj());
		if (br.hasErrors()) {
			log.info("Saving Failed");
			viewPage = "EmployeeRegister";
		} else {
			Random r = new Random();
			int empid = r.nextInt(500000);
			employee.setId(empid);
			employeeService.saveEmployee(employee);
			log.info("Saving Succesful");
			List<Employee> empList = employeeService.fetchEmployee();
			map.addAttribute("employeeList", empList);
			viewPage = "EmployeeSuccess";
		}
		return viewPage;
	}

	@RequestMapping(value = "/fetchById/{empId}")
	public String fetchEmployeeById(@PathVariable("empId") Integer id, ModelMap map) {
		Employee employee = employeeService.fetchEmployeeById(id);
		log.info("Fetching done");
		map.addAttribute("editForm", employee);
		return "EmployeeUpdate";
	}

	@RequestMapping(value = "/editEmp", method = RequestMethod.POST)
	public String fetchEmployeeById(@Validated @ModelAttribute("editForm") Employee employee, BindingResult br,
			ModelMap map) {
		String viewPage;
		if (br.hasErrors()) {
			viewPage = "EmployeeUpdate";
		} else {
			employeeService.updateEmployee(employee);
			List<Employee> empList = employeeService.fetchEmployee();
			map.addAttribute("employeeList", empList);
			viewPage = "EmployeeSuccess";
		}
		return viewPage;
	}

	@RequestMapping(value = "/delete/{empId}")
	public String deleteEmployeeById(@PathVariable("empId") Integer id, ModelMap map) {
		Employee employee = employeeService.fetchEmployeeById(id);
		employeeService.deleteEmployeeById(employee, id);
		return "redirect:/fetch";
	}
	
	@RequestMapping(value = "/fetch")
	public String fetch(ModelMap map) {
		List<Employee> empList = employeeService.fetchEmployee();
		map.addAttribute("employeeList", empList);
		return "EmployeeSuccess";
	}

}
