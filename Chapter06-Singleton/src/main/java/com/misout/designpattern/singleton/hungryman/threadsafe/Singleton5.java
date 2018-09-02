package com.misout.designpattern.singleton.hungryman.threadsafe;

/**
 * 饿汉式，静态常量，线程安全，推荐
 * @author Administrator
 * @date 2018-08-12 13:31:08
 */
public class Singleton5 {
    private static final Singleton5 instance = new Singleton5();

    private Singleton5() {}

    public static Singleton5 getInstance() {
        return instance;
    }
}
