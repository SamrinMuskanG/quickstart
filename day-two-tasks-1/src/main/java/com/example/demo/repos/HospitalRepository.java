package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;


import com.example.demo.entity.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
	public List<Hospital> findByHospitalName(String hospitalName);
	 //List<Hospital> delete(String hospitalName);
	//Long deleteByName(String hospitalName );
//	@Transactional
//	@Modifying
//	@Query("update Hospital e set e.id=e.id+1")
//	//int updateIdBy1();

}
