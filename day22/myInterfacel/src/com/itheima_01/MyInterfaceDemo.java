package com.itheima_01;

/*
    接口的组成：
    （1）常量：public static final
    （2）抽象方法：public abstract
    （3）默认方法(Java 8)
    （4）静态方法(Java 8)
    （5）私有方法(Java 9)

    接口中的默认方法【解决了接口升级后，其全部实现类必须重写升级接口的问题】
    （1）格式：public default 返回值类型 方法名(参数列表) { }
    （2）范例：public default void show3() {
             }
    （3）注意事项：①默认方法不是抽象方法，所以不强制被重写。但是可以被重写，重写的时候去掉default关键字
                ②public可以省略，default不能省略

    需求：
        1:定义一个接口MyInterface，里面有两个抽象方法：
            void show1();
            void show2();
        2:定义接口的两个实现类：
            MyInterfaceImplOne
            MyInterfaceImplTwo
        3:定义测试类：
            MyInterfaceDemo
            在主方法中，按照多态的方式创建对象并使用
 */
public class MyInterfaceDemo {
    public static void main(String[] args) {
        //按照多态的方式创建对象并使用
        MyInterface my = new MyInterfaceImplOne();
        my.show1();
        my.show2();
        my.show3();
    }
}
