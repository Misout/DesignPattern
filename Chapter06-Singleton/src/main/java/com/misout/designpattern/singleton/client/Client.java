package com.misout.designpattern.singleton.client;

import com.misout.designpattern.singleton.lazyman.nonthreadsafe.Singleton1;
import com.misout.designpattern.singleton.lazyman.threadsafe.Singleton3;
import com.misout.designpattern.singleton.lazyman.threadsafe.Singleton4;
import org.junit.Test;

/**
 * @author Administrator
 * @date 2018-08-12 12:28:23
 */
public class Client {

    @Test
    public void testLazymanNonThreadSafeSingleon() {
        Runnable myRunable = new Runnable() {
            @Override
            public void run() {
                Singleton1 instance = Singleton1.getInstance();
                System.out.println(instance);
            }
        };

        Thread thread1 = new Thread(myRunable);
        Thread thread2 = new Thread(myRunable);

        thread1.start();
        thread2.start();
    }

    @Test
    public void testLazymanSingleon() {
        Runnable myRunable = new Runnable() {
            @Override
            public void run() {
                Singleton3 instance = Singleton3.getInstance();
                System.out.println(instance);
            }
        };

        Thread thread1 = new Thread(myRunable);
        Thread thread2 = new Thread(myRunable);

        thread1.start();
        thread2.start();
    }

    @Test
    public void testDoubleCheckSingleon() {
        Runnable myRunable = new Runnable() {
            @Override
            public void run() {
                Singleton4 instance = Singleton4.getInstance();
                System.out.println(instance);
            }
        };

        Thread thread1 = new Thread(myRunable);
        Thread thread2 = new Thread(myRunable);

        thread1.start();
        thread2.start();
    }
}
