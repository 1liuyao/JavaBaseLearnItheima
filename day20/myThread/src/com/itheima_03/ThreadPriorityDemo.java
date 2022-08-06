package com.itheima_03;

/*
    线程调度两种调度方式：
    （1）分时调度模型：所有线程轮流使用CPU的使用权，平均分配每个线程占用CPU的时间片
    （2）抢占式调度模型：优先让优先级高的线程使用 CPU，如果线程的优先级相同，那么会随机选择一个，优先级高的线程获取的CPU时间片相对多一些

    Java使用的是抢占式调度模型

    随机性：假如计算机只有一个CPU，那么CPU在某一个时刻只能执行一条指令，线程只有得到CPU时间片，也
           就是使用权，才可以执行指令。所以说多线程程序的执行是有随机性，因为谁抢到CPU的使用权是不一定的，
           优先级高的线程只是获取CPU使用权的概率更大，并不是优先级高的线程一定会获得CPU使用权

    Thread类中设置和获取线程优先级的方法
        public final void setPriority(int newPriority)：更改此线程的优先级
        public final int getPriority()：返回此线程的优先级

    static int MAX_PRIORITY 线程可以拥有的最大优先级为10。
    static int MIN_PRIORITY 线程可以拥有的最小优先级为1。
    static int NORM_PRIORITY 分配给线程的默认优先级为5。

 */
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();

        tp1.setName("高铁");
        tp2.setName("飞机");
        tp3.setName("汽车");

        //public final int getPriority()：返回此线程的优先级
//        System.out.println(tp1.getPriority()); //5
//        System.out.println(tp2.getPriority()); //5
//        System.out.println(tp3.getPriority()); //5

        //public final void setPriority(int newPriority)：更改此线程的优先级
//        tp1.setPriority(10000); //IllegalArgumentException：优先级不在 MIN_PRIORITY到 MAX_PRIORITY范围内。
//        System.out.println(Thread.MAX_PRIORITY); //10
//        System.out.println(Thread.MIN_PRIORITY); //1
//        System.out.println(Thread.NORM_PRIORITY); //5

        //设置正确的优先级
        tp1.setPriority(5);
        tp2.setPriority(10);
        tp3.setPriority(1);


        tp1.start();
        tp2.start();
        tp3.start();
    }
}
