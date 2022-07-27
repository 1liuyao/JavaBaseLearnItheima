package com.itheima;

import java.util.Date;

/*
    Date类记录了一个【特定时间】，所有的参考基准
    Date中方法传入的参数的是距离基准时间（1970）的差值，意味着距离1970已经过了多少毫秒

    public Date()：分配一个 Date对象，并初始化，以便它代表它被分配的时间，精确到毫秒
    public Date(long date)：分配一个 Date对象，并将其初始化为表示从标准基准时间起指定的毫秒数
 */
public class DateDemo01 {
    public static void main(String[] args) {
        //public Date()：分配一个 Date对象，并初始化，以便它代表它被分配的时间，精确到毫秒
        //public Date() {
        //        this(System.currentTimeMillis());
        //    }
        //无参构造方法本质上是调用的有参构造方法public Date(long date)，传入当前时间距离1970年的差值，
        //返回的是系统的当前时间，所以无参构造可以获取系统的当前时间存在Date对象中
        Date d1 = new Date();
        System.out.println(d1);//对象的toString()方法被重写打印：Tue Jul 26 14:49:34 CST 2022

        //public Date(long date)：分配一个 Date对象，并将其初始化为表示从标准基准【1970年1月1日00:00:00 】时间起指定的毫秒数
        long date = 1000*60*60;//距离基准时间再过一个小时，隐含加了一个时区，北京时间8：00
        Date d2 = new Date(date);
        System.out.println(d2.getTime());
        System.out.println(d2);
    }
}
