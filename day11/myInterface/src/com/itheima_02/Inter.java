package com.itheima_02;

public interface Inter {
    public int num = 10;
    public final int num2 = 20;
//    public static final int num3 = 30;
    int num3 = 30;//虽然定义时未加修饰符，但是接口内成员属性会默认加，相当于上一行语句

//    public Inter() {}//接口中没有构造函数

//    public void show() {}

    public abstract void method();
    void show();//系统默认为方法带上public abstract关键字

}
