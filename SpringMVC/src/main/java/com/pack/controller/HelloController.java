package com.pack.controller;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public ModelAndView hello() {
		ModelAndView m = new ModelAndView("hello");
		m.addObject("name", "Ram");
		m.addObject("role", "Web Developer");
		return m;
	}
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String welcome(ModelMap m) {
		m.addAttribute("name", "Ram");
		m.addAttribute("role", "Web Developer");
		return "welcome";
	}
	@RequestMapping(value="/exit", method=RequestMethod.GET)
	public String exit(Map<String, String> m) {
		m.put("name", "Ram");
		m.put("role", "Web Developer");
		return "exit";
	}
}
