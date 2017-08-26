package com.alomsoftware.dao;

import java.util.List;

import com.alomsoftware.model.Student;

public interface StudentDao {

	public void add(Student student);
	public void edit(Student student);
	public void delete(Student studentId);
	
	public Student getStudent(int studentId);
	public List getAllStudnet();
}
