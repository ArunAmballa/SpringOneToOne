package com.arun.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student 
{
	@Id
	private Integer studentId;
	
	private String studentName;
	
	@OneToOne(mappedBy="student",cascade=CascadeType.ALL)
	private Laptop laptop;
	
	
	public Student()
	{
		
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", laptop=" + laptop + "]";
	}

	public Student(Integer studentId, String studentName, Laptop laptop) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.laptop = laptop;
	}

	
	

}
