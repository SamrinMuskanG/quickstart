package com.training.services;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.training.ifaces.NumberToTextService;

@WebService(endpointInterface="com.training.ifaces.NumberToTextService")
public class NumberServiceImpl implements NumberToTextService {

	@Override
	@WebResult(name="converter")
	public String numberToText( @WebParam(name="number")int number) {
		// TODO Auto-generated method stub
		
		String text=null;
		
		switch(number) {
		case 1:text="one";
		break;
		case 2:text="two";
		break;
		case 3:text="three";
		break;
		case 4:text="four";
		break;
		case 5:text="five";
		break;
		case 6:text="six";
		break;
		
		}
		return text;
	}
	

}
