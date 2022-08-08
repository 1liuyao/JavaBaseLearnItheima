package com.itheima_15;

/*
    特殊情况：当线程处于冻结状态，就不会读取到标记，那么线程就不会结束.

    解决方法：void interrupt() 中断这个线程。将线程从阻塞状态转成就绪状态。
 */

public class StopInterruptThread1 {
    public static void main(String[] args) {
       StopThread1 st = new StopThread1();

        Thread t1 = new Thread(st);
        Thread t2 = new Thread(st);

        t1.start();
        t2.start();

        int num = 0;

        while (true) {
            if (num++ == 60) {
                t1.interrupt();//将线程从wait中转成就绪状态
                t2.interrupt();
                break;
            }
            System.out.println(Thread.currentThread().getName() + "...main");
        }
    }
}

class StopThread1 implements Runnable {
    private boolean flag = true;//通过定义循环标记控制run中while的执行

    @Override
    public synchronized void run() {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("中断异常");
                flag=false;
            }
            System.out.println(Thread.currentThread().getName() + "...run");
        }
    }

    public void setFlag() {
        flag = false;
    }
}

