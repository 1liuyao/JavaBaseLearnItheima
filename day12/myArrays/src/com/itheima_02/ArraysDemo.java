package com.itheima_02;

import java.util.Arrays;

/*
    Arrays ��������ڲ�������ĸ��ַ���

    public static String toString(int[] a)������ָ����������ݵ��ַ�����ʾ��ʽ
    public static void sort(int[] a)����������˳������ָ��������

    ���������˼��
    1�����췽���� private ���Σ���ֹ��紴�����
    2����Ա������ public static�����캯��˽�л�����Ҫ����������
    3����Ա������public static final������ɳ�����������ʹ�õ����书�ܣ����Ƿ���������ɾ�̬��ֻ�ܷ��ʾ�̬��Ա����

    �༶������η���Ĭ�Ϸ���Ȩ�ޣ�public��abstract��final
    ��Ա�������η������ַ���Ȩ�ޣ�static��final
    ��Ա�������η������ַ���Ȩ�ޣ�abstract��static��final
    �ֲ��������η���final
    ע�������ڲ��࣬�����ĸ�λ�á���Ա�������ֲ�������������ѭ�ĸ�λ�õĹ���
    ���Ƕ���ʹ��abstract���Σ�����û��ʲô���壬��Ϊ�����ڲ�����ǲ��뱻���ʵ���
    ��������ʹ��private���Ρ�

 */
public class ArraysDemo {
    public static void main(String[] args) {
        //����һ������
        int[] arr = {24, 69, 80, 57, 13};

        System.out.println("����ǰ��" + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("�����" + Arrays.toString(arr));

//        Math;���췽��˽�л���
//        System;���췽��˽�л���
    }
}
