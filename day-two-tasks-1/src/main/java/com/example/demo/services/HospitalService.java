package com.example.demo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Hospital;
import com.example.demo.repos.HospitalRepository;

@Service
public class HospitalService {
	private HospitalRepository repo;
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public HospitalService(HospitalRepository repo) {
		super();
		this.repo=repo;
		
	}
	public Hospital save(Hospital entity) {
		return this.repo.save(entity);
	}
	public List<Hospital>findAll(){
		return this.repo.findAll();
		
	}
//	public List<Hospital>findByHospitalName(String srchString){
//		return this.repo.findByHospitalName(srchString);
//	}
//	public List<Hospital> deleteByHospitalName(String srchString) {
//		return this.repo.deleteByHospitalName(srchString);
//	}
//	 
	    public Hospital update(Hospital entity){
	        return  this.repo.save(entity);
	    }
//	    
	    public void delete(int id){
	         this.repo.deleteById(id);
	    }
	    public List<Hospital>findByHospitalName(String st){
	    	return this.repo.findByHospitalName(st);
	    }
	
	

}
