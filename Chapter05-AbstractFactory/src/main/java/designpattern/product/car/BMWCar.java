package designpattern.product.car;

/**
 * @author Misout
 * @date 2018-08-05 17:57:11
 */
public class BMWCar extends Car {

	public BMWCar() {
		super("BMWCar");
	}
	
	public String getName() {
		return super.getName();
	}
	
	public void drive() {
		System.out.println(getName() + " driving on road");
	}
}
