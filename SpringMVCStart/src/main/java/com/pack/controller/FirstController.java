package com.pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pack.bean.Employee;
import com.pack.bean.Login;

@Controller
public class FirstController {
	@RequestMapping(value="/home")
	public String home() {
		return "home";
	}
	@RequestMapping(value="/register")
	public String register(ModelMap m) {
		Employee e = new Employee();
		m.addAttribute("emp", e);
		return "register";
	}
	@RequestMapping(value="/param")
	public String param(@RequestParam("name")String name, @RequestParam("role")String role, ModelMap m) {
		m.addAttribute("name", name);
		m.addAttribute("role", role);
		return "param";
	}
	@RequestMapping(value="/login")
	public String login(ModelMap m) {
		Login l = new Login();
		m.addAttribute("login", l);
		return "login";
	}
	
	@RequestMapping(value="/fetch/{name}/{id}")
	public String fetch(@PathVariable("name")String name, @PathVariable("id")Integer id, ModelMap m) {
		m.addAttribute("name", name);
		m.addAttribute("id", id);
		return "pathParam";
	}
	@RequestMapping(value="/submit", method=RequestMethod.POST)
	public String save(@Validated @ModelAttribute("emp") Employee e, BindingResult br, ModelMap m) {
		String result;
		if(br.hasErrors()) {
			result = "register";
		} else {
			m.addAttribute("emp", e);
			result = "success"; 
		}
		return result;
	}
}
