package com.myenum;
/*
    �������ÿһ��ö�ٳ�����������ӿ��г��󷽷��Ĳ�ͬʵ�ַ�ʽ
 */

public enum Season2 implements MyShow{
    SPRING("����","��ů����"){
        @Override
        public void show() {
            System.out.println("��ô���");
        }
    },
    SUMMER("����","��������"){
        @Override
        public void show() {
            System.out.println("�������");
        }
    },
    AUTUMN("����","�����ˬ"){
        @Override
        public void show() {
            System.out.println("�������");
        }
    },
    WINTER("����","����ѩ��"){
        @Override
        public void show() {
            System.out.println("��ö���");
        }
    };

    private final String seasonName;
    private final String seasonDesc;
    //1��˽�л���Ĺ���������Ϊ����������������޸�������Ϊ�˱����ⲿnew����˽�л����캯����
    Season2(String seasonName,String seasonDesc){
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

    //��д�ӿ��еĳ��󷽷�

//    @Override
//    public void show() {
//        System.out.println("����һ������");
//    }
}
