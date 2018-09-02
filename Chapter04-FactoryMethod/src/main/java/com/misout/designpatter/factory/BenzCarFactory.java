package com.misout.designpatter.factory;

import com.misout.designpatter.product.BenzCar;
import com.misout.designpatter.product.Car;

/**
 * @author Administrator
 * @date 2018-08-11 16:34:20
 */
public class BenzCarFactory implements Factory {

    @Override
    public Car getCar() {
        return new BenzCar();
    }
}
