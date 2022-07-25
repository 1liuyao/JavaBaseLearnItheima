package com.itheima_02;

import java.sql.SQLOutput;

/*
    静态成员内部类
    ①出现访问局限性：只能访问外部类的静态成员
    ②如果成员内部类中定义了静态成员，则该内部类只能是静态的
    ③外部类静态方法访问成员内部类，内部类也必须是静态的
 */
public class StaticInnerDemo {
    public int num=20;
    public static int num1=30;
    //非静态成员内部类包含非静态方法
    private class Inner{
        public void show(){
            System.out.println(num);
        }
    }
    //非静态成员内部类包含静态方法
//    private class Inner1{//报错！！一旦成员内部类有成员被定义成静态，则该类为静态
//        public static void show(){
//            //System.out.println(num);//报错，无法访问非静态成员
//            System.out.println(num1);
//        }
//    }
    //静态成员内部类包含非静态方法
    private static class Inner2{
        public void show(){
            //System.out.println(num);//报错，无法访问非静态成员
            System.out.println(num1);
        }
    }
    //静态成员内部类包含静态方法
    private static class Inner3{
        public static void show(){
            //System.out.println(num);//报错，无法访问非静态成员
            System.out.println(num1);
        }
    }
    public void showInnner(){
        //访问非静态成员内部类非静态方法
        new Inner().show();
        //访问静态成员内部类非静态方法
        new Inner2().show();
        //访问静态成员内部类静态方法
        StaticInnerDemo.Inner3.show();

    }

    public static void showInner1(){
        //外部类静态方法只能访问静态内部类
        //new Inner().show();//报错无法从静态上下文中引用非静态 变量 this，因为Inner()是非静态的
        new Inner2().show();
        StaticInnerDemo.Inner3.show();
    }

    public static void main(String[] args) {
        //访问非静态成员内部类（静态、非静态）方法
        new StaticInnerDemo().showInnner();
        //验证外部类静态方法访问成员内部类
        StaticInnerDemo.showInner1();
    }
}
