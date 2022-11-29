package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import com.example.demo.entity.Fee;

public interface FeeRepository extends JpaRepository<Fee, Integer> {
//the following method needs to follow DSL(Domain specific Language) Naming conventions
    //public List<Fee> findByBranch(String srchString);
   	public List<Fee>findByYear(String srch);
   	
   	//the following method need not to follow DSL Naming conventions as we are adding @Query Annotation n passing a query
//	@Query(value="select* from tieto_fee where branch=:srchString",nativeQuery=true)
//	 public List<Fee> findByBranchName(@Param("srchString") String srchString); 
   	
   	//JPQL uses className n propertyName instead of TableName and column name
   	@Query(value=" from Fee where branch=:srchString",nativeQuery=false)
	 public List<Fee> findByBranchName(@Param("srchString") String srchString); 
   	
   	@Query(value="update tieto_fee set amount=:revisedAmount where id=:id",nativeQuery=true)
   	@Modifying
   	@Transactional
   	public int updateAmount(@Param("id")int id,@Param("revisedAmount") double amount);
}
