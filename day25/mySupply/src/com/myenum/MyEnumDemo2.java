package com.myenum;

/*
    ��ʹ��enum�ؼ��ֶ���ö���ࡿ
    ��1�������jdk5.0֮ǰ�Զ���ö����ķ�ʽ������enum��������д��ʡ���˴����е��ظ�����
        �ٹ��캯������ʡ��private�ؼ���
        ����Ҫ�������������������еĵ�һ��
        ��ʡ�Դ�����������ʱ������private static final�ؼ���
        ��ʡ��new����д��
        ��ͨ������дtoString()����
    ��2��enum�����ö����̳���class java.lang.Enum�������̳���Object
 */

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MyEnumDemo2 {
    public static void main(String[] args) {
        Season1 autumn = Season1.AUTUMN;
        System.out.println(autumn);//AUTUMN��û�д�ӡ��ֵַ

        System.out.println(Season1.class.getSuperclass());//class java.lang.Enum

    }
}

//enum ����ö����
enum Season1{
    //����Season���������
    // 1���ṩ��ǰö����Ķ��󣬶������֮��ʹ�ö��Ÿ�����ĩβ����ʹ��;
    SPRING("����","��ů����"),
    SUMMER("����","��������"),
    AUTUMN("����","�����ˬ"),
    WINTER("����","����ѩ��");

    private final String seasonName;
    private final String seasonDesc;
    //1��˽�л���Ĺ���������Ϊ����������������޸�������Ϊ�˱����ⲿnew����˽�л����캯����
    Season1(String seasonName,String seasonDesc){
        this.seasonName=seasonName;
        this.seasonDesc=seasonDesc;
    }

    //4���������󣺻�ȡö������������

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

}