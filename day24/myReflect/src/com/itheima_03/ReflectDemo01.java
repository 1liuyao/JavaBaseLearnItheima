package com.itheima_03;

import com.itheima_02.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
    反射获取【构造方法】并使用

    java.lang.Class<T>
    T - 由此Class对象建模的类的类型。
    例如， String.class的类型是Class<String>。如果被建模的类是未知的，请使用Class<?>。

    （1）Constructor<?>[] getConstructors()：返回所有public修饰的构造方法对象的数组
    （2）Constructor<?>[] getDeclaredConstructors() 返回所有构造方法对象的数组，包含private public protected修饰的构造方法
    （3）Constructor getConstructor(Class<?>... parameterTypes) 返回【单个】public修饰的构造方法对象，
        注：不传入可变参数默认返回的是无参构造方法的构造器对象
           或者传入和构造方法形参对应的Class文件，例如：构造方法的形参是String类型，就传入String.class
    （4）Constructor getDeclaredConstructor(Class<?>...parameterTypes)返回单个构造方法对象，该构造器可以是被private public protected修饰的

 */
public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class对象
        Class<?> c = Class.forName("com.itheima_02.Student");

        //Constructor<?>[] getConstructors() 返回一个包含 Constructor对象的数组， Constructor对象反映了由该 Class对象表示的类的所有【公共】构造函数
//        Constructor<?>[] cons = c.getConstructors();//返回Student类中public修饰的构造方法
        //Constructor<?>[] getDeclaredConstructors() 返回反映由该Class对象表示的类声明的【所有】构造函数的 Constructor对象的数组
        Constructor<?>[] cons = c.getDeclaredConstructors();//返回Student类中所有的构造方法，包含private、public和protected
        for(Constructor con : cons) {
            System.out.println(con);
        }
        System.out.println("--------");

        //Constructor<T> getConstructor(Class<?>... parameterTypes) 返回一个 Constructor对象，该对象反映由该 Class对象表示的类的指定公共构造函数
        //Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes) 返回一个 Constructor对象，该对象反映由此 Class对象表示的类或接口的指定构造函数
        //参数：你要获取的【构造方法的参数的个数和数据类型】对应的【字节码文件对象】

        Constructor<?> con = c.getConstructor();

        //Constructor提供了一个类的单个构造函数的信息和访问权限
        //T newInstance(Object... initargs) 使用由此 Constructor对象表示的构造函数，使用指定的初始化参数来创建和初始化构造函数的声明类的新实例
        Object obj = con.newInstance();
        System.out.println(obj);//Student{name='null', age=0, address='null'}

//        Student s = new Student();
//        System.out.println(s);
    }
}
