package com.training;

import javax.xml.ws.Endpoint;

import com.training.services.NumberServiceImpl;


public class PublisherNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Endpoint.publish("http://localhost:9000/number",new NumberServiceImpl ());
	      
	      System.out.println("service Started");
		}
	}


