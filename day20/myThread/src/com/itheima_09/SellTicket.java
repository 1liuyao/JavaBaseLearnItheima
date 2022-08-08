package com.itheima_09;
/*
    当函数体内代码均需要加锁，则可以定义同步方法

    同步方法：就是把synchronized关键字加到方法上
    修饰符 synchronized 返回值类型 方法名(方法参数) {
        方法体；
    }

    同步方法的锁对象是什么呢?
    this

    静态同步方法
    同步静态方法：就是把synchronized关键字加到静态方法上
    修饰符 static synchronized 返回值类型 方法名(方法参数) {
        方法体；
    }

    同步静态方法的锁对象是什么呢?
    类名.class
 */
public class SellTicket implements Runnable {
//    private int tickets = 100;
    private static int tickets = 100;
    private Object obj = new Object();
    private int x = 0;

    @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
//                synchronized (obj) {
//                synchronized (this) {
                synchronized (SellTicket.class) {
                    if (tickets > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                        tickets--;
                    }
                }
            } else {
//                synchronized (obj) {
//                    if (tickets > 0) {
//                        try {
//                            Thread.sleep(100);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//                        tickets--;
//                    }
//                }
                sellTicket();
            }
            x++;
        }
    }

    //将同步代码块封装到函数中，整个函数体均被synchronized修饰
//    private void sellTicket() {
//        synchronized (obj) {
//            if (tickets > 0) {
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//                tickets--;
//            }
//        }
//    }

    //非静态同步方法
//    private synchronized void sellTicket() {
//        if (tickets > 0) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//            tickets--;
//        }
//    }

    //静态同步方法
    private static synchronized void sellTicket() {
        if (tickets > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
            tickets--;
        }
    }
}
