package com.itheima_03;

/*
    this&super关键字：
    this：代表本类对象的引用
    super：代表父类存储空间的标识(可以理解为父类对象引用)

    this和super的使用分别
    （1）成员变量：this.成员变量 - 访问本类成员变量
               super.成员变量 - 访问父类成员变量
    （2）成员方法：this.成员方法 - 访问本类成员方法
                super.成员方法 - 访问父类成员方法
    （3）构造方法：this（有参或无参) - 访问本类构造方法
                super（有参或无参) - 访问父类构造方法
*/
public class Zi extends Fu {
    public int age = 20;

    public void show() {
        int age = 30;
        System.out.println(age);
        //我要访问本类的成员变量age，怎么办呢？
        System.out.println(this.age);
        //我要访问父类的成员变量age，怎么办呢？
        System.out.println(super.age);
    }
}
