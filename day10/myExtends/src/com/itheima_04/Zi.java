package com.itheima_04;



public class Zi extends Fu {

    public Zi() {
//        super();//子类构造方法默认第一句是super（）平时省略不写
        super(20);//当父类中未定义无参构造函数，
                    //可以选择在子类构造函数中调用父类带参构造函数
        System.out.println("Zi中无参构造方法被调用");
    }

    public Zi(int age) {
//        super();//子类构造方法默认第一句是super（）平时省略不写
//        super(20);
        this();//输出：Fu中无参构造方法被调用
//                    Zi中无参构造方法被调用
//                    i中带参构造方法被调用
        //在子类构造函数中调用子类自己的构造函数，被调用的构造函数也会先访问父类构造函数
        System.out.println("Zi中带参构造方法被调用");
    }

}
