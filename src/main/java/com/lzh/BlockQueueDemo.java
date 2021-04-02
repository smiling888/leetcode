package com.lzh;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/******************************************************
 * @Date: 2021-03-24
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class BlockQueueDemo {


    static class BlockQueueS<T> {
        Lock lock = new ReentrantLock();

        Condition notEmpty = lock.newCondition();
        Condition notFull = lock.newCondition();

        LinkedList<T> queue = new LinkedList();
        int size;

        public BlockQueueS(int size) {
            this.size = size;
        }

        public void put(T data) {

            lock.lock();
            try {
                while (queue.size() == size) {
                    notFull.await();
                }
                queue.push(data);
                notEmpty.notifyAll();

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

        public T get() {
            lock.lock();
            T data = null;
            try {
                while (queue.size() == 0) {
                    notEmpty.await();
                }

                data = queue.removeFirst();

                notFull.notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
            return data;
        }
    }
}
