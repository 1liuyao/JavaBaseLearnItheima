package com.mycomplement;
/*
    需求：用异或运算符实现两个整数互换值
    tips:（1）a^0=a
         （2）a^1=~a
         （3）a^b^b=a
*/
public class MyNor {
    public static void main(String[] args) {
        int a=4;
        int b=8;
        System.out.println("交换前："+"a="+a+","+"b="+b);

        a=a^b;
        b=a^b;//把a的值赋值给b
        a=a^b;//把b的值赋值给a
        System.out.println("交换后："+"a="+a+","+"b="+b);
    }
}
