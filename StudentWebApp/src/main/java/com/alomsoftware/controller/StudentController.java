package com.alomsoftware.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alomsoftware.model.Student;
import com.alomsoftware.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map){
		Student student = new Student();
		
		map.put("student", student);
		map.put("studentList", studentService.getAllStudnet());
		return "student";		
	}
	
	@RequestMapping(value="/student.do", method=RequestMethod.POST)
	public String doAction(@ModelAttribute Student student, BindingResult result, @RequestParam String action, Map<String, Object> map){
		
		Student studentResult = new Student();
		switch(action.toLowerCase()){//only in java 7 i can put String 
		case "add":
			studentService.add(student);
			studentResult = student;
			break;
		case "edit":
			studentService.edit(student);
			studentResult = student;
			break;
		case "delete":
			studentService.delete(student.getStudentId());
			studentResult = new Student();
			break;
		case "search":
			Student searchedStudent = studentService.getStudent(student.getStudentId());
			studentResult = searchedStudent!= null ? searchedStudent : new Student();
			break;		
		}
		map.put("student", studentResult);
		map.put("studentList", studentService.getAllStudnet());
		return "student";
	}

}
