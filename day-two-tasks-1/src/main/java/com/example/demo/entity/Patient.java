package com.example.demo.entity;

import javax.persistence.Column;

public class Patient {
@Column(name="Patient_Id")	
int patientId;
@Column(name="Patient_Name")
String patientName;
}
