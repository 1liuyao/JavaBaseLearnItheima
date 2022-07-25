package com.itheima;

/*
    需求：求一段代码的运行时间

    System类的常用方法
    (1)private System()：构造函数被私有化
 */
public class SystemDemo {
    public static void main(String[] args) {
        /*
        System.out.println("开始");
        //public static void exit(int status)：终止当前运行的 Java 虚拟机，非零表示异常终止

        System.exit(0); //jvm虚拟机已经推出，不执行下面语句，只输出【开始】，不输出【结束】

        System.out.println("结束");
        */

        //public static long currentTimeMillis()：返回当前时间(以毫秒为单位)
//        System.out.println(System.currentTimeMillis());

        //将毫秒转化成年
//        System.out.println(System.currentTimeMillis() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }

        long end = System.currentTimeMillis();
        System.out.println("共耗时：" + (end - start) + "毫秒");
    }
}
