package com.misout.designpattern.singleton.hungryman.threadsafe;

/**
 * @author Administrator
 * @date 2018-08-12 13:47:02
 */
public enum Singleton8 {
    instance;

    public static Singleton8 getInstance() {
        return instance;
    }
}
