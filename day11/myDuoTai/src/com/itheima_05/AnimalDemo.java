package com.itheima_05;

public class AnimalDemo {
    public static void main(String[] args) {
        //向上转型
        Animal a = new Cat();
        a.eat();

        //向下转型
        Cat c = (Cat) a;
        c.eat();
        c.playGame();

        //向上转型，此时a指向Dog类实体，为Dog类型
        a = new Dog();
        a.eat();

        //向下转型
        //ClassCastException 类型转换异常，狗无法转成猫
//        Cat cc = (Cat) a;
//        cc.eat();
//        cc.playGame();

    }
}
