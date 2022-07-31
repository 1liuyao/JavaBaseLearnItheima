package com.itheima_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    Map集合的遍历(方式1):
        1:获取所有键的集合。用keySet()方法实现
        2:遍历键的集合，获取到每一个键。用增强for实现
        3:根据键去找值。用get(Object key)方法实现

    Map集合想要遍历获取元素：
    （1）Map中没有定义迭代器，但是Collection集合中定义了迭代器，只要将Map转成Set，
        因为Map集合具备键的唯一性，其实Set集合就来自于Map，Set集合底层用的就是Map方法。【相当于value为null】
    （2）运用map自身提供的遍历方法
 */
public class MapDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<String, String>();

        //添加元素
        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");

        //获取所有键的集合。用keySet()方法实现
        Set<String> keySet = map.keySet();
        //遍历键的集合，获取到每一个键。用增强for实现
        for (String key : keySet) {
            //根据键去找值。用get(Object key)方法实现
            String value = map.get(key);
            System.out.println(key + "," + value);
        }
    }
}
