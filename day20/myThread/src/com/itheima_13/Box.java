package com.itheima_13;

public class Box {
    //定义一个成员变量，表示第x瓶奶
    private int milk;
    //定义一个成员变量，表示奶箱的状态
    private boolean state = false;

    //提供存储牛奶和获取牛奶的操作
    public synchronized void put(int milk) {
        //如果有牛奶，等待消费
        while(state) {//由于唤醒线程是唤醒线程池中第一个线程，因此可能唤醒的是生产者线程，如果不循环判断，
            //则可能出现，一个生产者生产完，wait，唤醒了另一个之前被wait的生产者，此时不在需要判断标记，则会
            //导致连续生产了两次
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //如果没有牛奶，就生产牛奶
        this.milk = milk;
        System.out.println(Thread.currentThread().getName()+ "送奶工将第" + this.milk + "瓶奶放入奶箱");

        //生产完毕之后，修改奶箱状态
        state = true;

        //唤醒其他等待的线程
        notifyAll();//相当于this.notifyAll()，循环判断标记后，可能出现所有线程都被冻结的状态，所以使用notifyAll
    }

    public synchronized void get() {
        //如果没有牛奶，等待生产
        while(!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //如果有牛奶，就消费牛奶
        System.out.println(Thread.currentThread().getName()+ "用户拿到第" + this.milk + "瓶奶");

        //消费完毕之后，修改奶箱状态
        state = false;

        //唤醒其他等待的线程
        notifyAll();//相当于this.notifyAll()
    }
}
