package com.misout.designpattern.observer;

/**
 * 观察者
 * @author Misout
 * @date 2018-03-25 12:40:28
 */
public interface Observer {

	/**
	 * 更新温度、湿度、压强.
	 * 缺点：将更新的参数值直接放入型参，如果未来要增减观察指标，将不可扩展。
	 * @param temp 温度
	 * @param humidity 湿度
	 * @param pressure 压强
	 */
	void update(float temp, float humidity, float pressure);
}
