package com.misout.designpattern.behavior.impl;

import com.misout.designpattern.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("unflyable, walk on ground.");
	}

}
