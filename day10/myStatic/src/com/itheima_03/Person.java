package com.itheima_03;

public class Person {
    //构造代码块
    {
        m=300;
        System.out.println("父类构造代码块"+m);
    }

    //静态代码块
    static {
        m=200;
        System.out.println("父类静态代码块");
    }

    //父类静态变量
    public static int m=100;

    //静态常量
    public static final int mm=20;

    public Person(){
        System.out.println("父类构造函数");
    }

}
