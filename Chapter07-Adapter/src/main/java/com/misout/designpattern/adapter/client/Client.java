package com.misout.designpattern.adapter.client;

import com.misout.designpattern.adapter.Adaptee;
import com.misout.designpattern.adapter.Adapter;
import com.misout.designpattern.adapter.Target;

/**
 * @author Administrator
 * @date 2018-08-26 20:42:22
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.request();
    }
}
