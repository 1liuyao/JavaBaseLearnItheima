package com.itheima_01;

import java.util.Calendar;

/*
    Calendar Ϊ�ض�˲����һ�������ֶΡ��� �� �� ʱ��֮���ת���ṩ��һЩ������
             ��Ϊ���������ֶΡ��� �� �� ʱ���ṩ��һЩ����
             ע����ν�������ֶΣ�����Calendar��ĳ�Ա���ԣ��Ҷ���Static���Σ���ʹ������ֱ�ӵ���

    Calendar �ṩ��һ���෽�� getInstance ���ڻ�ȡ�������͵�һ�����õĶ��󣬸÷�������һ�� Calendar ����
    �������ֶ���ʹ�á���ǰ���ں�ʱ�䡿��ʼ����Calendar rightNow = Calendar.getInstance();

    ע������Calendar���ǳ����࣬����Ҫʹ���䷽���������ַ�ʽ��
    ��1��ʹ��Calendar�෽�����صĶ���getInstance()
    ��2�����ö�̬�ͣ�ʹ�����������GregorianCalendar����Calendar
    ��3�����������Ҫ�Ż����ڵ���ʾ��ʽ�⣬��������ڵ��ֶΡ������ա��������Ӽ�������ôѡCalendar
 */

public class CalendarDemo {
    public static void main(String[] args) {
        //�����ֶ���ʹ�õ�ǰ���ں�ʱ���ʼ��
        Calendar c = Calendar.getInstance();//��̬����ʽ��ȡ�������

        System.out.println(c);//�鿴Calendar������ַ���������ʽ�����������е������ֶ�

        //public int get(int field)
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);//��0��ʼ��11
        int date = c.get(Calendar.DATE);

        System.out.println(year + "��" + (month + 1) + "��" + date + "��");

    }
}
