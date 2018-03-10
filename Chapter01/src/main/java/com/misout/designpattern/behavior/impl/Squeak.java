package com.misout.designpattern.behavior.impl;

import com.misout.designpattern.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("squeak quack");
	}

}
