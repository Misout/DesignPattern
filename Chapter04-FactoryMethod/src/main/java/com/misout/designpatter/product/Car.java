package com.misout.designpatter.product;

/**
 * @author Misout
 * @date 2018-08-05 17:51:00
 */
public class Car {
	
	private String name;
	
	public Car() {
		this.name = "This is a Car";
	}
	
	public Car(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void drive() {
		System.out.println("driving on road");
	}
}
