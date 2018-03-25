package com.misout.designpattern.observer.test;

import com.misout.designpattern.observer.impl.CurrentConditionsDisplay;
import com.misout.designpattern.observer.impl.StatisticsDisplay;
import com.misout.designpattern.observer.impl.WeatherData;

/**
 * @author Misout
 * @date 2018-03-25 13:37:49
 */
public class WeatherStationTest {
	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		weatherData.setMeasurements(37, 50, 39.4f);
	}
	
}
