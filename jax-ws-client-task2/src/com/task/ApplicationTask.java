package com.task;

import java.util.List;



public class ApplicationTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CountryInfoServiceSoapType service=new CountryInfoService().getCountryInfoServiceSoap();

  System.out.println("capital city of US="+service.capitalCity("US"));
  System.out.println("currency="+service.languageName("INDIA"));
  System.out.println("Phone Code="+service.countryIntPhoneCode("INDIA"));
  System.out.println("Country Name:"+service.countryName("INDIA"));
  System.out.println("capital city of India="+service.capitalCity("INDIA"));
  System.out.println("Phone Code="+service.countryIntPhoneCode("AFRICA"));
   ArrayOftContinent nameList=service.listOfContinentsByName();
   //nameList.getList().forEach(System.out::println);
	//System.out.println(nameList);
  System.out.println("full country info:"+service.fullCountryInfo("IN"));
  System.out.println("Country code and name ="+service.countriesUsingCurrency("US"));
		
		
	}

}
