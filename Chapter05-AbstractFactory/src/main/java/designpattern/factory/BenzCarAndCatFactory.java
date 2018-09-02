package designpattern.factory;

import designpattern.product.animal.Animal;
import designpattern.product.animal.Cat;
import designpattern.product.car.BenzCar;
import designpattern.product.car.Car;

/**
 * @author Administrator
 * @date 2018-08-11 20:24:09
 */
public class BenzCarAndCatFactory implements  Factory {

    @Override
    public Car getCar() {
        return new BenzCar();
    }

    @Override
    public Animal getAnimal() {
        return new Cat();
    }
}
