package com.misout.designpattern.interceptor;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Misout
 * @date 2018-09-17 23:19:34
 */
public class TargetMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args,
                            MethodProxy proxy) throws Throwable {
        System.out.println("方法拦截增强逻辑-前置处理执行");
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("方法拦截增强逻辑-后置处理执行");
        return result;
    }
}
