package com.itheima_01;

import java.util.Calendar;

/*
    Calendar 为特定瞬间与一组日历字段【年 月 日 时】之间的转换提供了一些方法，
             并为操作日历字段【年 月 日 时】提供了一些方法
             注：所谓的日历字段，就是Calendar类的成员属性，且都被Static修饰，可使用类名直接调用

    Calendar 提供了一个类方法 getInstance 用于获取这种类型的一般有用的对象，该方法返回一个 Calendar 对象，
    其日历字段已使用【当前日期和时间】初始化：Calendar rightNow = Calendar.getInstance();

    注：由于Calendar类是抽象类，所以要使用其方法，有两种方式：
    （1）使用Calendar类方法返回的对象：getInstance()
    （2）利用多态型，使用其子类对象GregorianCalendar调用Calendar
    （3）如果除了想要优化日期的显示格式外，还想对日期的字段【年月日】做处理【加减】，那么选Calendar
 */

public class CalendarDemo {
    public static void main(String[] args) {
        //日历字段已使用当前日期和时间初始化
        Calendar c = Calendar.getInstance();//多态的形式获取子类对象

        System.out.println(c);//查看Calendar对象的字符串表现形式，包含了所有的日历字段

        //public int get(int field)
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);//从0开始到11
        int date = c.get(Calendar.DATE);

        System.out.println(year + "年" + (month + 1) + "月" + date + "日");

    }
}
