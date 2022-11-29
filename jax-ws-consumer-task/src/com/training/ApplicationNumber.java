package com.training;

public class ApplicationNumber {
  public static void main(String[] args) {
	NumberToTextService service= new NumberServiceImplService().getNumberServiceImplPort();
	
	
	
	System.out.println("number in text format is:="+service.numberToText(4));
	System.out.println("number in text format is:="+service.numberToText(5));
	 
	 
}
}
