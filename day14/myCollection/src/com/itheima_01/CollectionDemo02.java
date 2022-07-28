package com.itheima_01;

import java.util.ArrayList;
import java.util.Collection;

/*
    Collection集合常用方法:
    （1）添加操作：①集合中添加单个元素：boolean add(E e)
                ②集合中添加多个元素，这多个元素用集合封装：boolean addAll(Collection<? extends E> c)
    （2）删除操作：①删除指定元素：boolean remove(Object o)
                ②删除多个元素，这多个元素已用集合封装：boolean removeAll(Collection<?> c)
                ③删除全部元素，清空操作：void clear():清空集合中的元素
    （3）判断操作：①判断集合是否为空：boolean isEmpty()
                ②判断集合是否含有某个元素：boolean contains(Object o)
                ③判断集合是否含有多个元素：boolean containsAll(Collection<?> c)
    （4）获取操作：①获取集合的长度，也就是集合中元素的个数：int size()
                ②获取集合中所有元素，也就是遍历集合：Iterator<E> iterator()
    （5）取交集：对当前集合保留与指定集合中的相同元素。
               如果两个集合相同，返回true，代表当前集合不需要修改；
               否则返回false，当前集合删除了与给定集合不相同的元素，表示当前集合被修改。
               boolean retainAll(Collection<?> c)
    （6）将集合变数组：toArray()

    Alt+7   打开一个窗口，能够看到类的所有信息
 */
public class CollectionDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c = new ArrayList<String>();

        //boolean add(E e):添加元素
//        System.out.println(c.add("hello"));
//        System.out.println(c.add("world"));
//        System.out.println(c.add("world"));//ArrayList可以存储重复元素
        c.add("hello");
        c.add("world");
        c.add("java");

        //boolean remove(Object o):从集合中移除指定的元素
//        System.out.println(c.remove("world"));
//        System.out.println(c.remove("javaee"));//删除集合中不存在的元素，对集合无影响

        //void clear():清空集合中的元素
//        c.clear();

        //boolean contains(Object o):判断集合中是否存在指定的元素
//        System.out.println(c.contains("world"));
//        System.out.println(c.contains("javaee"));

        //boolean isEmpty():判断集合是否为空
//        System.out.println(c.isEmpty());

        //int size():集合的长度，也就是集合中元素的个数
        System.out.println(c.size());


        //输出集合对象
        System.out.println(c);
    }
}
