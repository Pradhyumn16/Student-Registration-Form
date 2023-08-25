package com.example.Student_Registration.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student_Registration.component.Student_Register;
import com.example.Student_Registration.repository.Student_RegisterRepository;
import com.example.Student_Registration.repository.studentHelper;

@Service
public class Student_RegisterService 
{
  @Autowired
  public Student_RegisterRepository Student_Repo;
  public studentHelper helper;
  
  public List<Student_Register> getAllRegistration()
  { 
	  List<Student_Register> register = new ArrayList<>();
	  Student_Repo.findAll().forEach(register::add);
	  return register;
  }
  
  public void addRegistration(Student_Register register) {
	Student_Repo.save(register);
	
}
  public void updateRegistration(int Id,Student_Register register) {
		Student_Repo.save(register);
		

}
  public void deleteRegistration(int Id) {
		Student_Repo.deleteById(Id);
		helper.
		

}
}
  
