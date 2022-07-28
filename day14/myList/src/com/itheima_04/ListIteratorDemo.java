package com.itheima_04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
    ListIterator：列表迭代器
        通过List集合的listIterator()方法得到，所以说它是List集合特有的迭代器
        用于允许程序员沿任一方向遍历列表的列表的迭代器，在迭代期间修改列表，并获取列表中迭代器的当前位置

    ListIterator常用方法如下：
  ※（1）void add(E e) 将指定的元素插入列表（可选操作）。
    （2）boolean hasNext() 如果此列表迭代器在向前方向遍历列表时具有更多元素，则返回 true。
    （3）boolean hasPrevious() 如果此列表迭代器在相反方向遍历列表时具有更多元素，则返回 true。
    （4）E next() 返回列表中的下一个元素，并且前进光标位置。
    （5）int nextIndex() 返回由后续调用返回的元素的索引 next() 。         【头指针】
    （6）E previous() 返回列表中的上一个元素，并向后移动光标位置。
    （7）int previousIndex() 返回由后续调用返回的元素的索引 previous() 。 【尾指针】
    （8）void remove() 从列表中删除 next()或 previous() （可选操作）返回的最后一个元素。
    （9）void set(E e) 用指定的元素（可选操作）替换 next()或 previous()返回的最后一个元素。

 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        //通过List集合的listIterator()方法得到
//        ListIterator<String> lit = list.listIterator();
//        while (lit.hasNext()) {
//            String s = lit.next();
//            System.out.println(s);
//        }
//        System.out.println("--------");
//
//        while (lit.hasPrevious()) {
//            String s = lit.previous();
//            System.out.println(s);
//        }

        //获取列表迭代器
        ListIterator<String> lit = list.listIterator();//初始化将cursor赋值为0
        while (lit.hasNext()) {
            String s = lit.next();
            if(s.equals("world")) {//此时cursor指向world的下一个位置2
                System.out.println("+++"+lit.nextIndex());
                lit.add("javaee");//add操作成功后cursor就得+1，此时cursor=3
                System.out.println(lit.nextIndex());//nextIndex()方法返回cursor：3
            }
        }

        System.out.println(list);

    }

    /*源码分析

    public ListIterator<E> listIterator() {
        return new ListItr(0);
    }
    ListItr(int index) {
            super();
            cursor = index;
        }
    private class ListItr extends ArrayList.Itr implements ListIterator<E>{
        public void add(E e) {//执行完add操作后cursor加1
            try {
                ...
                cursor = i + 1;//cursor代表index of next element to return
                ...
            } catch (IndexOutOfBoundsException ex) {
                throw new ConcurrentModificationException();
            }
        }

        public int nextIndex() {
            return cursor;
        }
    }

    private class Itr implements Iterator<E> {
        public E next() {
                ...
                cursor = i + 1;//next（）返回元素后，cursor就会+1，指向下一个元素
                ...
        }

        public boolean hasNext() {
            return cursor != size;
        }
   }
     */
}
