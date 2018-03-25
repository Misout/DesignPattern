package com.misout.designpattern.observer.impl;

import java.util.Observable;
import java.util.Observer;

import com.misout.designpattern.observer.DisplayElement;

/**
 * @author Misout
 * @date 2018-03-25 13:33:58
 */
public class CurrentConditionsDisplay2 implements Observer, DisplayElement {
	private float temp;
	private float humidity;
	private float pressure;
	
	private Observable weatherData;
	
	/**
	 * 注册到被制定的Subject
	 * @param weatherData
	 */
	public CurrentConditionsDisplay2(Observable weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temp + "F degrees and " + humidity + "% humidity");
		
	}

	@Override
	public void update(Observable subject, Object arg) {
		if(subject instanceof WeatherData2) {
			WeatherData2 weatherData = (WeatherData2)subject;
			this.temp = weatherData.getTemp();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

}
