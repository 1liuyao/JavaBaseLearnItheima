package com.myenum;
/*
    ��ö����Enum��

    1��ö�������⣺�����Ķ���ֻ�����޸���������ȷ���ģ����Ǿͳƴ���Ϊö���ࡣ
    2������Ҫ����һ�鳣��ʱ��ǿ�ҽ���ʹ��ö����
    3�����ö������ֻ��һ�������������Ϊ����ģʽ��ʵ�ַ�ʽ
    4����ζ���ö����
    ��1��jdk5.0��ǰ���Զ���ö����
    ��2��jdk5.0ʱ������ʹ��enum�ؼ��ֶ���ö����
 */
public class MyEnumDemo {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring);
    }
}

//�Զ���ö����
class Season{
    //����Season���������
    private final String seasonName;
    private final String seasonDesc;
    //1��˽�л���Ĺ���������Ϊ����������������޸�������Ϊ�˱����ⲿnew����˽�л����캯����
    private Season(String seasonName,String seasonDesc){
        this.seasonName=seasonName;
        this.seasonDesc=seasonDesc;
    }

    //3���ṩ��ǰö����Ķ�����󣬳���
    public static final Season SPRING=new Season("����","��ů����");
    public static final Season SUMMER=new Season("����","��������");
    public static final Season AUTUMN=new Season("����","�����ˬ");
    public static final Season WINTER=new Season("����","����ѩ��");

    //4���������󣺻�ȡö������������

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}


