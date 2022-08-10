package com.itheima_02;

/*
    接口中静态方法：
    （1）格式：public static 返回值类型 方法名(参数列表) { }
    （2）范例：public static void show() {
             }
    （3）注意事项：
        ①静态方法只能通过接口名调用，不能通过实现类名或者对象名调用
        ②public可以省略，static不能省略
        ③接口中的静态方法必须实现方法体

    需求：
        1:定义一个接口Inter，里面有三个方法：一个是抽象方法，一个是默认方法，一个是静态方法
            void show();
            default void method(){ }
            public static void test(){ }
        2:定义接口的一个实现类：
            InterImpl
        3:定义测试类：
            InterDemo
            在主方法中，按照多态的方式创建对象并使用
 */
public class InterDemo {
    public static void main(String[] args) {
        //按照多态的方式创建对象并使用
        Inter i = new InterImpl();
        i.show();
        i.method();
//        i.test();//报错，接口中的静态方法只能被接口名调用

        Inter.test();
//        InterImpl.test();//报错，接口中的静态方法只能被接口名调用,实现类无法调用
                        //因为实现类可以实现多个接口，如果接口中有同名同参的静态方法，并且此静态方法
                        //在不同接口中都有各自的实现，那么就像java不允许的多继承一样，实现类就不知道执行哪个接口的静态方法了

        Flyable.test();

    }
}
