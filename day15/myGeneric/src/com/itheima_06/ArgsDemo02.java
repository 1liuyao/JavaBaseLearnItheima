package com.itheima_06;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/*
    Arrays工具类中有一个静态方法：
        （1）public static <T> List<T> asList(T... a)：返回由指定数组支持的固定大小的列表，实现数组到List的转换
        （2）不支持增删操作
        （3）支持修改操作
    List接口中有一个静态方法：jdk 9以后出现
        （1）public static <E> List<E> of(E... elements)：返回包含任意数量元素的不可变列表
        （2）不支持增删改
    Set接口中有一个静态方法：jdk 9以后出现
        （1）public static <E> Set<E> of(E... elements) ：返回一个包含任意数量元素的不可变集合
        （2）不可增删改
 */
public class ArgsDemo02 {
    public static void main(String[] args) {
        //public static <T> List<T> asList(T... a)：返回由指定数组支持的固定大小的列表
        List<String> list = Arrays.asList("hello", "world", "java");
//
////        list.add("javaee"); //UnsupportedOperationException
////        list.remove("world"); //UnsupportedOperationException
        list.set(1,"javaee");//支持修改操作
//
//        System.out.println(list);

        //public static <E> List<E> of(E... elements)：返回包含任意数量元素的不可变列表
 //       List<String> list1 = List.of("hello", "world", "java", "world");
//
////        list.add("javaee");//UnsupportedOperationException
////        list.remove("java");//UnsupportedOperationException
////        list.set(1,"javaee");//UnsupportedOperationException
//
//        System.out.println(list);

        //public static <E> Set<E> of(E... elements) ：返回一个包含任意数量元素的不可变集合
//        Set<String> set = Set.of("hello", "world", "java","world"); //IllegalArgumentException
 //       Set<String> set = Set.of("hello", "world", "java");

//        set.add("javaee");//UnsupportedOperationException
//        set.remove("world");//UnsupportedOperationException

 //       System.out.println(set);
    }
}
