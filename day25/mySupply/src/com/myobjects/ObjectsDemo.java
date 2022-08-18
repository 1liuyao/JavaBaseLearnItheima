package com.myobjects;

/*
    Objects�Ƕ���Ĺ�����

    static boolean equals(Object a, Object b)
    static boolean isNull(Object obj) ���� true����ṩ�������� null���򷵻� false ��
    static boolean nonNull(Object obj) ���� true����ṩ�Ĳο��Ƿ� null���򷵻� false ��

 */

import com.myclone.User;

import java.util.Objects;

public class ObjectsDemo {
    public static void main(String[] args) {
        User u1=null;
        User u2=new User(1,"zhangsan","123","1", new int[]{1, 2});

        //ϸ�ڣ�
        //1�������ײ���ж�s1�Ƿ�Ϊnull�����Ϊnull��ֱ�ӷ���false
        //2�����s1��Ϊnull����ô������s1�ٴε���equals����
        //3����ʱs1��User���ͣ��������ջ����User�е�equals����
        //���User��û����дequals��������Ƚϵ�ֵַ�������д�ˣ��ͱȽ�����ֵ��
        boolean result = Objects.equals(u1, u2);
        System.out.println(result);

        System.out.println("-----------------");
        System.out.println(Objects.isNull(u1));
        System.out.println(Objects.nonNull(u1));
        System.out.println(Objects.isNull(u2));
        System.out.println(Objects.nonNull(u2));
    }
}

//Objects��������equals����Դ��
//    public static boolean equals(Object a, Object b) {
//        return (a == b) || (a != null && a.equals(b));
//    }
