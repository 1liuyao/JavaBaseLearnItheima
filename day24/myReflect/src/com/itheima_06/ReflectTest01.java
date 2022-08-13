package com.itheima_06;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*
    【通过反射越过泛型检查】

    练习1：我有一个ArrayList<Integer>集合，现在我想在这个集合中添加一个字符串数据，如何实现？
 */
public class ReflectTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //创建集合
        ArrayList<Integer> array = new ArrayList<Integer>();

//        array.add(10);
//        array.add(20);
//        array.add("hello");

        Class<? extends ArrayList> c = array.getClass();
        Method m = c.getMethod("add", Object.class);//泛型的定义并没有写入ArrayList的字节码文件，文件中仍然为add(Objet obj)

        m.invoke(array,"hello");
        m.invoke(array,"world");
        m.invoke(array,"java");

        System.out.println(array);
    }
}
