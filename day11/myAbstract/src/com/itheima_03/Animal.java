package com.itheima_03;

/*
    抽象类
 */
public abstract class Animal {

    private int age = 20;//抽象类中定义变量
    private final String city = "北京";//抽象类中定义常量

    public Animal() {} //无参构造

    public Animal(int age) {
        this.age = age;
    }//有参构造


    public void show() {//非抽象方法
        age = 40;
        System.out.println(age);
//        city = "上海";
        System.out.println(city);
    }

    public abstract void eat();//抽象方法

}
