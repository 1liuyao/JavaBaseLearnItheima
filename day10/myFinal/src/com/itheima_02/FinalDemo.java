package com.itheima_02;

/*
    测试类

    fianl关键字的作用：final代表最终的意思，可以修饰成员方法，成员变量，类

    final修饰类、方法、变量的效果：
    （1）fianl修饰类是最终类，该类不能被继承（不能有子类，但是可以有父类）
    （2）final修饰方法是最终方法，该方法不能被重写
    （3）final修饰变量，是一个常量，不能再次赋值

    final修饰局部变量
    （1）fianl修饰基本数据类型变量：
    final 修饰指的是基本类型的数据值不能发生改变，当于定义常量，
    一般定义格式为，final float PAI=3.14;

    (2)final修饰引用数据类型变量:
    final 修饰指的是引用类型的地址值不能发生改变，但是地址里面的内容是可以发生改变的

 */
public class FinalDemo {

    public static void main(String[] args) {
        //final修饰基本类型变量
        final int age = 20;
//        age = 100; //final修饰基本类型的数据值不能发生改变
        System.out.println(age);


        //final修饰引用类型变量
        final Student s = new Student();
        s.age = 100;
        System.out.println(s.age);

//        s = new Student();//final 修饰指的是引用类型的地址值不能发生改变,
                            //但是地址里面的内容是可以发生改变的
    }

}
