package com.itheima_01;

public class Zi extends Fu {

    public final int age = 20;

    public void show() {
//        age = 100; //age作为成员属性，被final修饰，只能被赋值一次，不可再次赋值
        System.out.println(age);
    }


//    @Override //父类中的方法被final修饰，子类无法重写该方法
//    public void method() {
//        System.out.println("Zi method");
//    }

}
