package com.itheima_01;

import java.io.PrintStream;

/*
    public static final PrintStream out：标准输出流。通常该流对应于显示输出【控制台】或由主机环境或用户指定的另一个输出目标

    输出语句的本质：是一个标准的输出流
    PrintStream ps = System.out;
    PrintStream类有的方法，System.out都可以使用
 */
public class SystemOutDemo {
    public static void main(String[] args) {
        //public static final PrintStream out：标准输出流
        PrintStream ps = System.out;

        //能够方便地打印各种数据值
//        ps.print("hello");
//        ps.print(100);

//        ps.println("hello");
//        ps.println(100);

        //System.out的本质是一个字节输出流
        System.out.println("hello");
        System.out.println(100);

        System.out.println();
//        System.out.print();//报错print方法必须有参数传递，println可以有参数可以无参数
    }
}
