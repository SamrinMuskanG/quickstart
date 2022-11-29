package com.example.demo;
import java.time.LocalDate;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Data
//@Component //class Annotated with @Component will be registered as a bean
public class Invoice {
	
int invoiceNumber;
Customer customer;
LocalDate invoiceDate;
double price;

}
