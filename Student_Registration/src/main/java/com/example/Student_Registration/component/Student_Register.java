package com.example.Student_Registration.component;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Student_Registration")
public class Student_Register 
{   
	@Id
	private int Student_Id;
	
	private String Name;
	
	public Student_Register() {
		super();
	}
	public Student_Register(int student_Id, String name) {
		super();
		Student_Id = student_Id;
		Name = name;
	}
	public int getSudent_Id() {
		return Student_Id;
	}
	public void setSudent_Id(int student_Id) {
		Student_Id = student_Id;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
}
