package com.itheima_13;

/*
   需求：存在多个生产者，多个消费者,实现生产一个消费一个的目标

   对于多个生产者和多个消费者的情况
   为什么要定义while判断标记？
   原因：让被唤醒的线程再一次判断标记

   为什么定义notifyAll
   因为需要唤醒对方线程
   因为只用notify，容易出现只唤醒本方线程的情况，导致程序中所有线程都等待
 */
public class BoxDemo2 {
    public static void main(String[] args) {
        //创建奶箱对象，这是共享数据区域
        Box b = new Box();

        //创建生产者对象，把奶箱对象作为构造方法参数传递，因为在这个类中要调用存储牛奶的操作
        Producer p = new Producer(b);
        //创建消费者对象，把奶箱对象作为构造方法参数传递，因为在这个类中要调用获取牛奶的操作
        Customer c = new Customer(b);

        //创建2个线程对象，分别把生产者对象和消费者对象作为构造方法参数传递【单个消费者，单个生产者】
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);
        Thread t3 = new Thread(c);
        Thread t4 = new Thread(c);

        //启动线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
