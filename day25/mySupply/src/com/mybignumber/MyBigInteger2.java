package com.mybignumber;

import java.math.BigInteger;

/*
    【BigInteger成员方法】：
    BigInteger add(BigInteger val) ：加法
    BigInteger subtract(BigInteger val)：减法
    BigInteger multiply(BigInteger val)：乘法
    BigInteger divide(BigInteger val) ：除法，返回商
    BigInteger[] divideAndRemainder(BigInteger val) ：除法，返回商和余数
    BigInteger pow(int exponent)：次幂
    BigInteger max(BigInteger val)：返回较大值
    BigInteger min(BigInteger val)：返回较小值
    boolean equals(Object x)：比较值是否相同
    int intValue()：将此BigInteger转换为int。注意：如果超出int范围，数据有误

    【BigInteger底层存储方式】
    （1）对于计算机而言，其实是没有数据类型的概念的，都是01二进制数据
    （2）数据类型是编程语言自己规定的。
    （3）BigInteger源代码中final int signum代表数值的正负，+1代表正数，-1代表负数，0代表0
    （4）BigInteger中将数据的【补码】按照32位为一个单位，切割成多个段，存储在final int[] mag中。
    （5）由于数组的最大长度定义为int的取值范围：2的31次方-1，即32个1，其中最高位为符号位，约21亿
        而每个mag片段的取值范围为：-2的31次方到2的31次方-1，约42亿，所以BigInteger可以表示约42亿的21亿次方个数据
 */
public class MyBigInteger2 {
    public static void main(String[] args) {
        //1、创建两个BigInteger对象
        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(5);

        //2、加法
        BigInteger bd3 = bd1.add(bd2);
        System.out.println(bd3);

        //3、除法，获取商和余数
        BigInteger[] bd4 = bd1.divideAndRemainder(bd2);
        System.out.println(bd4.length+"商："+bd4[0]+"余数："+bd4[1]);

        //4、比较是否相同
        System.out.println(bd1.equals(bd2));

        //5、次幂
        BigInteger pow = bd1.pow(3);//10的3次方
        System.out.println(pow);

        //6、max
        BigInteger max = bd1.max(bd2);
        System.out.println(max);
        System.out.println(max==bd1);//true，底层没有创建新的对象存较大值，而是直接返回较大值
        System.out.println(max==bd2);//false

        //7、转为int类型整数，超出范围数据有误
        BigInteger bigInteger = BigInteger.valueOf(1000);
        BigInteger bigInteger1 = BigInteger.valueOf(21474836477777L);

        int i = bigInteger.intValue();
        int i1=bigInteger1.intValue();
        System.out.println(i+" "+i1);//1000 -2223,超出int范围，BigInteger转int时存在误差
    }
}
