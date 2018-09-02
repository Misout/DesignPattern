package com.misout.designpattern.singleton.lazyman.threadsafe;

/**
 * 单例：懒汉线程安全，同步代码块实现，可用，但性能太差，不推荐。
 * @author Administrator
 * @date 2018-08-12 12:25:13
 */
public class Singleton4 {
    private static volatile Singleton4 instance;

    private Singleton4() {}

    public static Singleton4 getInstance() {
        if(instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
