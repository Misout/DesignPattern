package com.misout.designpattern.observer.impl;

import com.misout.designpattern.observer.DisplayElement;
import com.misout.designpattern.observer.Observer;
import com.misout.designpattern.observer.Subject;

/**
 * @author Misout
 * @date 2018-03-25 13:52:23
 */
public class StatisticsDisplay implements Observer, DisplayElement {

	private float temp;
	private float humidity;
	private float pressure;
	private WeatherData weatherData;
	
	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
	
	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + temp + "/" + humidity + "/" + pressure);
	}

}
