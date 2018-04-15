package com.misout.designpattern.decorator;

/**
 * 装饰器模式，脱咖啡因咖啡，具体的饮料类型
 * @author Misout
 * @date 2018-04-15 18:38:00
 */
public class Decaf extends Beverage {
	
	public Decaf() {
		super.setDescription("Decaf");
	}
	
	public String getDescription() {
		return super.getDescription();
	}

	@Override
	public double cost() {
		return 0.88;
	}

}
