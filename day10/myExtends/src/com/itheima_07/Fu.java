package com.itheima_07;

public class Fu {

    private void show() {
        System.out.println("Fu中show()方法被调用");
    }

    /*
    public void method() {
        System.out.println("Fu中method()方法被调用");
    }
    */
    //方法前隐藏了默认访问权限修饰符
    void method() {
        System.out.println("Fu中method()方法被调用");
    }
}
