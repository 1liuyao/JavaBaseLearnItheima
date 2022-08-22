package com.itheima_03;

public class Student extends Person{
    //子类静态变量
    public static int mi=50;
    //静态常量
    public static final int me=10;
    //构造代码块
    {
        mi=100;
        System.out.println("子类构造代码块"+mi);
    }

    //静态代码块
    static {
        mi=150;
        System.out.println("子类静态代码块"+mi);
    }

    public Student(){
        System.out.println("子类构造函数");
    }

}
