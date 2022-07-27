package com.itheima_01;

import java.util.ArrayList;
import java.util.Collection;

/*
    集合的特点：
    （1）对象封装了数据，对象多了也需要存储，集合就用于存储对象
    （2）对象的个数确定，可以使用数组，但是不确定怎么办？可以使用集合，因为集合是可变长度的

    集合和数组的区别：
    （1）数组固定长度，集合可变长度的
    （2）数组可以存储基本数据类型，也可以存储引用数据类型；集合只能存储引用数据类型
    （3）数组存储的元素必须是同一个数据类型；集合存储的对象可以是不同数据类型

    创建Collection集合的对象
        多态的方式
        ArrayList()
 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        //创建Collection集合的对象
        Collection<String> c = new ArrayList<String>();

        //添加元素：boolean add(E e)
        c.add("hello");
        c.add("world");
        c.add("java");

        //输出集合对象
        System.out.println(c);//对象的toString形式[hello, world, java]

    }
}
