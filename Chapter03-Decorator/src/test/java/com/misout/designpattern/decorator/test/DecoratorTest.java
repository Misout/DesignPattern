package com.misout.designpattern.decorator.test;

import com.misout.designpattern.decorator.Beverage;
import com.misout.designpattern.decorator.DarkRoast;
import com.misout.designpattern.decorator.Espresso;
import com.misout.designpattern.decorator.HouseBlend;
import com.misout.designpattern.decorator.Mocha;
import com.misout.designpattern.decorator.Soy;
import com.misout.designpattern.decorator.Whip;

/**
 * 装饰器模式：咖啡订单测试类
 * @author Misout
 * @date 2018-04-15 19:14:34
 */
public class DecoratorTest {
	public static void main(String[] args) {
		// 单点一杯饮料：浓缩咖啡
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() 
				+ " $" + beverage.cost());
		
		// 点一杯浓缩咖啡，并添加双倍摩卡和奶泡
		Beverage beverage2 = new DarkRoast();
		// 用摩卡包装两次即得双倍摩卡
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() 
				+ " $" + beverage2.cost());
		
		// 点一杯混合黑咖啡，并添加豆浆，摩卡和奶泡
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() 
				+ " $" + beverage3.cost());
		
	}
}
