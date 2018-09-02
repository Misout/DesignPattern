package com.misout.designpatter.factory;

import com.misout.designpatter.product.Car;

/**
 * @author Administrator
 * @date 2018-08-11 16:33:10
 */
public interface Factory {
    /**
     * 抽象工厂方法，子类实现
     * @return
     */
    Car getCar();
}
