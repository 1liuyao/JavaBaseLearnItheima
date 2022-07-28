package com.itheima_02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    Iterator：迭代器，集合的专用遍历方式
        Iterator<E> iterator()：返回此集合中元素的迭代器，通过集合的iterator()方法得到
        迭代器是通过集合的iterator()方法得到的，所以我们说它是依赖于集合而存在的

    Iterator中的常用方法
        获取：E next()：返回迭代中的下一个元素
        判断：boolean hasNext()：如果迭代具有更多元素，则返回 true
        删除：default void remove()：从底层集合中删除此迭代器返回的最后一个元素（可选操作）。
        注意：Collection集合中不具备【添加元素】操作，如果在迭代器遍历过程中添加元素，那么会发生异常

    问题：迭代器为什么被声明在Collection集合【子接口/实现类】中？
    回答：因为每一种集合都是一种数据结构，都需要遍历集合，都应该has a iterator

    问题：为什么提供Iterator接口？
    回答：每一个集合都有自己的数据结构，都有特定的取出自己内部元素的方式。为了便于操作所有的容器，取出元素。将
         容器内部的去除方式按照一个的统一的规则向外提供，这个规则就是Iterator接口。也就是说，只要通过该接口
         就可以取出Collection集合中的元素，至于每一个具体的容器依据自己的数据结构，如果实现具体的取出细节，
         这个不用关心，这样就降低了取出元素和具体集合的耦合性。
 */
public class IteratorDemo {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c = new ArrayList<String>();

        //添加元素
        c.add("hello");
        c.add("world");
        c.add("java");

        //Iterator<E> iterator()：返回此集合中元素的迭代器，通过集合的iterator()方法得到
        Iterator<String> it = c.iterator();
        /*
            public Iterator<E> iterator() {
                return new Itr();//返回Iterator实现类对象，
                                //由于Itr是内部类，所以需在外部类中给出访问内部类对象的方法
            }

            private class Itr implements Iterator<E> {
            //Itr定义在ArrayList内部，是内部类，实现了hasNext()和next()方法
                ...
            }
         */

        //E next()：返回迭代中的下一个元素
        /*
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next()); //NoSuchElementException:表示被请求的元素不存在
        */

        //boolean hasNext()：如果迭代具有更多元素，则返回 true
        /*
        if(it.hasNext()) {
            System.out.println(it.next());
        }

        if(it.hasNext()) {
            System.out.println(it.next());
        }

        if(it.hasNext()) {
            System.out.println(it.next());
        }

        if(it.hasNext()) {
            System.out.println(it.next());
        }
        */

        //用while循环改进判断
        while (it.hasNext()) {
//            System.out.println(it.next());
            String s = it.next();//拿到元素后，方便后续对元素进行操作
            System.out.println(s);
        }

    }
}
