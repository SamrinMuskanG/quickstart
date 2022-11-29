package com.example.demo;

import org.springframework.stereotype.Component;

//import lombok.AccessLevel;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.experimental.FieldDefaults;

//@FieldDefaults(level = AccessLevel.PRIVATE)
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
//@Component //class Annotated with @Component will be registered as a bean
	public class Customer {
		
		private int customerId;
	private	String customerName;
	private	String email;
	
		public Customer(int customerId, String customerName, String email) {
			super();
			this.customerId = customerId;
			this.customerName = customerName;
			this.email = email;
		}
		@Override
		public String toString() {
			return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", email=" + email + "]";
		}
		

		}

