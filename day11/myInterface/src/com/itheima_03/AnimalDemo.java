package com.itheima_03;
/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Jumpping j = new Cat();
        j.jump();
        System.out.println("--------");

        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
//        a.jump();

        a = new Cat("加菲",5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("--------");

        //由于实现类、子类中的方法是最全的，所以真正在使用功能时，还是声明子类对象调用
        //以后快速了解一个类，先了解父类、接口的基本功能，使用一个类看子类、实现类的方法
        Cat c = new Cat();
        c.setName("加菲");
        c.setAge(5);
        System.out.println(c.getName()+","+c.getAge());
        c.eat();
        c.jump();
    }
}
