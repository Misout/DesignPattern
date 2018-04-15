package com.misout.designpattern.decorator;

/**
 * 装饰器模式，浓缩咖啡，具体的饮料类型
 * @author Misout
 * @date 2018-04-15 18:30:33
 */
public class Espresso extends Beverage {
	
	public Espresso() {
		super.setDescription("Espresso");
	}
	
	@Override
	public String getDescription() {
		return super.getDescription();
	}

	@Override
	public double cost() {
		return 0.89;
	}
}
