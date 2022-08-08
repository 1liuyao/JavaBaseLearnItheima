package com.itheima_14;

/*
    需求：在多生产者，多消费者的情况下，如何让生产者线程只唤醒消费者线程
         解决notifyAll带来的唤醒本方线程的问题。

    解决方案：Lock+Condition
    （1）将Synchronized换成显示的加锁，释放锁操作
    （2）将Object类中的等待唤醒操作，改为Condition类中的await，signal方法
    （3）通过对同一个lock声明多个condition对象来唤醒指定方线程
 */
public class BoxDemo3 {
    public static void main(String[] args) {
        //创建奶箱对象，这是共享数据区域
        Box b=new Box();

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
