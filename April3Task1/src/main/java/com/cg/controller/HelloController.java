package com.cg.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/")
public class HelloController {
	
	List<Student> e=new ArrayList<>();
	
	public HelloController() {
		e.add(new Student(1,"satyam","technical","lpu"));
		e.add(new Student(2,"naidu","non-tehcnical","andhra"));
				
	}
	@RequestMapping(value="/{name}", method=RequestMethod.GET)
	public String index(@PathVariable String name) {
		return "Welcome to Sring Boot!" + name;
	}

	@RequestMapping(value="/", method=RequestMethod.GET)
	public List<Student> index() {

		return e ;
	}
	

	@RequestMapping("/greet")
	public String greet() {
		return "Greetings from Spring Boot!";
	}

}