package com.misout.designpattern.proxy;

import com.misout.designpattern.subject.Subject;

/**
 * @author Misout
 * @date 2018-09-16 17:23:03
 */
public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        prePost();
        subject.request();
        afterPost();
    }

    /**
     * 前置处理
     */
    protected void prePost() {
        System.out.println("前置处理完毕");
    }

    /**
     * 后置处理
     */
    protected void afterPost() {
        System.out.println("后置处理完毕");
    }
}
