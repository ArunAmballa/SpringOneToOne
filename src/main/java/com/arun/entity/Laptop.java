package com.arun.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Laptop 
{
	@Id
	private Integer laptopId;
	
	private String laptopName;
	
	@OneToOne
	private Student student;
	
	public Laptop()
	{
		
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopName=" + laptopName + ", student=" + student + "]";
	}

	public Integer getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(Integer laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Laptop(Integer laptopId, String laptopName, Student student) {
		super();
		this.laptopId = laptopId;
		this.laptopName = laptopName;
		this.student = student;
	}
	
	

}
