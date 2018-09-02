package com.misout.designpatter.client;

import com.misout.designpatter.factory.BMWCarFactory;
import com.misout.designpatter.factory.BenzCarFactory;
import com.misout.designpatter.factory.Factory;
import com.misout.designpatter.factory.LandRoverCarFactory;
import com.misout.designpatter.product.Car;

/**
 * @author Administrator
 * @date 2018-08-11 16:39:30
 */
public class Client {

    public static void main(String[] args) {
        Factory factory = new BenzCarFactory();

        Car car = factory.getCar();
        car.drive();

        factory = new BMWCarFactory();
        car = factory.getCar();
        car.drive();

        factory = new LandRoverCarFactory();
        car = factory.getCar();
        car.drive();
    }
}
