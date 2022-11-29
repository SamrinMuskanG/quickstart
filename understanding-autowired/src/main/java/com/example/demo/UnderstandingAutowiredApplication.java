package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class UnderstandingAutowiredApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(UnderstandingAutowiredApplication.class, args);
		
		Invoice inv=ctx.getBean(Invoice.class);
		System.out.println(inv);
		
	}
	@Bean
	public Customer manju() {
		return new Customer(203,"Manju Nath","manjus@abc.com");
	}
	@Bean
	@Primary
	public Customer vikas() {
		return new Customer(204,"vikas Kumar","vikas@abc.com");
	}
	@Bean
	public Product tv() {
		return new Product(2020,"sony tv",12000);
	}
	
}
