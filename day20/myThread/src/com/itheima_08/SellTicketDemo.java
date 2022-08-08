package com.itheima_08;

/*
    卖票案例的思考

    安全问题出现的条件：
    （1）是多线程环境
    （2）有共享数据
    （3）有多条语句操作共享数据

    如何解决多线程安全问题呢?
    基本思想：让程序没有安全问题的环境

    怎么实现呢?
    把多条语句操作共享数据的代码给锁起来，让任意时刻只能有一个线程执行即可

    Java提供了同步代码块的方式来解决
    synchronized(任意对象) {
        多条语句操作共享数据的代码
    }
    synchronized(任意对象)：就相当于给代码加锁了，任意对象就可以看成是一把锁【监视器】
    对象如同锁，持有锁的线程可以在同步中执行。没有持有锁的线程即使获取CPU执行权，也进不去，因为没有获取锁。

    同步的前提：
    （1）必须要有两个或者两个以上的线程
    （2）必须是多个线程使用【同一个】锁
    必须保证同步中只能有一个线程在运行

    同步的好处和弊端
    好处：解决了多线程的数据安全问题
    弊端：当线程很多时，因为每个线程都会去判断同步上的锁，这是很耗费资源的，无形中会降低程序的运行效率
 */

public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket st = new SellTicket();

        Thread t1 = new Thread(st, "窗口1");
        Thread t2 = new Thread(st, "窗口2");
        Thread t3 = new Thread(st, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
