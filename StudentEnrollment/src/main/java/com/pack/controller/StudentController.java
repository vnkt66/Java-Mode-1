package com.pack.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pack.model.Gender;
import com.pack.model.Student;
import com.pack.service.StudentService;

@Controller
public class StudentController {
	private static final Logger log = Logger.getLogger(StudentController.class);

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/redirect")
	public String loadRegistrationForm(ModelMap map) {
		log.info("Inside loadRegistration Form");
		Student student = new Student();
		genderInit(map);
		map.addAttribute("studentForm", student);
		return "StudentRegister";
	}

	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public String saveStudent(@Validated @ModelAttribute("studentForm") Student student, BindingResult br,
			ModelMap map) {
		String viewPage;
		log.info(student.getDob());
		if (br.hasErrors()) {
			log.info("Saving Failed");
			genderInit(map);
			viewPage = "StudentRegister";
		} else {
			studentService.saveStudent(student);
			log.info("Saving Succesful");
			List<Student> studentList = studentService.fetchStudent();
			map.addAttribute("studentList", studentList);
			viewPage = "StudentSuccess";
		}
		return viewPage;
	}

	@RequestMapping(value = "/fetchById/{studentId}")
	public String fetchEmployeeById(@PathVariable("studentId") Integer id, ModelMap map) {
		Student student = studentService.fetchStudentById(id);
		log.info("Fetching done");
		genderInit(map);
		map.addAttribute("editForm", student);
		return "StudentUpdate";
	}

	@RequestMapping(value = "/editStudent", method = RequestMethod.POST)
	public String fetchEmployeeById(@Validated @ModelAttribute("editForm") Student student, BindingResult br,
			ModelMap map) {
		String viewPage;
		if (br.hasErrors()) {
			genderInit(map);
			viewPage = "StudentUpdate";
		} else {
			studentService.updateStudent(student);
			List<Student> studentList = studentService.fetchStudent();
			map.addAttribute("studentList", studentList);
			viewPage = "StudentSuccess";
		}
		return viewPage;
	}

	@RequestMapping(value = "/delete/{studentId}")
	public String deleteStudentById(@PathVariable("studentId") Integer id, ModelMap map) {
		Student student = studentService.fetchStudentById(id);
		studentService.deleteStudentById(student, id);
		List<Student> studentList = studentService.fetchStudent();
		map.addAttribute("studentList", studentList);
		return "StudentSuccess";
	}

	void genderInit(ModelMap map) {
		List<Gender> genderList = new ArrayList<Gender>();
		genderList.add(Gender.MALE);
		genderList.add(Gender.FEMALE);
		genderList.add(Gender.OTHER);
		map.addAttribute("genderList", genderList);
	}

}
