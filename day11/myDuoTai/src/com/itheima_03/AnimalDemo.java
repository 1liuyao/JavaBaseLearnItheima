package com.itheima_03;

/*
    测试类

    多态的好处和弊端（记忆）
    好处：提高程序的扩展性。定义方法时候，使用父类型作为参数，在使用的时候，使用具体的子类型参与操作
    弊端：不能使用子类的特有成员
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建动物操作类的对象，调用方法
        AnimalOperator ao = new AnimalOperator();
        Cat c = new Cat();
        ao.useAnimal(c);


        Dog d = new Dog();
        ao.useAnimal(d);


        Pig p = new Pig();
        ao.useAnimal(p);

    }
}
