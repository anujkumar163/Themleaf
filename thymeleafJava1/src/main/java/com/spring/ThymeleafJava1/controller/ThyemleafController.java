package com.spring.ThymeleafJava1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ThyemleafController {
	
	@RequestMapping("/variable_expression")
	public String variable_expression(Model model) {
		Student student = new Student(1, "mike","rewa", "mike@gmail.com");
		model.addAttribute("student", student);
		model.addAttribute("user", "mike");
		return "variable_expression";
	}
	
	@RequestMapping("/select_expression")
	public String select_expression(Model model) {
		Student student = new Student(1, "mike","rewa", "mike@gmail.com");
		model.addAttribute("student", student);
		return "select_expression";
	}
	
	@RequestMapping("/message-expression")
	public String message_expression() {
		return "message-expression";
	}
	
	
	@RequestMapping("/link-expression")
	public String linkExpression(Model model) {
		model.addAttribute("id", 1);
		return "link_expression";
	}
	
	@RequestMapping("/fragmnt-expression")
	public String fragementExpression() {
		
		return "fragmnt-expression";
	}
	
	@RequestMapping("/ifunless")
	public String ifUnlise(ModelMap model) {
		User u1 = new User("mike", "Admin", "mike@gmail.com");
		User u2 = new User("stalin", "Admin", "stalin@gmail.com");
		User u3 = new User("smith", "User", "smith@gmail.com");
		
		List<User> user = new ArrayList<User>();
		user.add(u1);
		user.add(u2);
		user.add(u3);
		
		model.addAttribute("user", user);
		
		
		return "ifunless";
	}
	
	@RequestMapping("/switchcase")
	public String switchCase(ModelMap model) {
		User user = new User("mike","Admin", "mike@gmail.com");
		model.addAttribute("user", user);
		return "switchcase";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
