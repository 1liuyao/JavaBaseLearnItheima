package com.itheima_07;

/*
    Lambda表达式和匿名内部类的区别:
    （1）所需类型不同：
        匿名内部类：可以是接口，也可以是抽象类，还可以是具体类
        Lambda表达式：只能是接口
    （2）使用限制不同
        如果接口中有且仅有一个抽象方法，可以使用Lambda表达式，也可以使用匿名内部类
        如果接口中多于一个抽象方法，只能使用匿名内部类，而不能使用Lambda表达式
    （3）实现原理不同
        匿名内部类：编译之后，产生一个单独的.class字节码文件，存在out文件夹下
        Lambda表达式：编译之后，没有一个单独的.class字节码文件。对应的字节码会在运行的时候动态生成，在out文件夹下不存在。

     所以，我认为lambda表达式是一个限制条件更加苛刻，瘦身版的接口实现类匿名对象
 */
public class LambdaDemo {
    public static void main(String[] args) {
        //匿名内部类其实就是一个【继承了】该类或者【实现了】该接口的【子类匿名对象】
        /*
        //匿名内部类是实现了接口的子类匿名对象
        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("接口");
            }
        });
        //匿名内部类是继承了抽象类的子类匿名对象
        useAnimal(new Animal() {
            @Override
            public void method() {
                System.out.println("抽象类");
            }
        });
        //匿名内部类是继承了具体类的子类匿名对象
        useStudent(new Student(){
            @Override
            public void study() {
                System.out.println("具体类");
            }
        });
        */

        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("接口");
            }
        });

        //Lambda
//        useInter(() -> System.out.println("接口"));
//        useAnimal(() -> System.out.println("抽象类"));//报错
//        useStudent(() -> System.out.println("具体类"));//报错

//        useInter(() -> System.out.println("接口"));

//        useInter(new Inter() {
//            @Override
//            public void show() {
//                System.out.println("show");
//            }
//
//            @Override
//            public void show2() {
//                System.out.println("show2");
//            }
//        });

    }
    //形参是具体类引用
    private static void useStudent(Student s) {
        s.study();
    }
    //形参是抽象类引用
    private static void useAnimal(Animal a) {
        a.method();
    }
    //形参是接口引用
    private static void useInter(Inter i) {
        i.show();
    }
}
