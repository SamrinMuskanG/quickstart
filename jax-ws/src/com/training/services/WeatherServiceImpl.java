package com.training.services;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.training.ifaces.WeatherService;
import com.training.model.Weather;
import com.training.model.WeatherWrapper;

@WebService(endpointInterface="com.training.ifaces.WeatherService")
public class WeatherServiceImpl implements WeatherService {

	@Override
	
	@WebMethod
	@WebResult(name="current Weather")
	public Weather getWeatherByCity(@WebParam(name="cityName")String cityName) {
		
		Weather weather=new Weather(cityName,32,27,60);
		
		if(cityName.equals("Pune")) {
			weather=new Weather(cityName,27,23,50);
			
		}
		return weather;
	}

	
	@Override
	@WebMethod
	public WeatherWrapper getWeatherByState(String stateName) {
		List<Weather> list=new ArrayList<Weather>();
		list.add(new Weather("Karnataka",32,27,60));
		list.add(new Weather("A.P",32,27,60));
		WeatherWrapper wrapper=new WeatherWrapper(list);
		return wrapper;
	}

}
