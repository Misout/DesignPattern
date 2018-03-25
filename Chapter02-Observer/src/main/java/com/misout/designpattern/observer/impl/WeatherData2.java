package com.misout.designpattern.observer.impl;

import java.util.Observable;

/**
 * @author Misout
 * @date 2018-03-25 14:33:07
 */
public class WeatherData2 extends Observable {

	/** 温度 */
	private float temp;
	
	/** 湿度 */
	private float humidity;
	
	/** 压强 */
	private float pressure;
	
	/**
	 * 发生数据变化时，实时通知观察者
	 */
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
}
