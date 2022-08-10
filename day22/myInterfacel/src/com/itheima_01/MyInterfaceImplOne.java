package com.itheima_01;

public class MyInterfaceImplOne implements MyInterface {
    @Override
    public void show1() {
        System.out.println("One show1");
    }

    @Override
    public void show2() {
        System.out.println("One show2");
    }
    //重写接口中的default方法，需去掉default关键字
    @Override
    public void show3() {
        System.out.println("One show3");
    }
}
