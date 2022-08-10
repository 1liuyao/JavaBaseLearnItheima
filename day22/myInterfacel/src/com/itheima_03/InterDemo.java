package com.itheima_03;
/*
    【接口中的私有方法】
    私有方法产生原因：
    Java 9中新增了带方法体的私有方法，这其实在Java 8中就埋下了伏笔：Java 8允许在接口中定义带方法体的
    默认方法和静态方法。这样可能就会引发一个问题：当两个默认方法或者静态方法中包含一段相同的代码实
    现时，程序必然考虑将这段实现代码抽取成一个共性方法，而这个共性方法是不需要让别人使用的，因此用
    私有给隐藏起来，这就是Java 9增加私有方法的必然性

    定义格式：
    格式1：private 返回值类型 方法名(参数列表) { }
    范例1：private void show() {
          }
    格式2：
    private static 返回值类型 方法名(参数列表) { }
    范例2：private static void method() {}
    注意事项：
    （1）默认方法可以调用私有的静态方法和非静态方法
    （2）静态方法只能调用私有的静态方法

    需求：
        1:定义一个接口Inter，里面有四个方法：二个默认方法，二个静态方法
            default void show1(){   }
            default void show2(){   }
            static void method1(){   }
            static void method2(){   }
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
        i.show1();
        System.out.println("--------");
        i.show2();
        System.out.println("--------");

        Inter.method1();
        System.out.println("--------");
        Inter.method2();

    }
}
