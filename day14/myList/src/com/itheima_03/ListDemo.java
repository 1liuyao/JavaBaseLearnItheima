package com.itheima_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
    需求：
        我有一个集合：List<String> list = new ArrayList<String>();
        里面有三个元素：list.add("hello");list.add("world");list.add("java");
        遍历集合，得到每一个元素，看有没有"world"这个元素，如果有，我就添加一个"javaee"元素，请写代码实现

    ConcurrentModificationException:当不允许这样的修改时，可以通过检测到对象的并发修改的方法来抛出此异常

    问题：为什么会抛出异常呢？
    回答：使用迭代器对List进行遍历时，想要对元素进行操作，比如满足条件添加新元素。由于Colletion迭代器不具备add操作，
         所以使用List对象的add方法添加元素。那么，在这个过程中，存在Iterator引用和List引用同时操作元素的现象，同时
         List add元素时，迭代器不知道，所以会出现异常情况

    如果在遍历集合过程中，还能对元素进行操作呢？
    （1）方式一：使用for循环根据index遍历List，只是用List引用 add方法操作数组
    （2）方式二：使用List特有迭代器ListIterator，该接口是Iterator的子接口，listIterator()迭代器封装了add方法。

 */
public class ListDemo {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        //遍历集合，得到每一个元素，看有没有"world"这个元素，如果有，我就添加一个"javaee"元素，请写代码实现
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            String s = it.next();//迭代器引用在操作元素
//            if(s.equals("world")) {
//                list.add("javaee");//List引用也在操作元素
//            }
//        }
//        抛出：Exception in thread "main" java.util.ConcurrentModificationException

        //方式一：使用for循环根据index遍历List，只是用List引用 add方法操作数组，
        // 这种方式在集合【末尾】添加，[hello, world, java, javaee]
        for(int i=0; i<list.size(); i++) {
            String s = list.get(i);
            if(s.equals("world")) {
                list.add("javaee");
            }
        }

        //方式二：采用ListIterator
        // 这种方式，在满足条件后的元素后加，[hello, world, javaee, java]
//        ListIterator<String> stringListIterator = list.listIterator();
//        while (stringListIterator.hasNext()){
//            if ("world".equals(stringListIterator.next())){
//                stringListIterator.add("javaee");
//            }
//        }
        //方式2的for写法，同时迭代器用完，iterator引用变量就消失了，更省内存
//        for(ListIterator iterator=list.listIterator();iterator.hasNext();){
//            if ("world".equals(iterator.next())){
//                iterator.add("javaee");
//            }
//        }

        //输出集合对象
        System.out.println(list);
    }
}
