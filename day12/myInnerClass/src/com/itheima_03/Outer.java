package com.itheima_03;

public class Outer {

    private int num = 10;

    public void method() {
        //Inner i = new Inner();//声明局部内部类的对象不能写在第一行，因为此时局部内部类还没有加载
        int num2 = 20;
        class Inner {//类定义在方法内部称为局部内部类
            public void show() {
                System.out.println(num);
                System.out.println(num2);
            }
        }

        Inner i = new Inner();
        i.show();

    }

}
