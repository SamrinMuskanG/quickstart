package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Hospital;
import com.example.demo.entity.Patient;
import com.example.demo.services.DoctorService;


@SpringBootApplication
public class DayTwoTasks2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(DayTwoTasks2Application.class, args);
		
		Doctor doctor=ctx.getBean(Doctor.class);
		DoctorService service=ctx.getBean(DoctorService.class);
		//service.add(doctor);
		Doctor found=service.findById(9823);
		System.out.println("Doctor Name:"+found.getDoctorName());
		System.out.println("department:"+found.getDepartment());
		System.out.println("List of patients:");
		for(Patient eachPatient: found.getPatients()) {
			System.out.println(eachPatient);
		}
		ctx.close();
	}
	
	
	
	
	@Bean
	public Patient ram() {
		return new Patient(102,"Ramesh Kumar");
	}
	@Bean
	public Patient shyam() {
		return new Patient(105,"Shyam Sundar");
	}
	@Bean
	public Doctor rajesh() {
		Set<Patient> patientList=new HashSet<>();
		patientList.add(ram());
		patientList.add(shyam());
		return new Doctor(9823,"Rajesh","ent",patientList);
	}

}
