package com.itheima_04;

/*
    装箱：把基本数据类型转换为对应的包装类类型
    拆箱：把包装类类型转换为对应的基本数据类型

    注意：在使用包装类类型的时候，做操作前，最好判断是否为null
         只要是对象，在使用前就必须进行不为null的判断。
 */
public class IntegerDemo {
    public static void main(String[] args) {
        //装箱：调用valueOf()方法将基本数据类型转成包装类
        Integer i = Integer.valueOf(100);

        //自动装箱，是指，jdk1.5以后可以直接把int赋值给Integer，本质还是执行了valueOf()方法。
        Integer ii = 100; //Integer.valueOf(100);

        //ii += 200;
        // ii = ii + 200;

        //手动拆箱
        // ii = ii.intValue() + 200;//先由Integer转成int拆箱，进行数值运算，再经过自动装箱转成Integer
        // ii = 300;

        //自动拆箱，本质是隐藏了手动拆箱过程
        ii += 200;
        System.out.println(ii);

        Integer iii = null;
//        iii += 100; //NullPointerException，因为需要先拆箱，调用intValue()，空调用会报错
        if(iii != null) {
            iii += 100;
        }


        Integer a=127;
        Integer b=127;
        Integer c=128;
        Integer d=128;
        //在装箱时，如果数值在byte范围内，数值相同，不会产生新对象，
        //也就是说多个数值相同的引用指向的是同一个对象
        //但是超过byte范围，即使数值相同也指向的是两个对象
        System.out.println(a==b);//true
        System.out.println(b==c);//false
        System.out.println(c==d);//false
    }
}
