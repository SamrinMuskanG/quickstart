package com.training.example;

import java.util.List;



public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WeatherService service=new WeatherServiceImplService().getWeatherServiceImplPort();
		WeatherWrapper weatherList=service.getWeatherByState("Karnataka");
		weatherList.getList().forEach(System.out::println);
		System.out.println(service.getWeatherByCity("pune"));
	}

}
