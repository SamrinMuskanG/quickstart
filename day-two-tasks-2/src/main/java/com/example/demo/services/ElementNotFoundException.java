package com.example.demo.services;

import java.io.PrintWriter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//unchecked Exception:can handle or declare ,can leave it without handle or declare

@AllArgsConstructor
//@Data
@Setter
@Getter

public class ElementNotFoundException extends RuntimeException{
	String errorCode;
	String message;	
	
	@Override
	
	public void printStackTrace(PrintWriter s) {
		s.write(this.errorCode+" ,"+this.message);
	}
}
	








//checked Exception:you have to either handle or declare,not doing well be an exception
//public class ElementNotFoundException extends Exception{
//
//	public ElementNotFoundException(String string,String string2 ) {
//		
//	}
//}