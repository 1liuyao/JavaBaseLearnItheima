package com.itheima_04;

/*
    向上转型
        从子到父
        父类引用指向子类对象

    向下转型:【目的是为了使用子类的特有方法】
        从父到子
        父类引用转为子类对象
        子类类型 对象引用=（子类类型）父类引用;
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //多态
        Animal a = new Cat(); //向上转型
        a.eat();
//        a.playGame();//animal中不包含playGame()方法

        /*
        //为了使用Cat的特有方法playGame()，再次创建了Cat类的对象，此时有两只猫
        Cat c = new Cat();
        c.eat();
        c.playGame();
        */

        //向下转型
        Cat c = (Cat)a;//此时只有一个Cat对象
        c.eat();
        c.playGame();
    }
}
