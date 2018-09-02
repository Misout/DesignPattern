package designpattern.factory;

import designpattern.product.animal.Animal;
import designpattern.product.car.Car;

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

    /**
     * 抽象方法，子类实现
     * @return
     */
    Animal getAnimal();
}
