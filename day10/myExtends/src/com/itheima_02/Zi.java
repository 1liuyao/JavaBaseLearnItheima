package com.itheima_02;

/*
    在子类方法中访问一个变量，采用的是【就近原则】。
    1. 子类局部范围找
    2. 子类成员范围找
    3. 父类成员范围找
    4. 如果都没有就报错(不考虑父亲的父亲…)

    注意：子父类中通常不会出现同名成员变量，因为父类中只要定义了，子类就不用再定义了
    ，直接继承过来用就可以了。
*/
public class Zi extends Fu {
    //身高
    public int height = 175;

    //年龄
    public int age = 20;//其次考虑子类成员变量

    public void show() {
        int age = 30;//先考虑局部变量
        System.out.println(age);
        System.out.println(height);
        //报错
//        System.out.println(weight);//子类局部和成员、父类成员均没有定义，报错
    }
}
