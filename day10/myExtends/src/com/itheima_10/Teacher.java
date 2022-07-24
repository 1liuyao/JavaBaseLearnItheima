package com.itheima_10;

public class Teacher extends Person {

    public Teacher() {
    }

    public Teacher(String name, int age) {
//        this.name = name; //报错
//        this.age = age;//子类不能直接访问父类的私有成员，同时，子类没有声明自己的成员属性
        super(name, age);
    }

    public void teach() {
        System.out.println("用爱成就每一位学员");
    }

}
