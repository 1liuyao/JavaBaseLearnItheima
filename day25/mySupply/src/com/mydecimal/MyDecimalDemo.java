package com.mydecimal;
/*
    ��������е�С���洢��
    1��������69.875=2^6+2^2+2^0+2^-1+2^-2+2^-3
                 =01000101.111
    2��ΪʲôС�����ּ���Ӽ��˳���׼ȷ��
    ��1������������float��ռ4���ֽڣ���32bit������23bit��С��ʹ��
    ��2������������double��ռ8���ֽڣ���64bit������52bit��С��ʹ��
    ���磺0.226��Ҫ55λbit��׼������doubleֻ�ܸ���52bit����ô3bit��ɥʧ�˾��ȡ����ݱ���ɥʧ�˾��ȣ��Ӽ��˳��Ͳ����ܾ�ȷ��

    3��Ϊ�˴洢�ϴ��С����������С���ľ�ȷ���㣬java����BigDecimal

    4�����췽����BigDecimal(double val)����׼ȷ���Ƽ�ʹ��
               BigDecimal(String val)
    5����̬������ȡBigDecimal����static BigDecimal valueOf(double val)

    ע�⣺��1�����Ҫ��ʾ�����ֳ�����double�ķ�Χ������ʹ��new BigDecimal(String)
         ��2��������Ǵ��ݵ���[0~10]֮��ġ�������������0������10����ô�����᷵���Ѿ������õĶ��󣬲������´�������
         ��3������һ�����������޸�
 */

import java.math.BigDecimal;

public class MyDecimalDemo {
    public static void main(String[] args) {
        //1��ͨ������double���͵�С������������
        //���ַ�ʽ�п��ܲ���ȷ�����Բ�����ʹ��
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);
        System.out.println(bd1);
        System.out.println(bd2);

        //2��ͨ�������ַ�����ʾ��С������������
        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");
        BigDecimal bd5 = bd3.add(bd4);
        System.out.println(bd3);
        System.out.println(bd4);
        System.out.println(bd5);//��������ȷ0.10
        System.out.println(0.01d+0.09d);//����������ȷ0.09999999999999999

        //3��ͨ����̬������ȡ����
        BigDecimal bd6 = BigDecimal.valueOf(10);//����valueOf(long val)
        BigDecimal bd7 = BigDecimal.valueOf(10);
        System.out.println(bd6==bd7);//true

        BigDecimal bd8 = BigDecimal.valueOf(10.0);//����valueOf(double val)
        BigDecimal bd9 = BigDecimal.valueOf(10.0);
        System.out.println(bd8==bd9);//false
        //ϸ�ڣ�
        //1�����Ҫ��ʾ�����ֲ���û�г���double��ȡֵ��Χ������ʹ��valueOf()
        //2�����Ҫ��ʾ�����ֳ�����double�ķ�Χ������ʹ��new BigDecimal(String)
        //3��������Ǵ��ݵ���[0~10]֮��ġ�������������0������10����ô�����᷵���Ѿ������õĶ��󣬲������´�������
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
    //������õ���valueOf(long val)���������Ҵ������0��10��������������ǰ���ɺõĶ��󣬲��ᴴ���¶���
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
