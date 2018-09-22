package com.misout.designpattern.proxy;

import com.misout.designpattern.handler.ConcreteInvocationHandler;
import com.misout.designpattern.subject.RealSubject;
import com.misout.designpattern.subject.Subject;
import sun.misc.ProxyGenerator;

import java.io.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Misout
 * @date 2018-09-16 21:20:39
 */
public class JDKDynamicProxyTest {
    public static void main(String[] args) throws IOException {
        Subject subject = new RealSubject();
        InvocationHandler handler = new ConcreteInvocationHandler(subject);
        Subject proxy = (Subject)Proxy.newProxyInstance(RealSubject.class.getClassLoader(),
                RealSubject.class.getInterfaces(), handler);
        proxy.request();

        byte[] proxyBytes = ProxyGenerator.generateProxyClass("$Proxy0",
                RealSubject.class.getInterfaces());
        InputStream inputStream = new ByteArrayInputStream(proxyBytes);
        FileOutputStream outputStream = new FileOutputStream("C:/$Proxy0.class");
        byte[] buff = new byte[1024];
        int len = 0;
        while((len=inputStream.read(buff))!=-1){
            outputStream.write(buff, 0, len);
        }
        inputStream.close();
        outputStream.close();
    }
}
