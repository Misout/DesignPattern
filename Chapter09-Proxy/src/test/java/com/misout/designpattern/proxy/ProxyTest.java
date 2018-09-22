package com.misout.designpattern.proxy;

import com.misout.designpattern.subject.RealSubject;
import com.misout.designpattern.subject.Subject;

/**
 * @author Misout
 * @date 2018-09-16 17:28:06
 */
public class ProxyTest {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Proxy proxy = new Proxy(subject);
        proxy.request();
    }
}
