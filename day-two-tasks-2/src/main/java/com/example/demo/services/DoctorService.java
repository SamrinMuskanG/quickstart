package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
//import com.example.demo.entity.Hospital;
import com.example.demo.repos.DoctorRepository;
//import com.example.demo.repos.HospitalRepository;

import lombok.AllArgsConstructor;
import lombok.Data;


@Service
@Data
@AllArgsConstructor
public class DoctorService {
private DoctorRepository repo;
	
	
	
	public Doctor add(Doctor entity) {
	
		return this.repo.save(entity);
		
	}
	public Doctor findById(int id) {
		return this.repo.findById(id).orElseThrow(()-> new ElementNotFoundException("ERR-102","Element Not found"));
	}
//	public List<Doctor>findAll(){
//		return this.repo.findAll();
//		
//	}
}
