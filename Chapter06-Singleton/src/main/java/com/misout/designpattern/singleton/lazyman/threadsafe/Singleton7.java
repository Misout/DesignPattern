package com.misout.designpattern.singleton.lazyman.threadsafe;

/**
 * 饿汉式，静态内部类，线程安全，推荐
 * @author Administrator
 * @date 2018-08-12 13:31:08
 */
public class Singleton7 {
    static class Inner {
        private static final Singleton7 instance = new Singleton7();
    }

    private Singleton7() {}

    public static Singleton7 getInstance() {
        return Inner.instance;
    }
}
