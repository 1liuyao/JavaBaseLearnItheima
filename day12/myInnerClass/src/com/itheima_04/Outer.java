package com.itheima_04;
/*
    前提：
	    存在一个类或者接口
		这里的类可以是具体类也可以是抽象类

	格式：
		new 类名或者接口名(){
			重写方法;
		};

	问题：本质是什么呢?
	回答：因为需要重写方法，所以匿名内部类是一个继承了该类或者实现了该接口的【子类匿名对象】
 */
public class Outer {

    public void method() {
        /*
        new Inter() {//运行不会输出结果，因为没有调用show方法
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        */

//        show();

        /*
        new Inter() {//匿名对象就像一个长胖了的对象，本质是一个没有名字的子类对象
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();
        ////重写调用父类或者接口方法，并调用1次
        new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();
        */

        //重写调用父类或者接口方法，并调用【多次】
        Inter i = new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };

        i.show();
        i.show();

        //使用匿名内部类特有方法
        new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
            public void show1(){
                System.out.println("非父类或接口方法，匿名内部类独有");
            }
        }.show1();

        //声明匿名内部类引用，调用匿名内部特有方法是不可行的
        Inter j = new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
            public void show1(){
                System.out.println("非父类或接口方法，匿名内部类独有");
            }
        };

        //j.show1();//报错，因为父类或者接口中不含有show1()方法
                 // Inter j是接口的引用，编译看左边，编译失败
        j.show();
    }

}
