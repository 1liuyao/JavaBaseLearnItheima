package com.itheima_01;

/*
    1、类名作为方法的形参
    方法的形参是类名，其实需要的是该类的对象
    实际传递的是该对象的【地址值】
    2、类名作为方法的返回值
    方法的返回值是类名，其实返回的是该类的对象
    实际传递的，也是该对象的【地址值】
 */
public class CatOperator {
    //类名作为形参，传递的是该对象的地址
    public void useCat(Cat c) { //Cat c = new Cat();
        c.eat();
    }
    //类名作为方法的返回值，返回的是该对象的地址
    public Cat getCat() {
        Cat c = new Cat();
        return c;
    }

}
