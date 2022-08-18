package com.mydecimal;
/*
    【计算机中的小数存储】
    1、举例：69.875=2^6+2^2+2^0+2^-1+2^-2+2^-3
                 =01000101.111
    2、为什么小数部分计算加减乘除不准确？
    （1）浮点型数据float：占4个字节，共32bit，其中23bit给小数使用
    （2）浮点型数据double：占8个字节，共64bit，其中52bit给小数使用
    例如：0.226需要55位bit精准，但是double只能给出52bit，那么3bit就丧失了精度。数据本身丧失了精度，加减乘除就不可能精确。

    3、为了存储较大的小数，并进行小数的精确计算，java引入BigDecimal

    4、构造方法：BigDecimal(double val)：不准确不推荐使用
               BigDecimal(String val)
    5、静态方法获取BigDecimal对象：static BigDecimal valueOf(double val)

    注意：（1）如果要表示的数字超出了double的范围，建议使用new BigDecimal(String)
         （2）如果我们传递的是[0~10]之间的【整数】，包含0，包含10，那么方法会返回已经创建好的对象，不会重新创建对象
         （3）对象一旦创建不可修改
 */

import java.math.BigDecimal;

public class MyDecimalDemo {
    public static void main(String[] args) {
        //1、通过传递double类型的小数来创建对象
        //这种方式有可能不精确，所以不建议使用
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);
        System.out.println(bd1);
        System.out.println(bd2);

        //2、通过传递字符串表示的小数来创建对象
        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");
        BigDecimal bd5 = bd3.add(bd4);
        System.out.println(bd3);
        System.out.println(bd4);
        System.out.println(bd5);//计算结果精确0.10
        System.out.println(0.01d+0.09d);//计算结果不精确0.09999999999999999

        //3、通过静态方法获取对象
        BigDecimal bd6 = BigDecimal.valueOf(10);//调用valueOf(long val)
        BigDecimal bd7 = BigDecimal.valueOf(10);
        System.out.println(bd6==bd7);//true

        BigDecimal bd8 = BigDecimal.valueOf(10.0);//调用valueOf(double val)
        BigDecimal bd9 = BigDecimal.valueOf(10.0);
        System.out.println(bd8==bd9);//false
        //细节：
        //1、如果要表示的数字不大，没有超出double的取值范围，建议使用valueOf()
        //2、如果要表示的数字超出了double的范围，建议使用new BigDecimal(String)
        //3、如果我们传递的是[0~10]之间的【整数】，包含0，包含10，那么方法会返回已经创建好的对象，不会重新创建对象
    }
}
/*
    public static BigDecimal valueOf(double val) {
        // Reminder: a zero double returns '0.0', so we cannot fastpath
        // to use the constant ZERO.  This might be important enough to
        // justify a factory approach, a cache, or a few private
        // constants, later.
        return new BigDecimal(Double.toString(val));
    }

    public static BigDecimal valueOf(long val) {
        if (val >= 0 && val < zeroThroughTen.length)
            return zeroThroughTen[(int)val];
        else if (val != INFLATED)
            return new BigDecimal(null, val, 0, 0);
        return new BigDecimal(INFLATED_BIGINT, val, 0, 0);
    }
    //如果调用的是valueOf(long val)方法，并且传入的是0到10的正数，利用提前生成好的对象，不会创建新对象
    private static final BigDecimal zeroThroughTen[] = {
        new BigDecimal(BigInteger.ZERO,       0,  0, 1),
        new BigDecimal(BigInteger.ONE,        1,  0, 1),
        new BigDecimal(BigInteger.valueOf(2), 2,  0, 1),
        new BigDecimal(BigInteger.valueOf(3), 3,  0, 1),
        new BigDecimal(BigInteger.valueOf(4), 4,  0, 1),
        new BigDecimal(BigInteger.valueOf(5), 5,  0, 1),
        new BigDecimal(BigInteger.valueOf(6), 6,  0, 1),
        new BigDecimal(BigInteger.valueOf(7), 7,  0, 1),
        new BigDecimal(BigInteger.valueOf(8), 8,  0, 1),
        new BigDecimal(BigInteger.valueOf(9), 9,  0, 1),
        new BigDecimal(BigInteger.TEN,        10, 0, 2),
    };
 */
