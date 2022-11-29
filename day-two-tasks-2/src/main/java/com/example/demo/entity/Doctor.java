package com.example.demo.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

//@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Data


@Entity
@Table(name="doctor_sep_2022")
public class Doctor {
	
	@Id
 private int id;
	
	@Column(name="doctor_name")
 private String doctorName;
	
	@Column(name="department")
 private String department;//eye,skin,heart,dental
 
	//one doctor has many patients
	 //one to many relations
	@OneToMany(targetEntity=Patient.class,fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="doctor_ref",referencedColumnName="id")
	 Set<Patient>patients;
 


//public Doctor(int id, String doctorName, String department) {
//		super();
//		this.id = id;
//		this.doctorName = doctorName;
//		this.department = department;
//	}






}
