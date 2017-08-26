package com.alomsoftware.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alomsoftware.model.Student;
import com.alomsoftware.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map){
		Student student = new Student();
		
		map.put("studnet", student);
		map.put("studentList", studentService.getAllStudnet());
		return "studnet";		
	}

}
