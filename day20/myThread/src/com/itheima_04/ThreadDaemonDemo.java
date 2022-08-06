package com.itheima_04;

/*
    void setDaemon(boolean on)：将此线程标记为守护线程，当运行的线程都是守护线程时，Java虚拟机将退出
    主线程执行完毕死亡，即使守护线程未执行完，Java虚拟机也会退出
 */
public class ThreadDaemonDemo {
    public static void main(String[] args) {
        ThreadDaemon td1 = new ThreadDaemon();
        ThreadDaemon td2 = new ThreadDaemon();

        td1.setName("关羽");
        td2.setName("张飞");

        //设置主线程为刘备
        Thread.currentThread().setName("刘备");//main为主线程，当执行完主函数代码后，JVM退出，守护线程td1和td2不会立即死亡，还会扑腾两下

        //设置守护线程
        td1.setDaemon(true);
        td2.setDaemon(true);

        td1.start();
        td2.start();

        for(int i=0; i<10; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
