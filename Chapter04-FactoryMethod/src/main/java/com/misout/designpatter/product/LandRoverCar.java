package com.misout.designpatter.product;

/**
 * @author Misout
 * @date 2018-08-05 17:57:11
 */
public class LandRoverCar extends Car {

	public LandRoverCar() {
		super("LandRoverCar");
	}
	
	public String getName() {
		return super.getName();
	}
	
	public void drive() {
		System.out.println(getName() + " driving on road");
	}
}
