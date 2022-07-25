package com.itheima_02;

import java.util.Arrays;

/*
    Arrays 类包含用于操作数组的各种方法

    public static String toString(int[] a)：返回指定数组的内容的字符串表示形式
    public static void sort(int[] a)：按照数字顺序排列指定的数组

    工具类设计思想
    1、构造方法用 private 修饰：防止外界创造对象
    2、成员方法用 public static：构造函数私有化后，需要用类名访问
    3、成员变量：public static final：定义成常量，工具类使用的是其功能，但是方法被定义成静态后，只能访问静态成员属性

    类级别的修饰符：默认访问权限，public，abstract，final
    成员属性修饰符：四种访问权限，static，final
    成员方法修饰符：四种访问权限，abstract，static，final
    局部变量修饰符：final
    注：对于内部类，处于哪个位置【成员变量，局部变量】，就遵循哪个位置的规则，
    但是都可使用abstract修饰，但是没有什么意义，因为定义内部类就是不想被访问到，
    基本都会使用private修饰。

 */
public class ArraysDemo {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {24, 69, 80, 57, 13};

        System.out.println("排序前：" + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("排序后：" + Arrays.toString(arr));

//        Math;构造方法私有化了
//        System;构造方法私有化了
    }
}
