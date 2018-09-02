package designpattern.factory;

import designpattern.product.animal.Animal;
import designpattern.product.animal.Duck;
import designpattern.product.car.BMWCar;
import designpattern.product.car.Car;

/**
 * @author Administrator
 * @date 2018-08-11 20:25:47
 */
public class BMWCarAndDuckFactory implements Factory {
    @Override
    public Car getCar() {
        return new BMWCar();
    }

    @Override
    public Animal getAnimal() {
        return new Duck();
    }
}
