package com.itheima_10;

import java.util.*;

/*
StringBuffer
        线程安全，可变的字符序列
        从版本JDK 5开始，被StringBuilder 替代。
        通常应该使用StringBuilder类，因为它支持所有相同的操作，但它更快，因为它不执行同步
Vector
        从Java 2平台v1.2开始，该类改进了List接口，使其成为Java Collections Framework的成员。
        与新的集合实现不同， Vector被同步。 如果不需要线程安全的实现，建议使用ArrayList代替Vector
Hashtable
        该类实现了一个哈希表，它将键映射到值。 任何非null对象都可以用作键或者值
        从Java 2平台v1.2开始，该类进行了改进，实现了Map接口，使其成为Java Collections Framework的成员。
        与新的集合实现不同， Hashtable被同步。 如果不需要线程安全的实现，建议使用HashMap代替Hashtable

将非同步集合转化为同步集合的方法：集合工具类Collections
static <T> List<T> synchronizedList(List<T> list)
static <K,V> Map<K,V> synchronizedMap(Map<K,V> m)
static <T> Set<T> synchronizedSet(Set<T> s)
 */
public class ThreadDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();

        Vector<String> v = new Vector<String>();
        ArrayList<String> array = new ArrayList<String>();

        Hashtable<String,String> ht = new Hashtable<String, String>();
        HashMap<String,String> hm = new HashMap<String, String>();

        //static <T> List<T> synchronizedList(List<T> list) 将线程不安全的列表转成线程安全的列表
        List<String> list = Collections.synchronizedList(new ArrayList<String>());
    }
}
