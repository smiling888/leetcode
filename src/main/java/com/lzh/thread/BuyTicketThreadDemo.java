package com.lzh.thread;

import java.util.concurrent.atomic.AtomicInteger;

/******************************************************
 * @Date: 2021-04-24
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class BuyTicketThreadDemo {

    volatile static AtomicInteger ticketNum = new AtomicInteger();
    static Object lock = new Object();

    volatile static boolean finish = true;

    static Thread producer = new Thread() {
        @Override
        public void run() {
            int i = 0;
            while (i < 10) {
                try {
                    synchronized (lock) {
                        ticketNum.addAndGet(3);
                        lock.notifyAll();
                        i += 3;
                    }
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    };

    static class Consumer extends Thread {
        String name;

        public Consumer(String name) {
            this.name = "thread:" + name;
            super.setName(this.name);
        }

        @Override
        public void run() {
            try {
                synchronized (lock) {
                    if (ticketNum.get() <= 0) {
                        lock.wait();
                    }
                    ticketNum.decrementAndGet();
                    System.out.println(name + "getTick");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        producer.start();

        for (int i = 0; i < 10; i++) {
            new Consumer("" + i).start();
        }
    }
}
