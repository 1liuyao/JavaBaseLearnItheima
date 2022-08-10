package com.itheima_02;

public interface Inter {
    void show();

    default void method(){
        System.out.println("Inter 中的默认方法执行了");
    }

//    public static void test(){
//        System.out.println("Inter 中的静态方法执行了");
//    }
    //静态方法中public可以省略
    static void test(){
        System.out.println("Inter 中的静态方法执行了");
    }
}
