package com.itheima_03;

public class Person {
    //��������
    {
        m=300;
        System.out.println("���๹������"+m);
    }

    //��̬�����
    static {
        m=200;
        System.out.println("���ྲ̬�����");
    }

    //���ྲ̬����
    public static int m=100;

    //��̬����
    public static final int mm=20;

    public Person(){
        System.out.println("���๹�캯��");
    }

}
