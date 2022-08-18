package com.myenum;

/*
    【使用enum关键字定义的枚举类实现接口】
    （1）情况1：实现接口，在enum类中实现接口中的抽象方法
    （2）情况2：针对每一个枚举常量对象给出接口中抽象方法的不同实现方式

 */

public class MyEnumInterface {
    public static void main(String[] args) {
        Season2.SUMMER.show();
    }
}


