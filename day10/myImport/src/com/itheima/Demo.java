package com.itheima;

import cn.itcast.Teacher;

/*c
     1、包的概念:包就是文件夹，用来管理类文件的
     2、包的定义格式：
        package 包名; (多级包用.分开)
        例如：package com.heima.demo;
     3、带包编译&带包运行
        带包编译：javac –d . 类名.java
        例如：javac -d .HelloWorld.java
        带包运行：java 包名+类名
        例如：java com.heima.demo.HelloWorld

     导包的意义：
     使用不同包下的类时，使用的时候要写类的全路径，写起来太麻烦了，为了简化带包的操作，Java就提供了导包的功能

     导包的格式：
     格式：import 包名;
     范例：import java.util.Scanner;
 */
public class Demo {
    public static void main(String[] args) {
//        Teacher t = new Teacher();

        /*
        cn.itcast.Teacher t = new cn.itcast.Teacher();
        t.teach();

        cn.itcast.Teacher t2 = new cn.itcast.Teacher();
        t2.teach();
        */

//        java.util.Scanner sc = new java.util.Scanner(System.in);


        Teacher t = new Teacher();
        t.teach();

    }
}