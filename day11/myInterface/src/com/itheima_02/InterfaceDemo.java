package com.itheima_02;
/*
    测试类

    成员特点
    成员变量：只能是常量 [默认]修饰符：public static final
    构造方法：没有，因为接口主要是扩展功能的，而没有具体存在
    成员方法：只能是抽象方法
            [默认]修饰符：public abstract

 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
//        i.num = 20;//虽然接口inter中没有用final关键字修饰num，但是默认会加，所以无法再次赋值
        System.out.println(i.num);
//        i.num2 = 40;//num2在接口inter中被final修饰，不能再次赋值
        System.out.println(i.num2);
        System.out.println(Inter.num);//可以通过接口名直接访问成员属性，因此接口成员属性默认被static修饰
    }
}
