package com.misout.designpattern.decorator;

/**
 * 装饰器模式，调料装饰者，具体的装饰类型：奶泡
 * @author Misout
 * @date 2018-04-15 19:04:26
 */
public class Whip extends CondimentDecorator {
	
	private Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return 0.21 + beverage.cost();
	}

}
