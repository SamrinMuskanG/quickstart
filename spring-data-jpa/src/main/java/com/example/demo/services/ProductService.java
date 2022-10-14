package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@Service

public class ProductService {
	
	private ProductRepository repo;
	
	@Autowired
	public ProductService(ProductRepository repo) {
		super();
		this.repo = repo;
	}
	
	
	
	public Product add(Product entity) {
		return this.repo.save(entity);
	}
	public Product save(Product entity) {
		
		return this.repo.save(entity);
	}
	
	public List<Product>findAll(){
		
		return this.repo.findAll();
	}
	public List<Product> findByProductName(String srchString){
		return this.repo.findByProductName(srchString);
	}
	public Optional<Product>findById(int key){
		return this.repo.findById(key);
	}
	public void deleteById(int key) {
		if(this.repo.existsById(key)) {
			this.repo.deleteById(key);
		}else {
			throw new RuntimeException("Id not found");
		}
	}
//	public int updateRate(int id,double rate) {
//		return this.repo.updateRate(id,rate);
//	}
	
	public List<Product> findByRatePerUnitGrtThan(double rate_per_unit){
		return this.repo.findByRatePerUnitGrtThan(rate_per_unit);
	}
	
	public List<Product> findByProductRate(double srch) {
        return this.repo.findByProductRate(srch);
    }
	
}
