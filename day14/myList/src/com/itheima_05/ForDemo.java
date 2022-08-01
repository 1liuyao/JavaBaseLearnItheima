package com.itheima_05;

import java.util.ArrayList;
import java.util.List;

/*
    增强for：简化数组和Collection集合的遍历
        实现Iterable接口的类允许其对象成为增强型 for语句的目标
        它是JDK5之后出现的，其内部原理是一个Iterator迭代器，所以最好在遍历的时候不要做修改操作

    格式：
        for(元素数据类型 变量名 : 数组或者Collection集合) {
            //在此处使用变量即可，该变量就是元素
        }

    注意事项：
    （1）在遍历集合时，不能对集合进行增删改
    （2）使用增强for时，不能对元素进行赋值
 */
public class ForDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i : arr) {
            System.out.println(i);
            i=100;//此操作，改变不了数组的值
        }
        System.out.println("--------");

        String[] strArray = {"hello","world","java"};
        for(String s : strArray) {
            System.out.println(s);
        }
        System.out.println("--------");

        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");

        for(String s : list) {
            System.out.println(s);
            s="abc";//此操作，改变不了数组的值
        }
        System.out.println("--------");

        //内部原理是一个Iterator迭代器

//        for(String s : list) {//说明本质还是一个Iterator
//            if(s.equals("world")) {
//                list.add("javaee"); //ConcurrentModificationException
//            }
//        }


    }
}
