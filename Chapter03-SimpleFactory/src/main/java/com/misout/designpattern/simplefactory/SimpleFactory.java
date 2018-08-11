package com.misout.designpattern.simplefactory;

/**
 * @author Misout
 * @date 2018-08-05 18:18:38
 */
public class SimpleFactory {

	public static Car getCar(String name) {
		Car car = null;
		if(name.equals("Benz")) {
			car = new BenzCar();
		} else if(name.equals("BMW")) {
			car = new BMWCar();
		} else if (name.equals("LandRover")) {
			car = new LandRoverCar();
		}
		return car;
	}
}
