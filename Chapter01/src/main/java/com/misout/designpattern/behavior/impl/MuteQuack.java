package com.misout.designpattern.behavior.impl;

import com.misout.designpattern.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("mute quack");
	}

}
