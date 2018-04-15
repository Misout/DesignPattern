package com.misout.designpattern.decorator;

/**
 * 装饰器模式，调料装饰者，具体的装饰类型：摩卡
 * @author Misout
 * @date 2018-04-15 19:04:26
 */
public class Mocha extends CondimentDecorator {
	
	private Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return 0.2 + beverage.cost();
	}
}
