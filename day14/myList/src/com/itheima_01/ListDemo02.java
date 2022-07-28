package com.itheima_01;

import java.util.ArrayList;
import java.util.List;

/*
    List集合特有方法：【因为List具有索引index，所以特有方法围绕这一特点】
        void add(int index,E element)：在此集合中的指定位置插入指定的元素
        E remove(int index)：删除指定索引处的元素，返回被删除的元素
        E set(int index,E element)：修改指定索引处的元素，返回被修改的元素
        E get(int index)：返回指定索引处的元素
        int indexOf(Object o) ：获取元素第一次出现的索引位置，如果不存在就返回-1
        List<E> subList(int fromIndex, int toIndex) ：返回从fromIndex到toIndex之间的子列表
        ListIterator<E> listIterator() ：返回ListIterator的迭代器，可遍历List
 */
public class ListDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        //void add(int index,E element)：在此集合中的指定位置插入指定的元素
//        list.add(1,"javaee");
        //IndexOutOfBoundsException
//        list.add(11,"javaee");//一共就3个元素，index最大为2，所以越界

        //E remove(int index)：删除指定索引处的元素，返回被删除的元素
//        System.out.println(list.remove(1));
        //IndexOutOfBoundsException
//        System.out.println(list.remove(11));

        //E set(int index,E element)：修改指定索引处的元素，返回被修改的元素
//        System.out.println(list.set(1,"javaee"));
        //IndexOutOfBoundsException
//        System.out.println(list.set(11,"javaee"));

        //E get(int index)：返回指定索引处的元素
//        System.out.println(list.get(1));
        //IndexOutOfBoundsException
//        System.out.println(list.get(11));

        //输出集合对象
//        System.out.println(list);

        //遍历集合
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));

        //用for循环改进遍历
        for (int i=0; i<list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
