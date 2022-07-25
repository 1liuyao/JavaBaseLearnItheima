package com.itheima_02;

/*
    抽象类作为形参和返回值:
    (1)方法的形参是抽象类名，其实需要的是该抽象类的【子类】对象
    (2)方法的返回值是抽象类名，其实返回的是该抽象类的【子类】对象
 */
public class AnimalOperator {
    //形参为抽象类类名
    public void useAnimal(Animal a) { //Animal a = new Cat();
        a.eat();
    }
    //返回值为抽象类类名
    public Animal getAnimal() {
        Animal a = new Cat();
        return a;
    }

}
