package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 WeatherService service=new WeatherServiceImplService().getWeatherServiceImplPort();
		 
		 System.out.println("weather in pune:="+service.getWeatherByCity("Pune"));
		 
		 System.out.println("weather in udupi:="+service.getWeatherByCity("udupi"));
	}

}
