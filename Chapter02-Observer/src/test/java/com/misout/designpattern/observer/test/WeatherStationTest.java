package com.misout.designpattern.observer.test;

import com.misout.designpattern.observer.impl.CurrentConditionsDisplay;
import com.misout.designpattern.observer.impl.WeatherData;

/**
 * @author Misout
 * @date 2018-03-25 13:37:49
 */
public class WeatherStationTest {
	
	public static void main(String[] args) {
		// 创建一个主题实现类：天气数据中心
		WeatherData weatherData = new WeatherData();
		
		// 创建一个观察者：当前天气显示器，并注册到天气中心
		CurrentConditionsDisplay currentDisplay = 
				new CurrentConditionsDisplay(weatherData);
		
		// 天气中心变更数据，自动通知到观察者
		weatherData.setMeasurements(37, 50, 39.4f);
	}
}
