package com.mycomplement;
/*
    &:�߼��� 1&1=1���������Ϊ0
    |:�߼��� 0|0=0���������Ϊ1
    ^:���  ��ͬΪ0����ͬΪ1
    ~:��λȡ��
    <<:����
    >>:����
    >>>:�޷�������
 */
public class BitOperators {
    public static void main(String[] args) {
        //�߼���&
        int a=200;//���� 11001000����λ��24��0��
        int b=10;//����  00001010
        int c=-8;
        System.out.println(a&b);//00001000=8
        //�߼���|
        System.out.println(a|b);//11001010=202
        //��λȡ��
        System.out.println(~c);//00000000 00000000 00000000 00000111=7
        //���^
        System.out.println(a^b);//11000010=194
        //���ƣ���λ���㣬����1bit�൱�ڡ�2
        System.out.println(b<<3);//01010000=80
        //���ƣ�����1bit�൱�ڡ�2,��λ������λ
        System.out.println(a>>2);//00000000 00000000 00000000 00110010=50

        System.out.println(Integer.toBinaryString(c));//11111111 11111111 11111111 11111000
        System.out.println(c>>2);//11111111 11111111 11111111 11111110=-2
        //�޷���λ����
        System.out.println(c>>>2);//00111111 11111111 11111111 11111110=1073741822
    }
}
