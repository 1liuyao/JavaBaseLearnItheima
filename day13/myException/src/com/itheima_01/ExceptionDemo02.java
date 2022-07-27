package com.itheima_01;

/*
    JVM的默认处理方案
    如果程序出现了问题，我们没有做任何处理，最终JVM 会做默认的处理，处理方式有如下两个步骤：
    （1）把异常的名称，错误原因及异常出现的位置等信息输出在了控制台
    （2）程序停止执行
    本质上就是执行了e.printStackTrace();
 */
public class ExceptionDemo02 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method() {
        int[] arr = {1, 2, 3};
//        System.out.println(arr[1]);
        System.out.println(arr[3]);
    }
}
/*
开始
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	at com.itheima_01.ExceptionDemo02.method(ExceptionDemo02.java:16)
	at com.itheima_01.ExceptionDemo02.main(ExceptionDemo02.java:9)
 */