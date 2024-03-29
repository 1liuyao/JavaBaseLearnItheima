package com.itheima_02;

/*
    Thread类中获取和设置线程名称的方法：
        void setName(String name)：将此线程的名称更改为等于参数 name
        String getName()：返回此线程的名称
        Thread(String name)：子类通过调用父类带参构造方法实现线程名称设置

    如何获取main()方法所在的线程名称？
    static Thread currentThread()：返回当前正在执行的线程对象的引用。
 */
public class MyThreadDemo {
    public static void main(String[] args) {
//        MyThread my1 = new MyThread();
//        MyThread my2 = new MyThread();
//
//        //void setName(String name)：将此线程的名称更改为等于参数 name
//        my1.setName("高铁");
//        my2.setName("飞机");

        //Thread(String name)【利用父类的构造函数初始化进行名称】
//        MyThread my1 = new MyThread("高铁");
//        MyThread my2 = new MyThread("飞机");
//
//        my1.start();
//        my2.start();

        //static Thread currentThread() 返回对当前正在执行的线程对象的引用
        System.out.println(Thread.currentThread().getName());
    }
}
