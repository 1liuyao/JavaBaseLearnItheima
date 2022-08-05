package com.itheima_04;

import java.util.Properties;
import java.util.Set;

/*  Properties介绍：相当与封装了之前demo中Map结合到文件的操作
    （1）是一个Map体系的集合类
    （2）Properties可以保存到流中或从流中加载
    （3）属性列表中的每个键及其对应的值都是一个【字符串】
    （4）继承自java.util.Hashtable<Object,Object>
    （5）常用于配置文件

    Properties作为Map集合的使用
 */
public class PropertiesDemo01 {
    public static void main(String[] args) {
        //创建集合对象
//        Properties<String,String> prop = new Properties<String,String>(); //错误，此类不是泛型类
        Properties prop = new Properties();

        //存储元素
        prop.put("itheima001", "林青霞");
        prop.put("itheima002", "张曼玉");
        prop.put("itheima003", "王祖贤");

        //遍历集合
        Set<Object> keySet = prop.keySet();//没有指定泛型，就是Object
        for (Object key : keySet) {
            Object value = prop.get(key);
            System.out.println(key + "," + value);
        }
    }
}
