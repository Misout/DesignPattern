package com.misout.designpattern.singleton.lazyman.nonthreadsafe;

/**
 * 单例：懒汉非线程安全，不推荐
 * @author Administrator
 * @date 2018-08-12 12:25:13
 */
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {}

    public static Singleton1 getInstance() {
        if(instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
