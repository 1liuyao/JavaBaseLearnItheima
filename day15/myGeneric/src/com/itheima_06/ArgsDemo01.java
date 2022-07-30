package com.itheima_06;

/*
    可变参数：又称参数个数可变，用作方法的形参出现，那么方法参数个数就是可变的了

    可变参数定义格式：修饰符 返回值类型 方法名(数据类型… 变量名) { }

    可变参数的注意事项：（1）这里的变量其实是一个数组
                    （2）如果一个方法有多个参数，包含可变参数，可变参数要放在最后
 */
public class ArgsDemo01 {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));

        System.out.println(sum(10,20,30,40,50));
        System.out.println(sum(10,20,30,40,50,60));
        System.out.println(sum(10,20,30,40,50,60,70));
        System.out.println(sum(10,20,30,40,50,60,70,80,90,100));

    }

//    public static int sum(int b,int... a) {
//        return 0;
//    }

    public static int sum(int... a) {
//        System.out.println(a);//这个a其实是个数组，将传入的参数封装成一个数组，
                                // 相当于底层实现了new数组的操作，减少了调用者定义数组操作
//        return 0;
        int sum = 0;

        for(int i : a) {
            sum += i;
        }

        return sum;
    }

    //为了简化以下写法，引入了【可变参数】，参数个数不确定，但是是同一类型的数据
//    public static int sum(int a, int b) {
//        return a + b;
//    }
//
//    public static int sum(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    public static int sum(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }
}
