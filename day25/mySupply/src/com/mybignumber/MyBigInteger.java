package com.mybignumber;

import java.math.BigInteger;
import java.util.Random;

/*
    ��BigInteger���Գ���long��Χ���������м���

    1�����캯��
    ��1��BigInteger(int numBits, Random rnd)������һ��������ɵ�BigInteger�����ȷֲ���0����2 numBits - 1���ķ�Χ�ڡ�
    ��2��BigInteger(String val)����BigInteger��ʮ�����ַ�����ʾ��ʽת��ΪBigInteger��
    ��3��BigInteger(String val, int radix)����ָ�����ơ�radix���е�BigInteger��String��ʾ��ʽת��ΪBigInteger��

    2����̬������ȡBigInteger����
    static BigInteger valueOf(long val)�� ����һ��BigInteger����ֵ����ָ����long����longתBigInteger��

    ע�⣺��1������һ���������ڲ���¼��ֵ���ܷ����ı䡣��Ϊԭ���д洢���ݵ����鱻final���Σ�final int[] mag;
         ��2�����BigInteger��ʾ������û�г���long�ķ�Χ�������þ�̬������
         ��3�����BigInteger��ʾ�����ֳ���long�ķ�Χ�������ù��췽����ȡ��
         ��4��ֻҪ���м��㶼�����һ���µ�BigInteger����
 */
public class MyBigInteger {
    public static void main(String[] args) {
        //1����ȡһ������Ĵ�����
        BigInteger bd1 = new BigInteger(4, new Random());
        System.out.println("�����ȡ0��2��4�η�֮�������:bd1="+bd1);

        //2����ȡһ��ָ���Ĵ�����
        //ע�⣺�ַ����б���������������ᱨ��
        BigInteger bd2 = new BigInteger("12343434122443323");
        //BigInteger bd3 = new BigInteger("abd");//NumberFormatException
        System.out.println("��ȡһ��ָ���Ĵ�����:bd2="+bd2);
        
        //3����ȡָ�����ƵĴ�����
        /*
            ע��:��1���ַ����е����ֱ���������
                ��2���ַ����е����ֱ���Ҫ����ֹ�Ǻϣ�����������У�ֻ��д0��1��д�����ͱ���
        */
        BigInteger bdr4 = new BigInteger("100", 2);
        //BigInteger bdr5 = new BigInteger("103", 2);//NumberFormatException
        System.out.println("��ȡָ�����ƵĴ�����:bdr4="+bdr4);

        //4����̬������ȡBigInteger�����ڲ����Ż�
        /*
            ע�⣺��1���ܱ�ʾ��Χ�Ƚ�С��ֻ����long��ȡֵ��Χ�ڣ��������long�ķ�Χ�Ͳ�����
                 ��2�����ڲ��Գ��õ����֣�-16~16�������Ż�����ǰ��-16~16�ȴ������˶��������λ�ȡ�������ִ����µĶ���
         */
        BigInteger bdr6 = BigInteger.valueOf(100);
        System.out.println("��longת��BigInteger��bdr6="+bdr6);
        System.out.println(BigInteger.valueOf(Long.MAX_VALUE));

        BigInteger bd7 = BigInteger.valueOf(16);
        BigInteger bd8= BigInteger.valueOf(16);
        System.out.println(bd7==bd8);//true

        BigInteger bd9 = BigInteger.valueOf(17);
        BigInteger bd10= BigInteger.valueOf(17);
        System.out.println(bd9==bd10);//false

        //5������һ�������ڲ������ݲ��ܷ����ı�
        BigInteger bd11 = BigInteger.valueOf(1);
        BigInteger bd12 = BigInteger.valueOf(2);
        BigInteger result = bd11.add(bd12);//������һ���µ�BigInteger����
        System.out.println(result);
        System.out.println(bd11==result);//false
        System.out.println(bd12==result);//false
    }
}
