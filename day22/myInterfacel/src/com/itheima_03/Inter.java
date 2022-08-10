package com.itheima_03;

public interface Inter {
    default void show1() {
        System.out.println("show1开始执行");
//        System.out.println("初级工程师");
//        System.out.println("中级工程师");
//        System.out.println("高级工程师");
//        show();       //default方法可以调用非静态
        method();       //default方法可以调用静态
        System.out.println("show1结束执行");
        Inter.method1();
    }

    default void show2() {
        System.out.println("show2开始执行");
//        System.out.println("初级工程师");
//        System.out.println("中级工程师");
//        System.out.println("高级工程师");
//        show();
        method();
        System.out.println("show2结束执行");
    }

    private void show() {//接口中的非静态私有方法
        System.out.println("初级工程师");
        System.out.println("中级工程师");
        System.out.println("高级工程师");
    }

    static void method1() {
        System.out.println("method1开始执行");
//        System.out.println("初级工程师");
//        System.out.println("中级工程师");
//        System.out.println("高级工程师");
//        show();
        method();
        System.out.println("method1结束执行");
    }

    static void method2() {//静态只能调用静态
        System.out.println("method2开始执行");
//        System.out.println("初级工程师");
//        System.out.println("中级工程师");
//        System.out.println("高级工程师");
        method();
        System.out.println("method2结束执行");
    }

    private static void method() {//接口中的静态私有方法
        System.out.println("初级工程师");
        System.out.println("中级工程师");
        System.out.println("高级工程师");
    }
}