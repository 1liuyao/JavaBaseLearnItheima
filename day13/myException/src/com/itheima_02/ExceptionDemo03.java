package com.itheima_02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    Java 中的异常被分为两大类：【编译时异常】和【运行时异常】，也被称为受检异常和非受检异常
    所有的 RuntimeException 类及其子类的实例被称为运行时异常，其他的异常都是编译时异常

    编译时异常：必须【显示处理】，否则程序就会发生错误，无法通过编译，要么try，要么抛【因为这个问题自己解决不了】
    运行时异常：无需显示处理，运行失败了，再回来改代码
              也可以和编译时异常一样处理，也就是【显示处理】
    注意：运行时异常，try或者抛的意义并不大，因为代码有问题就要改，而不能为了让程序运行不停止，盲目try，导致代码问题被雪藏

    问题：异常的处理try和抛的区别
    回答：（1）try是真正解决问题，能让程序从开始运行到结束的，但是不是自己能处理的问题，不要瞎处理
         （2）抛代表问题到了自己这里自己不解决，交给别人解决，但是是自己的问题还得自己解决，别随便瞎抛
 */
public class ExceptionDemo03 {
    public static void main(String[] args) {
//        method();
        method2();
    }

    //编译时异常
    public static void method2() {
        try {
            String s = "2048-08-09";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse(s);//写到这里时，程序已经飘红了，不是说一定会出问题，是可能出问题，未雨绸缪
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    //运行时异常，以下采用了和编译时异常同样的处理方式，显示处理；当然你也可以放着不try，真正运行起来，出问题再改代码
    public static void method() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

}
