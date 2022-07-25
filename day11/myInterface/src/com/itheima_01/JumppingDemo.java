package com.itheima_01;

/*
    测试类

    接口就是一种公共的规范标准，是like a的关系

    接口的特点：（1）接口用关键字interface修饰
    （2）类实现接口用implements表示
    （3）接口不能实例化：接口如何实例化呢？参照多态的方式，通过实现类对象实例化，这叫接口多态。
                     多态的形式：具体类多态，【抽象类多态】，【接口多态】，后两者使用多态的情况较多。
                     多态的前提：①有【继承】或【实现】关系
                               ②有方法的重写
                               ③有父（类/接口）引用指向（子/实现）类对象
    （4）接口的子类：要么重写接口中的所有抽象方法
                  要么子类也是抽象类

 */
public class JumppingDemo {
    public static void main(String[] args) {
//        Jumpping j = new Jumpping();//接口是抽象的，不能被实例化

        Jumpping j = new Cat();//接口不可以创建对象，但是可以指向子类对象，
                                //也就是接口多态性
        j.jump();

    }
}
