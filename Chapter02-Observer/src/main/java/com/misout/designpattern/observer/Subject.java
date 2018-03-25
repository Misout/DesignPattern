package com.misout.designpattern.observer;

/**
 * 主题类
 * @author Misout
 * @date 2018-03-25 12:40:37
 */
public interface Subject {

	/**
	 * 注册添加观察者
	 * @param observer
	 */
	void registerObserver(Observer observer);
	
	/**
	 * 移除观察者
	 * @param observer
	 */
	void removeObserver(Observer observer);
	
	/**
	 * 更新或通知变更所有观察者
	 */
	void notifyObservers();
}
