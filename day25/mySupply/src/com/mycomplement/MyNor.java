package com.mycomplement;
/*
    ��������������ʵ��������������ֵ
    tips:��1��a^0=a
         ��2��a^1=~a
         ��3��a^b^b=a
*/
public class MyNor {
    public static void main(String[] args) {
        int a=4;
        int b=8;
        System.out.println("����ǰ��"+"a="+a+","+"b="+b);

        a=a^b;
        b=a^b;//��a��ֵ��ֵ��b
        a=a^b;//��b��ֵ��ֵ��a
        System.out.println("������"+"a="+a+","+"b="+b);
    }
}
