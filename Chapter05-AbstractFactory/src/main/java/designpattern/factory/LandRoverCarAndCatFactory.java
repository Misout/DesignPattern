package designpattern.factory;

import designpattern.product.animal.Animal;
import designpattern.product.animal.Cat;
import designpattern.product.car.Car;
import designpattern.product.car.LandRoverCar;

/**
 * @author Administrator
 * @date 2018-08-11 20:26:35
 */
public class LandRoverCarAndCatFactory implements Factory {
    @Override
    public Car getCar() {
        return new LandRoverCar();
    }

    @Override
    public Animal getAnimal() {
        return new Cat();
    }
}
