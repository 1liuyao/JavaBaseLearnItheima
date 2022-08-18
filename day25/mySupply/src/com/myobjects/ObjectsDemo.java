package com.myobjects;

/*
    Objects是对象的工具类

    static boolean equals(Object a, Object b)
    static boolean isNull(Object obj) 返回 true如果提供的引用是 null否则返回 false 。
    static boolean nonNull(Object obj) 返回 true如果提供的参考是非 null否则返回 false 。

 */

import com.myclone.User;

import java.util.Objects;

public class ObjectsDemo {
    public static void main(String[] args) {
        User u1=null;
        User u2=new User(1,"zhangsan","123","1", new int[]{1, 2});

        //细节：
        //1、方法底层会判断s1是否为null，如果为null，直接返回false
        //2、如果s1不为null，那么就利用s1再次调用equals方法
        //3、此时s1是User类型，所以最终会调用User中的equals方法
        //如果User中没有重写equals方法，则比较地址值，如果重写了，就比较属性值。
        boolean result = Objects.equals(u1, u2);
        System.out.println(result);

        System.out.println("-----------------");
        System.out.println(Objects.isNull(u1));
        System.out.println(Objects.nonNull(u1));
        System.out.println(Objects.isNull(u2));
        System.out.println(Objects.nonNull(u2));
    }
}

//Objects工具类中equals方法源码
//    public static boolean equals(Object a, Object b) {
//        return (a == b) || (a != null && a.equals(b));
//    }
