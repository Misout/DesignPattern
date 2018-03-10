package com.misout.designpattern;

import com.misout.designpattern.behavior.impl.FlyNoWay;
import com.misout.designpattern.behavior.impl.MuteQuack;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
		super();
		super.setFlyBehavior(new FlyNoWay());
		super.setQuackBehavior(new MuteQuack());
	}
	
	@Override
	public void performFly() {
		super.performFly();
	}

	@Override
	public void performQuack() {
		super.performQuack();
	}

	@Override
	public void display() {
		System.out.println("redhead duck.");
	}

}
