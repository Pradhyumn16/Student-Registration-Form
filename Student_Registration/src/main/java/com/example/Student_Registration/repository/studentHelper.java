package com.example.Student_Registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student_Registration.component.Student_Register;

public interface studentHelper extends JpaRepository<Student_Register,Integer>{

}
