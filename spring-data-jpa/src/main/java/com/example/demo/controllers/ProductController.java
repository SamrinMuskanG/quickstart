package com.example.demo.controllers;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Product;
import com.example.demo.services.ProductService;

@RestController
@RequestMapping(path="/api/v1/product")
public class ProductController {
	
	@Autowired
	private ProductService service;

	
	@GetMapping
	public List<Product>findAll(){
		return this.service.findAll();
	}
	
	@GetMapping(path="/{id}")
	public Product findById(@PathVariable("id") int id){
		
		return this.service.findById(id).orElseThrow(()-> new RuntimeException("Element not found"));
	}
	@GetMapping(path="/srch/{productName}")
	public List<Product> findByProductName(@PathVariable("productName") String productName){
		
		return this.service.findByProductName(productName);
	}
	@GetMapping(path = "/key")
	public List<Product> findByRateGrtThan(@RequestParam("rate_Per_Unit") double rate_Per_Unit){
	    
	    return this.service.findByRatePerUnitGrtThan(rate_Per_Unit);
	}
	@PostMapping
public ResponseEntity<Product> add(@RequestBody Product entity) throws URISyntaxException, SQLException {
		
		Product addedEntity=this.service.add(entity);
		int pkey=entity.getId();
		String uri="/api/v1/Product/"+pkey;
		return ResponseEntity.created(new URI(uri)).body(addedEntity);
	}
	@DeleteMapping(path="/{id}")
	public void deleteById(@PathVariable("id")int id) {
		 this.service.deleteById(id);
	}
	
//	@PutMapping(path="/{id}/{rate_per_unit}")
//	public ResponseEntity <String> update(@PathVariable("rate_per_unit") double rate_per_unit,@PathVariable("id") int id) {
//		int rowsUpdated=this.service.updateRate(id,rate_per_unit);
//		return ResponseEntity.ok(rowsUpdated+"Row Updated");
//		
//	}
	
	@GetMapping(path="/rate/{srch}")
    public List<Product> findProductRate(@PathVariable("srch")double srch ){
        return this.service.findByProductRate(srch);
        
        
    }
	
	
	
}
