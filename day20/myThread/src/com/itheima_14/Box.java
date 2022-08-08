package com.itheima_14;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Box {
    //定义一个成员变量，表示第x瓶奶
    private int milk;
    //定义一个成员变量，表示奶箱的状态
    private boolean state = false;
    //声明锁对象，使用其子类
    Lock lock = new ReentrantLock();
    //因为线程必须持有锁才能调用等待唤醒方法，所以可以通过lock获得Condition对象
    Condition condition_pro = lock.newCondition();
    Condition condition_con = lock.newCondition();

    //提供存储牛奶和获取牛奶的操作
    public void put(int milk) {
        //如果有牛奶，等待消费
        lock.lock();
        try {
            while (state) {//由于唤醒线程是唤醒线程池中第一个线程，因此可能唤醒的是生产者线程，如果不循环判断，
                //则可能出现，一个生产者生产完，wait，唤醒了另一个之前被wait的生产者，此时不在需要判断标记，则会
                //导致连续生产了两次
                condition_pro.await();
            }

            //如果没有牛奶，就生产牛奶
            this.milk = milk;
            System.out.println(Thread.currentThread().getName() + "送奶工将第" + this.milk + "瓶奶放入奶箱");

            //生产完毕之后，修改奶箱状态
            state = true;

            //唤醒其他等待的线程
            condition_con.signal();//相当于this.notifyAll()，循环判断标记后，可能出现所有线程都被冻结的状态，所以使用notifyAll
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public synchronized void get() {
        //如果没有牛奶，等待生产
        lock.lock();
        try {
            while (!state) {
                condition_con.await();
            }

            //如果有牛奶，就消费牛奶
            System.out.println(Thread.currentThread().getName() + "用户拿到第" + this.milk + "瓶奶");

            //消费完毕之后，修改奶箱状态
            state = false;

            //唤醒其他等待的线程
            condition_pro.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
