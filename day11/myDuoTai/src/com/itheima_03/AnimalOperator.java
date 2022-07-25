package com.itheima_03;

/*
    动物操作类
 */
public class AnimalOperator {

    /*
    public void useAnimal(Cat c) { //Cat c = new Cat();
        c.eat();
    }

    public void useAnimal(Dog d) { //Dog d = new Dog();
        d.eat();
    }
    */

    public void useAnimal(Animal a) {//抽取cat和dog的共性类型animal，操作共性方法eat
        //Animal a = new Cat();
        //Animal a = new Dog();

        a.eat();
//        a.lookDoor();//父类的引用不能访问子类特有的方法
    }


}
