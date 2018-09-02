package com.misout.designpatter.factory;

import com.misout.designpatter.product.Car;
import com.misout.designpatter.product.LandRoverCar;

/**
 * @author Administrator
 * @date 2018-08-11 16:36:03
 */
public class LandRoverCarFactory implements Factory {
    @Override
    public Car getCar() {
        return new LandRoverCar();
    }
}
