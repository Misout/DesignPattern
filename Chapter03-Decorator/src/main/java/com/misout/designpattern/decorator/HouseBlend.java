package com.misout.designpattern.decorator;

/**
 * 装饰器模式，混合黑咖啡，具体的饮料类型
 * @author Misout
 * @date 2018-04-15 18:38:00
 */
public class HouseBlend extends Beverage {
	
	public HouseBlend() {
		super.setDescription("HouseBlend");
	}
	
	public String getDescription() {
		return super.getDescription();
	}

	@Override
	public double cost() {
		return 0.79;
	}

}
