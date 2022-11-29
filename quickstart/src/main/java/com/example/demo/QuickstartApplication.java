package com.example.demo;

import java.time.LocalDate;

import org.demo.module.Address;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"org.demo.module","com.example.demo"})
public class QuickstartApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(QuickstartApplication.class, args);
		
		
		//Customer ram=(Customer)ctx.getBean(Customer.class);//casting is required
		Customer ram=ctx.getBean("customer",Customer.class); //no need of casting
		System.out.println(ram);
		Customer shyam=ctx.getBean("shyam",Customer.class);
		System.out.println(shyam);
		System.out.println(ctx.getBean(Invoice.class));
		
		ctx.getBean(CustomerList.class).getCustList().forEach(System.out::println);
		System.out.println(ctx.getBean(Address.class));
	}
	//Factory method which will be invoked of IoC
@Bean
public Customer shyam() {
	return new Customer(202,"Shyam Kumar","shyam@abc.com");
}
@Bean
public Customer manju() {
	return new Customer(203,"Manju Nath","manjus@abc.com");
}
@Bean
public Customer vikas() {
	return new Customer(204,"vikas Kumar","vikas@abc.com");
}
@Bean
public Invoice shyamInvoice() {
	return new Invoice(120,vikas(),LocalDate.of(2022, 9, 26),56000);
}
}
