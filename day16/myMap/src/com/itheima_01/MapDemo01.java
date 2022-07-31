package com.itheima_01;

import java.util.HashMap;
import java.util.Map;

/*
    Map集合概述
        Interface Map<K,V>	K：键的类型；V：值的类型
        将键映射到值的对象；不能包含重复的键；每个键可以映射到最多一个值【null】
        举例：学生的学号和姓名
              itheima001	林青霞
              itheima002	张曼玉
              itheima003	王祖贤

    创建Map集合的对象
        多态的方式
        具体的实现类HashMap

    Map集合的特点：
    （1）键值对映射关系
    （2）一个键对应一个值
    （3）键不能重复【hash表决定】，值可以重复
    （4）元素存取无序

    Map：---HashTable：底层是哈希表数据结构，线程同步，不可以存储null键，null值
         ---HashMap：底层是哈希表数据结构，线程不同步，可以存储null键，null值
         ---TreeMap：底层是二叉树结构，线程不同步，不可以存储null键，null值,可以对集合中的键进行指定顺序排序
 */
public class MapDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<String,String>();

        //V put(K key, V value) 将指定的值与该映射中的指定键相关联
        map.put("itheima001","林青霞");
        map.put("itheima002","张曼玉");
        map.put("itheima003","王祖贤");
        map.put("itheima003","柳岩");//会覆盖前一个相同建对应的值，所以put方法也可以用来修改元素的value

        //输出集合对象
        System.out.println(map);
    }
}
