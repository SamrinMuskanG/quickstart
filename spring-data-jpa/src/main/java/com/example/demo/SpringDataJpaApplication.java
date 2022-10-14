package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Product;
import com.example.demo.services.ProductService;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDataJpaApplication.class, args);
		
//		Product obj=ctx.getBean(Product.class);
//		ProductService service=ctx.getBean(ProductService.class);
//      System.out.println("one product with Following Details Added:="+service.save(obj));	
//	//service.findAll().forEach(System.out::println);
//	service.findByProductName("redme").forEach(System.out::println);
//	ctx.close();
	}
	
//	@Bean
//	public Product tv() {
//		
//		return new Product(103,"Sony tv",23000);
//	}
	@Bean
	public Product Iphone() {
		return new Product(104,"redme",33000);
	}

}
