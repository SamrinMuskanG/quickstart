package com.task;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CalculatorSoap proxy=new Calculator().getCalculatorSoap();
        System.out.println("addition result="+proxy.add(12, 24));
		System.out.println("sub result="+proxy.subtract(51, 101));
		System.out.println("multiplication res="+proxy.multiply(29, 29));
		System.out.println("division res="+proxy.divide(100, 10));
		
		
	}

}
