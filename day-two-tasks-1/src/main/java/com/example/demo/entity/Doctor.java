package com.example.demo.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Id;

public class Doctor {
	
 private int id;
	
 private String doctorName;
	
 private String department;//eye,skin,heart,dental
 
 //one doctor has many patients
 //one to many relations
 Set<Patient>patients;
}
