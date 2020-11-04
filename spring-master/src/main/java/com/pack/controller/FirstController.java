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

import com.pack.model.Employee;
import com.pack.model.Login;

@Controller
public class FirstController {
    @RequestMapping(value="/first")
	public String show(){
		return "static-page";
	}
    @RequestMapping(value="/reg")
    public String regs(ModelMap m){
    	Employee e = new Employee();
    	m.addAttribute("emp",e);
    	return "register";
    }
    @RequestMapping(value="/save",method=RequestMethod.POST)
    public String saveData(@Validated @ModelAttribute("emp")Employee e1,
    		BindingResult result,ModelMap m1){
    	String finalResult;
        if(result.hasErrors()){
        	finalResult="register"; 
        }
        else{
    	m1.addAttribute("empl", e1);
    	finalResult="success";
        }
        return finalResult;
    }
    
    @RequestMapping(value="/dynamic")
    public String show2(@RequestParam("name")String n1,
    	@RequestParam("age") Integer a1,ModelMap m1){
    	  m1.addAttribute("myName",n1);
    	  m1.addAttribute("myAge", a1);
    	  return "param";
    }
    
    @RequestMapping(value="/fetch/{name}/{id}")
    public String show3(@PathVariable("name") String name1,
    		@PathVariable("id")int eid,ModelMap m2){
    	m2.addAttribute("name", name1);
    	m2.addAttribute("empid", eid);
    	return "pathParam";
    }
    @RequestMapping(value="/login")
    public String loginForm(ModelMap m){
    	Login l=new Login();
    	m.addAttribute("login",l);
    	return "login";
    }
    @RequestMapping(value="/check",method=RequestMethod.POST)
    public String loginCheck(@Validated @ModelAttribute("login")Login l,
    		BindingResult result,ModelMap m1){
    	String finalResult;
        if(result.hasErrors()){
        	finalResult="login"; 
        }
        else{
    	m1.addAttribute("login", l);
    	finalResult="success1";
        }
        return finalResult;
    }
    
}
