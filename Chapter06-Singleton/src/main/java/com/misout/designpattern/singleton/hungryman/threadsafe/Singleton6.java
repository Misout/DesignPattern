package com.misout.designpattern.singleton.hungryman.threadsafe;

/**
 * 饿汉式，静态代码块，线程安全，推荐
 * @author Administrator
 * @date 2018-08-12 13:31:08
 */
public class Singleton6 {
    private static final Singleton6 instance;

    static {
        instance = new Singleton6();
    }

    private Singleton6() {}

    public static Singleton6 getInstance() {
        return instance;
    }
}
