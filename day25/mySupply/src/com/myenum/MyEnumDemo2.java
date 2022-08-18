package com.myenum;

/*
    【使用enum关键字定义枚举类】
    （1）相比于jdk5.0之前自定义枚举类的方式，采用enum定义在书写上省略了代码中的重复部分
        ①构造函数可以省略private关键字
        ②需要将常量对象声明在类中的第一行
        ③省略创建常量对象时声明的private static final关键字
        ④省略new对象写法
        ⑤通常不重写toString()方法
    （2）enum定义的枚举类继承自class java.lang.Enum，并不继承自Object
 */

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MyEnumDemo2 {
    public static void main(String[] args) {
        Season1 autumn = Season1.AUTUMN;
        System.out.println(autumn);//AUTUMN，没有打印地址值

        System.out.println(Season1.class.getSuperclass());//class java.lang.Enum

    }
}

//enum 定义枚举类
enum Season1{
    //声明Season对象的属性
    // 1、提供当前枚举类的对象，多个对象之间使用逗号隔开，末尾对象使用;
    SPRING("春天","春暖花开"),
    SUMMER("夏天","夏日炎炎"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","冰天雪地");

    private final String seasonName;
    private final String seasonDesc;
    //1、私有化类的构造器【因为对象个数必须是有限个，所以为了避免外部new对象，私有化构造函数】
    Season1(String seasonName,String seasonDesc){
        this.seasonName=seasonName;
        this.seasonDesc=seasonDesc;
    }

    //4、其他诉求：获取枚举类对象的属性

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

}