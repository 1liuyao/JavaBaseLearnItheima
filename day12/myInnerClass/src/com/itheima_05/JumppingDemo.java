package com.itheima_05;

/*
    测试类

    问题：什么时候使用匿名对象？
    回答：当对方法只进行一次调用的时候使用，如果想要多次调用该方法，需要给对象起名字

    问题：什么时候使用匿名内部类对象？
    回答：（1）当方法的形参是引用类型时
         （2）需要重写的方法不要过多，控制在两个以内，则可以通过匿名内部类来完成参数的传递
 */
public class JumppingDemo {
    public static void main(String[] args) {
        //需求：创建接口操作类的对象，调用method方法
        JumppingOperator jo = new JumppingOperator();
        Jumpping j = new Cat();
        jo.method(j);

        Jumpping j2 = new Dog();
        jo.method(j2);
        System.out.println("--------");
        //简化写法
        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("猫可以跳高了");
            }
        });

        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("狗可以跳高了");
            }
        });

    }
}
