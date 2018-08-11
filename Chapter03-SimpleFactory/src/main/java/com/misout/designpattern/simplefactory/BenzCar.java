package com.misout.designpattern.simplefactory;

/**
 * @author Misout
 * @date 2018-08-05 17:57:11
 */
public class BenzCar extends Car {

	public BenzCar() {
		super("BenzCar");
	}
	
	public String getName() {
		return super.getName();
	}
	
	public void drive() {
		System.out.println(getName() + " driving on road");
	}
}
