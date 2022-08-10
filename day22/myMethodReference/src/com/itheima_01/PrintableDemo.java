package com.itheima_01;

/*
    方法引用的出现原因:
    在使用Lambda表达式的时候，我们实际上传递进去的代码就是一种解决方案：拿参数做操作
    那么考虑一种情况：如果我们在Lambda中所指定的操作方案，已经有地方存在相同方案，那是否还有必要再
    写重复逻辑呢？答案肯定是没有必要

    那我们又是如何使用已经存在的方案的呢？
    这就是我们要讲解的方法引用，我们是通过方法引用来使用已经存在的方案

    【方法引用其实就是简化了入参书写的lambda表达式】

    方法引用符：
    :: 该符号为引用运算符，而它所在的表达式被称为方法引用

    推导与省略
        如果使用Lambda，那么根据“可推导就是可省略”的原则，无需指定参数类型，也无需指定的重载形式，它们都将被自动推导
        如果使用方法引用，也是同样可以根据上下文进行推导
        方法引用是Lambda的孪生兄弟

    需求：
        1:定义一个接口(Printable)：里面定义一个抽象方法：void printString(String s);
        2:定义一个测试类(PrintableDemo)，在测试类中提供两个方法
            一个方法是：usePrintable(Printable p)
            一个方法是主方法，在主方法中调用usePrintable方法
 */
public class PrintableDemo {
    public static void main(String[] args) {
        //在主方法中调用usePrintable方法

//        usePrintable((String s) -> {
//            System.out.println(s);
//        });

        usePrintable(s -> System.out.println(s));

//        System.out.println("爱生活爱Java");//这句话和上面一行代码实现的功能是一样的

        //方法引用符：::
        usePrintable(System.out::println);

        //可推导的就是可省略的
        //方法引用其实省略了入参的书写，那么可推导是什么意思呢？
        //通过调用方法usePrintable的形参可推导要使用的是Printable接口实现类的引用，
        //那么就可省略，因此lambda表达式相比匿名对象就省略了【new 接口名()】
        //由于println有很多重载方法，其中就有void println(String x)
        //这个方法与接口中抽象方法形参类型是一致的，因此[s="爱生活爱Java"]就可以传递给抽象方法中的println方法
        //因此可推导出参数的传递过程，那么只要接口中被重写的抽象法的语句体中所调用的方法形参类型与抽象方法声明时是一样的
        //就可以推导出参数的传递过程，因此参数就可以省略
    }

    private static void usePrintable(Printable p) {
        p.printString("爱生活爱Java");
    }
}
