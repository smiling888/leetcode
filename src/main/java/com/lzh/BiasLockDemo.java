package com.lzh;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Hello world!
 */
public class BiasLockDemo {
    public static void main(String[] args) throws InterruptedException {

//        TimeUnit.SECONDS.sleep(5); // 启用偏向锁，要么开启jvm参数-XX:BiasedLockingStartupDelay=0，要么等待5秒

        // 实例化对象
        BiasLockDemo helloWorld = new BiasLockDemo();

        // 1、普通对象，无锁
        System.out.println("无锁，可偏向：");
        printfObjMarkWord(helloWorld);

        // 2、单线程首次加锁，偏向锁
        System.out.println("偏向锁：");
        new Thread(() -> {
            System.out.println("首次偏向：");
            synchronized (helloWorld) {
                printfObjMarkWord(helloWorld);
            }

            System.out.println("第二次，重偏向：");
            synchronized (helloWorld) {
                printfObjMarkWord(helloWorld);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        TimeUnit.SECONDS.sleep(1);

        // 3、多个线程加锁，膨胀为重量锁
        System.out.println("重量锁：");
        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                synchronized (helloWorld) {
                    printfObjMarkWord(helloWorld);
                }
            }).start();
        }
    }

    private static void printfObjMarkWord(Object obj) {
        System.out.println("-------------------------");
//        System.out.println(ClassLayout.parseInstance(obj).toPrintable());
        System.out.println("-------------------------");

    }
}
