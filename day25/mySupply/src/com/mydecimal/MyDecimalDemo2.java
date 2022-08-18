package com.mydecimal;
/*
    【BigDecimal的成员方法】
    （1）BigDecimal add(BigDecimal augend)：加
    （2）BigDecimal subtract(BigDecimal subtrahend)：减
    （3）BigDecimal multiply(BigDecimal multiplicand)：乘
    （4）BigDecimal divide(BigDecimal divisor)：除
    （5）BigDecimal divide(BigDecimal divisor, int scale, RoundingMode roundingMode)：
        除法指定保留位数scale，以及保留模式，比如四舍五入RoundingMode.HALF_DOWN

     【Enum RoundingMode】
     （1）CEILING 圆形模式向正无穷大方向舍入【x轴正方向舍入】
     （2）FLOOR 舍入模式向负无穷大方向舍入  【x轴负方向舍入】
     （3）UP 远离零方向舍入【正数向x轴正方向舍入，负数向x轴负方向舍入】
     （4）DOWN 靠近零方向舍入【正数向x轴负方向舍入，负数向x轴正方向舍入】
     （5）HALF_UP 距离两个相邻数字距离相等，向UP方向舍入，否则四舍五入
     （6）HALF_DOWN 距离两个相邻数字距离相等，向DOWN方向舍入，否则四舍五入

     【BigDecimal底层存储方式】
     （1）将BigDecimal对象存储的数值，按照字符拆分，转化成ASCII值，形成数组。
        例如：0.226->'0' '.' '2' '2' '6'->[48,46,50,50,54]
            -1.5->'-' '1' '.' '5'->[45,49,46,53]
     （2）BigDecimal最多能存储多少位数？数组长度最大2^31,即21亿位浮点数
 */

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MyDecimalDemo2 {
    public static void main(String[] args) {
        //1、加法
        BigDecimal bd1 = BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(3.0);

        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);

        //2、减法
        BigDecimal bd4 = bd1.subtract(bd2);
        System.out.println(bd4);

        //3、乘法
        BigDecimal bd5 = bd1.multiply(bd2);
        System.out.println(bd5);

        //4.除法
        //BigDecimal bd6 = bd1.divide(bd2);//能整除可以使用,不能整除则报错
        BigDecimal bd6 = bd1.divide(bd2, 2, RoundingMode.HALF_DOWN);
        System.out.println(bd6);





    }
}
