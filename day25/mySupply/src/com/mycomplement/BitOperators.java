package com.mycomplement;
/*
    &:逻辑与 1&1=1，其余情况为0
    |:逻辑或 0|0=0，其余情况为1
    ^:异或  相同为0，不同为1
    ~:安位取反
    <<:左移
    >>:右移
    >>>:无符号右移
 */
public class BitOperators {
    public static void main(String[] args) {
        //逻辑与&
        int a=200;//补码 11001000【高位补24个0】
        int b=10;//补码  00001010
        int c=-8;
        System.out.println(a&b);//00001000=8
        //逻辑或|
        System.out.println(a|b);//11001010=202
        //按位取反
        System.out.println(~c);//00000000 00000000 00000000 00000111=7
        //异或^
        System.out.println(a^b);//11000010=194
        //左移，低位补零，左移1bit相当于×2
        System.out.println(b<<3);//01010000=80
        //右移，右移1bit相当于÷2,高位补符号位
        System.out.println(a>>2);//00000000 00000000 00000000 00110010=50

        System.out.println(Integer.toBinaryString(c));//11111111 11111111 11111111 11111000
        System.out.println(c>>2);//11111111 11111111 11111111 11111110=-2
        //无符号位右移
        System.out.println(c>>>2);//00111111 11111111 11111111 11111110=1073741822
    }
}
