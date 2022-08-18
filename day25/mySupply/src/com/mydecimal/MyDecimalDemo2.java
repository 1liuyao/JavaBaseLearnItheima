package com.mydecimal;
/*
    ��BigDecimal�ĳ�Ա������
    ��1��BigDecimal add(BigDecimal augend)����
    ��2��BigDecimal subtract(BigDecimal subtrahend)����
    ��3��BigDecimal multiply(BigDecimal multiplicand)����
    ��4��BigDecimal divide(BigDecimal divisor)����
    ��5��BigDecimal divide(BigDecimal divisor, int scale, RoundingMode roundingMode)��
        ����ָ������λ��scale���Լ�����ģʽ��������������RoundingMode.HALF_DOWN

     ��Enum RoundingMode��
     ��1��CEILING Բ��ģʽ��������������롾x�����������롿
     ��2��FLOOR ����ģʽ�������������  ��x�Ḻ�������롿
     ��3��UP Զ���㷽�����롾������x�����������룬������x�Ḻ�������롿
     ��4��DOWN �����㷽�����롾������x�Ḻ�������룬������x�����������롿
     ��5��HALF_UP ���������������־�����ȣ���UP�������룬������������
     ��6��HALF_DOWN ���������������־�����ȣ���DOWN�������룬������������

     ��BigDecimal�ײ�洢��ʽ��
     ��1����BigDecimal����洢����ֵ�������ַ���֣�ת����ASCIIֵ���γ����顣
        ���磺0.226->'0' '.' '2' '2' '6'->[48,46,50,50,54]
            -1.5->'-' '1' '.' '5'->[45,49,46,53]
     ��2��BigDecimal����ܴ洢����λ�������鳤�����2^31,��21��λ������
 */

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MyDecimalDemo2 {
    public static void main(String[] args) {
        //1���ӷ�
        BigDecimal bd1 = BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(3.0);

        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);

        //2������
        BigDecimal bd4 = bd1.subtract(bd2);
        System.out.println(bd4);

        //3���˷�
        BigDecimal bd5 = bd1.multiply(bd2);
        System.out.println(bd5);

        //4.����
        //BigDecimal bd6 = bd1.divide(bd2);//����������ʹ��,���������򱨴�
        BigDecimal bd6 = bd1.divide(bd2, 2, RoundingMode.HALF_DOWN);
        System.out.println(bd6);





    }
}
