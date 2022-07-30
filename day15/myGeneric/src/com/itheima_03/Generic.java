package com.itheima_03;

/*
public class Generic {
    public void show(String s) {
        System.out.println(s);
    }

    public void show(Integer i) {//方法重载
        System.out.println(i);
    }

    public void show(Boolean b) {//方法重载
        System.out.println(b);
    }
}
*/

//泛型类改进
//public class Generic<T> {
//    public void show(T t) {
//        System.out.println(t);
//    }
//}

//泛型方法改进
public class Generic<K> {
    public <T> void show(T t) {
        System.out.println(t);
    }
    //static方法既可以访问类上定义的泛型，也可以访问方法上的
    public<T,K> void show1(T t,K e) {
        System.out.println("static"+t+e);
    }
}