package com.alomsoftware.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)//for auto number generate
	private int studentId;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private int yearLevel;
	
	public Student(){}
	
	public Student(int studentId, String firstName, String lastName, int yearLevel) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearLevel = yearLevel;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getYearLevel() {
		return yearLevel;
	}


	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}
	
	
	
}
