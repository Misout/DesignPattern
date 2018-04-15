package com.misout.designpattern.decorator;

/**
 * 装饰器模式，基类：饮料，
 * 所有的具体饮料及装饰者都必须从此继承
 * @author Misout
 * @date 2018-04-15 18:22:42
 */
public abstract class Beverage {
	private String description = "Unknown Beverage";
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 抽象的价格方法，子类必须实现它
	 * @return
	 */
	public abstract double cost();
}
