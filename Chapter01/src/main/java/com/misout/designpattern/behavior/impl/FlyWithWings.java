package com.misout.designpattern.behavior.impl;

import com.misout.designpattern.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("flying with wings");
	}

}
