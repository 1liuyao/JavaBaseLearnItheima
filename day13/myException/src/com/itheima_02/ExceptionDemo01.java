package com.itheima_02;

/*
    try {
        可能出现异常的代码;
    } catch(异常类名 变量名) {
        异常的处理代码;
    }

    执行流程：程序从try里面的代码开始执行
    出现异常后，会自动生成一个异常类对象，该异常类对象被提交给Java运行时系统
    当Java运行时系统接收到异常对象时，会到catch中去找匹配的异常类，找到后进行异常的处理
    执行完毕后，程序还可以继续往下执行

    语句：try{}
         catch{}
         finally{}
    语句：try{}
         finally{}

    finally语句块的作用
    （1）无论函数是否发生异常，是否提前return跳出函数，都会执行finally语句
    （2）通常使用无论程序如何执行，是否发生异常，都一定要关闭资源的情况。例如，和数据库创建链接，无论数据是否操作成功，一定要关闭资源
    （3）try{}finally{}的作用只为关闭释放资源。
 */
public class ExceptionDemo01 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    //如果不捕获异常，程序在运行时JVM会打印错误信息，然后停掉程序
    //现在捕获了异常程序可以跑完
    public static void method() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
            System.out.println("这里能够访问到吗");
        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("你访问的数组索引不存在，请回去修改为正确的索引");
            e.printStackTrace();
        }
    }
}
