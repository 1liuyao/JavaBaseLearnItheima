package com.myenum;
/*
    需求：针对每一个枚举常量对象给出接口中抽象方法的不同实现方式
 */

public enum Season2 implements MyShow{
    SPRING("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println("你好春天");
        }
    },
    SUMMER("夏天","夏日炎炎"){
        @Override
        public void show() {
            System.out.println("你好夏天");
        }
    },
    AUTUMN("秋天","秋高气爽"){
        @Override
        public void show() {
            System.out.println("你好秋天");
        }
    },
    WINTER("冬天","冰天雪地"){
        @Override
        public void show() {
            System.out.println("你好冬天");
        }
    };

    private final String seasonName;
    private final String seasonDesc;
    //1、私有化类的构造器【因为对象个数必须是有限个，所以为了避免外部new对象，私有化构造函数】
    Season2(String seasonName,String seasonDesc){
        this.seasonName=seasonName;
        this.seasonDesc=seasonDesc;
    }

    //4、其他诉求：获取枚举类对象的属性

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //重写接口中的抽象方法

//    @Override
//    public void show() {
//        System.out.println("这是一个季节");
//    }
}
