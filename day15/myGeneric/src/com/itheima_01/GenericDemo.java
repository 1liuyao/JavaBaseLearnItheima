package com.itheima_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    需求：Collection集合存储字符串并遍历
 */
public class GenericDemo {
    public static void main(String[] args) {
        //创建集合对象
//        Collection c = new ArrayList();
        Collection<String> c = new ArrayList<String>();

        //添加元素，add(object),用object接受所有对象的引用，所以后续想要使用对象的特有方法，需要向下转型
        c.add("hello");
        c.add("world");
        c.add("java");
//        c.add(100);//运行时报异常ClassCastException，因为集合存储了String和Integer两种类型
                    //因为编写代码时并没有提示，所以调用这认为可以存储任意类型，导致程序运行时报错
                    //采用<>泛型，在定义集合时就明确要存储的元素类型，一旦写代码时存入元素类型与定义泛型不符
                    //就会报错，强制修改代码。【将运行时异常提前到编译时期，更加安全】

        //遍历集合
//        Iterator it = c.iterator();
        Iterator<String> it = c.iterator();
        while (it.hasNext()) {
//            Object obj = it.next();
//            System.out.println(obj);
//            String s = (String)it.next(); //ClassCastException
            String s = it.next();//不再需要添加强制类型转换
            System.out.println(s);
        }
    }
}
