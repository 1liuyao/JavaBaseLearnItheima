package com.itheima_03;

public class Student extends Person{
    //���ྲ̬����
    public static int mi=50;
    //��̬����
    public static final int me=10;
    //��������
    {
        mi=100;
        System.out.println("���๹������"+mi);
    }

    //��̬�����
    static {
        mi=150;
        System.out.println("���ྲ̬�����"+mi);
    }

    public Student(){
        System.out.println("���๹�캯��");
    }

}
