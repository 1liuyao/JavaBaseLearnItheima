package com.itheima_05;

public class Zi extends Fu {

    public void method() {
        System.out.println("Zi中method()方法被调用");
    }

    public void show() {
        super.show();//访问父类的成员方法
        System.out.println("Zi中show()方法被调用");
    }
}
