package com.itheima_07;

/*
    卖票案例的思考：
    卖票出现了问题：
        相同的票出现了多次
        出现了负数的票
    问题产生原因：
        （1）线程执行的随机性导致的
        （2）存在多个线程操作共享数据
        （3）有多条语句对共享数据进行运算，因为这多条语句，在某一时刻被一个线程执行，还没有执行完，就被其他线程执行了

    如何找问题：
    （1）明确那些代码是多线程运行代码
    （2）明确共享数据
    （3）明确多线程运行代码中那些语句是操作共享数据的
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
