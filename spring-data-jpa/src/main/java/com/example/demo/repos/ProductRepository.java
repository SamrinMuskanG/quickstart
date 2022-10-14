package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
//findByPropertyName	
public List<Product>findByProductName(String qryString);
//public List<Product> findByRatePerUnit(double qryDouble);

@Query(value="select * from product_sep_2022 where rate_per_unit>:rate_per_unit",nativeQuery=true)
@Modifying
//@Transactional
public List<Product> findByRatePerUnitGrtThan(@Param("rate_per_unit") double rate_per_unit);


@Query(value="select * from product_sep_2022 where rate_per_unit>:srch",nativeQuery=true)
@Modifying
@Transactional
public List<Product> findByProductRate(@Param("srch")double srch);


//@Query(value="update product_sep_2022 set rate_per_unit=:rate where id=:id",nativeQuery=true)
//@Modifying
//@Transactional
//public int updateRate(@Param("id")int id,@Param("rate")double rate_per_unit);
}