package com.itheima_02;

/*
    测试类

    成员访问特点：
    （1）成员变量：编译看父类，运行看父类
    （2）非静态成员方法：编译看父类，运行看子类
    （3）静态成员方法：编译看父类，运行看父类

    问题：为什么编译的时候都需要看父类？
    答：因为子类特有的方法是后续产生的新功能，前期是不能使用后期的新功能的，访问具有局限性


 */
public class AnimalDemo {
    public static void main(String[] args) {
        //有父类引用指向子类对象
        Animal a = new Cat();

        System.out.println(a.age);
//        System.out.println(a.weight);//报错，编译时父类中不包含weight参数

        a.eat();
//        a.playGame();//报错，编译时父类中不包含此方法

    }
}
