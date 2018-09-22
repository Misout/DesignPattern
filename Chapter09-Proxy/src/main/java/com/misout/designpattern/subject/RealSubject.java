package com.misout.designpattern.subject;

/**
 * @author Misout
 * @date 2018-09-16 17:21:58
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("request invoke");
    }
}
