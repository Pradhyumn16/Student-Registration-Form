package com.example.Student_Registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student_Registration.component.Student_Register;
//import com.example.Student_Registration.component.Student_Register;
import com.example.Student_Registration.service.Student_RegisterService;

@RestController
public class Student_RegistrationController 
{
  @Autowired
  private Student_RegisterService student_service;
  
  @RequestMapping("/registers")
  public List<Student_Register> getAllRegistration()
  {
	  return student_service.getAllRegistration();
  }
  
  @RequestMapping(method = RequestMethod.POST, value="/register")
  public void addRegistration(@RequestBody Student_Register register)
  {
	  student_service.addRegistration(register);
  }
  
  @RequestMapping(method = RequestMethod.PUT, value="/register/{id}")
  public void updateRegistration(@PathVariable int Id,@RequestBody Student_Register register)
  {
	  student_service.updateRegistration(Id,register);
  }
  
  public void deleteRegistration(@PathVariable int Id)
  {
	  student_service.deleteRegistration(Id);  
  }
}
