package com.itheima_01;

/*
    异常：异常就是程序出现了【不正常】的情况。
    java将程序中出现的问题封装成了对象。
    问题的产生有【产生原因】【问题的名称】【问题的描述】【问题发生的位置】，对这些进行封装。

    异常体系：Throwable Error Exception(RuntimeException 非RuntimeException)
    （1）error：通常是JVM产生的，需要我们修改代码
    （2）Exception：程序本可以处理的问题
                  RuntimeException：编译时并不检查，程序跑出问题了，再回来改，
                                   可以通过javac，但是java 类名挂了。
                  非RuntimeException：编译时检查，否则你都build不起来，
                                     更别提运行了，javac阶段都通不过

    问题：什么时候想到定义异常呢？
    回答：当我们在写功能时，发现该功能会出现一些问题，应该将问题在定义功能时标识出来，
         这样调用者就可以在使用这个功能时，预先给出处理方式。
 */
public class ExceptionDemo01 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        int[] arr = {1, 2, 3};
//        System.out.println(arr[1]);
//        System.out.println(arr[3]); //ArrayIndexOutOfBoundsException
        System.out.println(arr[2]);
    }
}
