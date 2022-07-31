package com.itheima_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    Map集合的获取功能：
        V get(Object key):根据键获取值
        Set<K> keySet():获取所有键的集合
        Collection<V> values():获取所有值的集合【因为值不具有唯一性，无法确定用List还是Set存储】

    问题：为什么键集合Key可以使用Set集合存储？
    回答：因为键具有唯一性
 */
public class MapDemo03 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<String, String>();

        //添加元素
        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");

        //V get(Object key):根据键获取值
//        System.out.println(map.get("张无忌"));
//        System.out.println(map.get("张三丰"));//返回null

        //Set<K> keySet():获取所有键的集合
//        Set<String> keySet = map.keySet();
//        for(String key : keySet) {
//            System.out.println(key);
//        }

        //Collection<V> values():获取所有值的集合
        Collection<String> values = map.values();
        for(String value : values) {
            System.out.println(value);
        }
    }
}
