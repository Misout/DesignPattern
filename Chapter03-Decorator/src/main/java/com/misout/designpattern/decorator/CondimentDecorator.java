package com.misout.designpattern.decorator;

/**
 * 装饰器模式，装饰者的基类，继承自饮料基类，
 * 所有具体装饰者必须从此继承
 * @author Misout
 * @date 2018-04-15 18:27:43
 */
public abstract class CondimentDecorator extends Beverage {

	/** 留给具体的装饰者实现 */
	public abstract String getDescription();
}
