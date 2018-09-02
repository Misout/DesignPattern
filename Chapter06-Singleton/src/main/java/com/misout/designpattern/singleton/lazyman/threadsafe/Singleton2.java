package com.misout.designpattern.singleton.lazyman.threadsafe;

/**
 * 单例：懒汉线程安全，同步方法实现，可用，但性能太差，不推荐。
 * @author Administrator
 * @date 2018-08-12 12:25:13
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {}

    public static synchronized Singleton2 getInstance() {
        if(instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
