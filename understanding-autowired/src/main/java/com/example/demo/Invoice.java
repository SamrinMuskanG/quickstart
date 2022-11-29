package com.example.demo;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
//@NoArgsConstructor
//@AllArgsConstructor
@Data
@Component //class Annotated with @Component will be registered as a bean
public class Invoice {
	
Product product;
Customer customer;
//Constructor dependency injection(DI)
@Autowired
public Invoice(Product product, Customer customer) {
	super();
	this.product = product;
	this.customer = customer;
}

}
