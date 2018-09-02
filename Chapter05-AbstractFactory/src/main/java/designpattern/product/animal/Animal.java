package designpattern.product.animal;

/**
 * @author Administrator
 * @date 2018-08-11 20:03:34
 */
public class Animal {

    private String name;
    private String walkStyle;

    public Animal() {
        this.name = "Animal";
        this.walkStyle = "walk on ground";
    }

    public Animal(String name, String walkStyle) {
        this.name = name;
        this.walkStyle = walkStyle;
    }

    public void walk() {
        System.out.println(this.name + " " + this.walkStyle);
    }
}
