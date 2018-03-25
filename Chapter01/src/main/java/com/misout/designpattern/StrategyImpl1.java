package com.misout.designpattern;

/**
 * @author Misout
 * @date 2018-03-25 16:47:18
 */
public class StrategyImpl1 implements Strategy {
	@Override
	public void action() {
		System.out.println("我是快速排序算法");
	}
}
