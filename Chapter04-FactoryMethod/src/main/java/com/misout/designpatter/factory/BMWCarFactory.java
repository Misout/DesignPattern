package com.misout.designpatter.factory;

import com.misout.designpatter.product.BMWCar;
import com.misout.designpatter.product.Car;

/**
 * @author Administrator
 * @date 2018-08-11 16:35:35
 */
public class BMWCarFactory implements Factory {
    @Override
    public Car getCar() {
        return new BMWCar();
    }
}
