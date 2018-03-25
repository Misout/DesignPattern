package com.misout.designpattern.observer.impl;

import com.misout.designpattern.observer.DisplayElement;
import com.misout.designpattern.observer.Observer;
import com.misout.designpattern.observer.Subject;

/**
 * @author Misout
 * @date 2018-03-25 13:33:58
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temp;
	private float humidity;
	private float pressure;
	
	private Subject weatherData;
	
	/**
	 * 注册到被制定的Subject
	 * @param weatherData
	 */
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		display();
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: " + temp + "F degrees and " + humidity + "% humidity");
		
	}

}
