package com.mybignumber;

import java.math.BigInteger;

/*
    ��BigInteger��Ա��������
    BigInteger add(BigInteger val) ���ӷ�
    BigInteger subtract(BigInteger val)������
    BigInteger multiply(BigInteger val)���˷�
    BigInteger divide(BigInteger val) ��������������
    BigInteger[] divideAndRemainder(BigInteger val) �������������̺�����
    BigInteger pow(int exponent)������
    BigInteger max(BigInteger val)�����ؽϴ�ֵ
    BigInteger min(BigInteger val)�����ؽ�Сֵ
    boolean equals(Object x)���Ƚ�ֵ�Ƿ���ͬ
    int intValue()������BigIntegerת��Ϊint��ע�⣺�������int��Χ����������

    ��BigInteger�ײ�洢��ʽ��
    ��1�����ڼ�������ԣ���ʵ��û���������͵ĸ���ģ�����01����������
    ��2�����������Ǳ�������Լ��涨�ġ�
    ��3��BigIntegerԴ������final int signum������ֵ��������+1����������-1��������0����0
    ��4��BigInteger�н����ݵġ����롿����32λΪһ����λ���и�ɶ���Σ��洢��final int[] mag�С�
    ��5�������������󳤶ȶ���Ϊint��ȡֵ��Χ��2��31�η�-1����32��1���������λΪ����λ��Լ21��
        ��ÿ��magƬ�ε�ȡֵ��ΧΪ��-2��31�η���2��31�η�-1��Լ42�ڣ�����BigInteger���Ա�ʾԼ42�ڵ�21�ڴη�������
 */
public class MyBigInteger2 {
    public static void main(String[] args) {
        //1����������BigInteger����
        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(5);

        //2���ӷ�
        BigInteger bd3 = bd1.add(bd2);
        System.out.println(bd3);

        //3����������ȡ�̺�����
        BigInteger[] bd4 = bd1.divideAndRemainder(bd2);
        System.out.println(bd4.length+"�̣�"+bd4[0]+"������"+bd4[1]);

        //4���Ƚ��Ƿ���ͬ
        System.out.println(bd1.equals(bd2));

        //5������
        BigInteger pow = bd1.pow(3);//10��3�η�
        System.out.println(pow);

        //6��max
        BigInteger max = bd1.max(bd2);
        System.out.println(max);
        System.out.println(max==bd1);//true���ײ�û�д����µĶ����ϴ�ֵ������ֱ�ӷ��ؽϴ�ֵ
        System.out.println(max==bd2);//false

        //7��תΪint����������������Χ��������
        BigInteger bigInteger = BigInteger.valueOf(1000);
        BigInteger bigInteger1 = BigInteger.valueOf(21474836477777L);

        int i = bigInteger.intValue();
        int i1=bigInteger1.intValue();
        System.out.println(i+" "+i1);//1000 -2223,����int��Χ��BigIntegerתintʱ�������
    }
}
