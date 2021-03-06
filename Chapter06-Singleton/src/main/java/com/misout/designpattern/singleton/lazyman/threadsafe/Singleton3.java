package com.misout.designpattern.singleton.lazyman.threadsafe;

/**
 * 单例：懒汉线程安全，同步代码块实现，可用，但性能太差，不推荐。
 * @author Administrator
 * @date 2018-08-12 12:25:13
 */
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {}

    public static Singleton3 getInstance() {
        synchronized (Singleton3.class) {
            if (instance == null) {
                instance = new Singleton3();
            }
        }
        return instance;
    }
}
