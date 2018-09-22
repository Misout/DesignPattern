package com.misout.designpattern.handler;

import com.misout.designpattern.subject.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Misout
 * @date 2018-09-16 21:17:57
 */
public class ConcreteInvocationHandler implements InvocationHandler {

    private Subject subject;

    public ConcreteInvocationHandler(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("proxy class name : " + proxy.getClass().getName());
        return method.invoke(subject, args);
    }
}
