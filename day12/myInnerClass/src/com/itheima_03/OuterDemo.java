package com.itheima_03;
/*
    测试类

    局部内部类定义位置：局部内部类是在方法中定义的类

    局部内部类访问方式：
    （1）局部内部类，外界是无法直接使用，需要在【方法内部】创建对象并使用
    （2）该类可以直接访问外部类的成员，也可以访问方法内的【局部变量】

    问题：局部内部类不可以被static修饰吗？
    回答：不可以。因为static是修饰成员的，没有办法修饰局部。
         同时不可以被访问权限：private public protected等成员修饰符修饰

    问题：局部内部类可以被abstract修饰吗？
    回答：可以
 */
public class OuterDemo {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method();
    }
}
