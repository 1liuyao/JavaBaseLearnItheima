package com.itheima_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
    ͨ������ʵ�����µĲ�����
        Student s = new Student("����ϼ",30,"����");
        System.out.println(s);

    ������������Ҳ����ͨ��.class�õ���Ӧ��Class����
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //��ȡClass����
        Class<?> c = Class.forName("com.itheima_02.Student");

        //public Student(String name, int age, String address)
        //Constructor<T> getConstructor(Class<?>... parameterTypes)
        Constructor<?> con = c.getConstructor(String.class, int.class, String.class);
        //������������Ҳ����ͨ��.class�õ���Ӧ��Class����

        //T newInstance(Object... initargs)
        Object obj = con.newInstance("����ϼ", 30, "����");
        System.out.println(obj);
    }
}
