package com.itheima_02;

//public class InterImpl implements Inter {

public class InterImpl extends Object implements Inter {//和上行代码等价，系统默认加extends Object
    public InterImpl() {
        super();
    }//由于接口没有构造函数，所以实现类的构造函数调用的时object类的构造函数
    //object类是所有类的基类，一个类如果没有继承任何一个类，则默认继承object

    @Override
    public void method() {
        System.out.println("method");
    }

    @Override
    public void show() {
        System.out.println("show");
    }
}
