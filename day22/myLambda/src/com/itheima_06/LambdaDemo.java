package com.itheima_06;

/*
    Lambda表达式的注意事项
    （1）使用Lambda必须要有接口，并且要求接口中有且仅有一个抽象方法
    （2）必须有上下文环境，才能推导出Lambda对应的接口
    （3）根据局部变量的赋值得知Lambda对应的接口
        Runnable r = () -> System.out.println("Lambda表达式");
    （4）根据调用方法的参数得知Lambda对应的接口
        new Thread(() -> System.out.println("Lambda表达式")).start();
 */
public class LambdaDemo {
    public static void main(String[] args) {
//        useInter(() -> {
//            System.out.println("好好学习天天向上");
//        });

        //使用Lambda必须要有接口，并且要求接口中有且仅有一个抽象方法
        useInter(() -> System.out.println("好好学习天天向上"));

        //必须有上下文环境，才能推导出Lambda对应的接口【因为Thread类中的构造方法传入的是Runnable对象，所以就可以推出要重写run方法】
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("匿名内部类");
//            }
//        }).start();

//     【lamda表达式返回的是接口实现了类的引用，只要明确这个引用的类型，我们也就知道实现了哪个接口，同时接口中只有一个抽象方法，也就知道重写的是哪个方法了】
//        Runnable r = () -> System.out.println("Lambda表达式");
//        new Thread(r).start();

        new Thread(() -> System.out.println("Lambda表达式")).start();
    }

    private static void useInter(Inter i) {
        i.show();
    }
}
