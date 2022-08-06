package com.itheima_04;

public class ThreadSleep extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
            try {
                Thread.sleep(1000);//让每个线程都有机会抢占资源
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
