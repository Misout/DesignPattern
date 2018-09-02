package com.misout.designpattern.adapter;

/**
 * @author Administrator
 * @date 2018-08-26 20:45:27
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.request();
    }
}
