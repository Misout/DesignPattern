package com.misout.designpattern;

import com.misout.designpattern.behavior.impl.FlyNoWay;
import com.misout.designpattern.behavior.impl.FlyWithWings;
import com.misout.designpattern.behavior.impl.Squeak;

public class MallardDuck extends Duck {

	public MallardDuck() {
		super();
		super.setFlyBehavior(new FlyWithWings());
		super.setQuackBehavior(new Squeak());
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
		System.out.println("green duck.");
	}
	
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.performFly();
		duck.performQuack();
		
		duck.setFlyBehavior(new FlyNoWay());
		System.out.println("fly behavior has been changed.");
		duck.performFly();
	}
}
