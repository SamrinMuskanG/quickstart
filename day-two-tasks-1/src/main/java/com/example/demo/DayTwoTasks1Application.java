package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Hospital;
import com.example.demo.services.HospitalService;

@SpringBootApplication
public class DayTwoTasks1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(DayTwoTasks1Application.class, args);
		
		
		Hospital obj=ctx.getBean("hos3",Hospital.class);
		HospitalService service=ctx.getBean(HospitalService.class);
		System.out.println("the hospital with following details added:="+service.save(obj));
		service.findAll().forEach(System.out::println);
	//service.delete(104);
	
	//System.out.println(service.update);
service.update(obj);
//		
//		System.out.println(dele);
		service.findByHospitalName("Medical").forEach(System.out::println);
		ctx.close();
	}
	
	
//	
//	@Bean
//	public Hospital hos() {
//		return new Hospital(101,"Mother and Child",9008765,"Bangaluru");
//	}
//
//	@Bean
//	public Hospital hos1() {
//		return new Hospital(102,"Manipal",934577,"Bangaluru");
//	}
//	@Bean
//	public Hospital hos2() {
//		return new Hospital(103,"LV",978965,"Balari");
//	}
	@Bean
	public Hospital hos3() {
		return new Hospital(104,"Medical",978964,"Huballi");
	}
	



}