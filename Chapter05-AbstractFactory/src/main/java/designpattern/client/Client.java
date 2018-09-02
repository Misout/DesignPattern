package designpattern.client;

import designpattern.factory.BMWCarAndDuckFactory;
import designpattern.factory.BenzCarAndCatFactory;
import designpattern.factory.Factory;
import designpattern.factory.LandRoverCarAndCatFactory;
import designpattern.product.animal.Animal;
import designpattern.product.car.Car;

/**
 * @author Administrator
 * @date 2018-08-11 16:39:30
 */
public class Client {

    public static void main(String[] args) {
        // 实例化一个奔驰车和猫工厂
        Factory factory = new BenzCarAndCatFactory();
        Car car  = factory.getCar();// 得到奔驰车
        Animal animal = factory.getAnimal();// 得到猫
        car.drive();
        animal.walk();

        // 实例化一个宝马车和鸭工厂
        factory = new BMWCarAndDuckFactory();
        car = factory.getCar();
        animal = factory.getAnimal();
        car.drive();
        animal.walk();

        // 实例化一个路虎车和猫工厂
        factory = new LandRoverCarAndCatFactory();
        car = factory.getCar();
        animal = factory.getAnimal();
        car.drive();
        animal.walk();
    }
}
