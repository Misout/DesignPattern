package com.misout.designpattern;

import com.misout.designpattern.behavior.FlyBehavior;
import com.misout.designpattern.behavior.QuackBehavior;

public abstract class Duck {
	
	private FlyBehavior flyBehavior;
	
	private QuackBehavior quackBehavior;
	
	public Duck() {}
	
	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}

	public void display() {
		System.out.println("This is super duck.");
	}
	
}
