package com.misout.designpattern.observer.test;

import com.misout.designpattern.observer.impl.CurrentConditionsDisplay2;
import com.misout.designpattern.observer.impl.WeatherData2;

/**
 * @author Misout
 * @date 2018-03-25 13:37:49
 */
public class WeatherStationTest2 {
	
	public static void main(String[] args) {
		WeatherData2 weatherData = new WeatherData2();
		CurrentConditionsDisplay2 currentDisplay = new CurrentConditionsDisplay2(weatherData);
		weatherData.setMeasurements(37, 50, 39.4f);
	}
	
}
