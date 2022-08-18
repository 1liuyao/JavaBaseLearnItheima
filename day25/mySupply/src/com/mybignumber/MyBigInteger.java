package com.mybignumber;

import java.math.BigInteger;
import java.util.Random;

/*
    【BigInteger】对超过long范围的整数进行计算

    1、构造函数
    （1）BigInteger(int numBits, Random rnd)：构造一个随机生成的BigInteger，均匀分布在0到（2 numBits - 1）的范围内。
    （2）BigInteger(String val)：将BigInteger的十进制字符串表示形式转换为BigInteger。
    （3）BigInteger(String val, int radix)：将指定进制【radix】中的BigInteger的String表示形式转换为BigInteger。

    2、静态方法获取BigInteger对象
    static BigInteger valueOf(long val)： 返回一个BigInteger，其值等于指定的long。【long转BigInteger】

    注意：（1）对象一旦创建，内部记录的值不能发生改变。因为原码中存储数据的数组被final修饰：final int[] mag;
         （2）如果BigInteger表示的数字没有超出long的范围，可以用静态方法。
         （3）如果BigInteger表示的数字超出long的范围，可以用构造方法获取。
         （4）只要进行计算都会产生一个新的BigInteger对象
 */
public class MyBigInteger {
    public static void main(String[] args) {
        //1、获取一个随机的大整数
        BigInteger bd1 = new BigInteger(4, new Random());
        System.out.println("随机获取0到2的4次方之间的整数:bd1="+bd1);

        //2、获取一个指定的大整数
        //注意：字符串中必须是整数，否则会报错
        BigInteger bd2 = new BigInteger("12343434122443323");
        //BigInteger bd3 = new BigInteger("abd");//NumberFormatException
        System.out.println("获取一个指定的大整数:bd2="+bd2);
        
        //3、获取指定进制的大整数
        /*
            注意:（1）字符串中的数字必须是整数
                （2）字符串中的数字必须要跟禁止吻合：比如二进制中，只能写0和1，写其他就报错
        */
        BigInteger bdr4 = new BigInteger("100", 2);
        //BigInteger bdr5 = new BigInteger("103", 2);//NumberFormatException
        System.out.println("获取指定进制的大整数:bdr4="+bdr4);

        //4、静态方法获取BigInteger对象，内部有优化
        /*
            注意：（1）能表示范围比较小，只能在long的取值范围内，如果超过long的范围就不行了
                 （2）在内部对常用的数字：-16~16进行了优化，提前把-16~16先创建好了对象，如果多次获取不会重现创建新的对象
         */
        BigInteger bdr6 = BigInteger.valueOf(100);
        System.out.println("将long转成BigInteger：bdr6="+bdr6);
        System.out.println(BigInteger.valueOf(Long.MAX_VALUE));

        BigInteger bd7 = BigInteger.valueOf(16);
        BigInteger bd8= BigInteger.valueOf(16);
        System.out.println(bd7==bd8);//true

        BigInteger bd9 = BigInteger.valueOf(17);
        BigInteger bd10= BigInteger.valueOf(17);
        System.out.println(bd9==bd10);//false

        //5、对象一旦创建内部的数据不能发生改变
        BigInteger bd11 = BigInteger.valueOf(1);
        BigInteger bd12 = BigInteger.valueOf(2);
        BigInteger result = bd11.add(bd12);//产生了一个新的BigInteger对象
        System.out.println(result);
        System.out.println(bd11==result);//false
        System.out.println(bd12==result);//false
    }
}
