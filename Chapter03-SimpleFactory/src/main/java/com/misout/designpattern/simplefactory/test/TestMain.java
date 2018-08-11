package com.misout.designpattern.simplefactory.test;

import com.misout.designpattern.simplefactory.Car;
import com.misout.designpattern.simplefactory.SimpleFactory;

/**
 * @author Misout
 * @date 2018-08-05 18:01:37
 */
public class TestMain {
	public static void main(String[] args) {
		Car car = SimpleFactory.getCar("Benz");
		car.drive();
		
		car = SimpleFactory.getCar("BMW");
		car.drive();
	}
	
}
