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

    集合使用技巧：
    （1）看到Array就是数组结构：有index，查询快，增删慢
    （2）看到link就是链表结构：查询慢，增删快，有针对头节点和尾节点的增删改查操作
    （3）看到hash就是哈希表结构：就要想到哈希值，就要想到唯一性，则存入该数据中的元素必须重写equals和hashCode方法
    （4）看到二叉树就要想到排序，使用比较Comparable compareTo或者比较器Comparator compare
    （5）linkedHashSet和LinkedHashMap，保证存取顺序一致
    （6）不保证元素唯一就用List，保证唯一就用Set【保证唯一性的实现方式时hash值，和排序】
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
