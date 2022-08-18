package com.myenum;

/*
    ��Enum���е���Ҫ������
    ��1��static <T extends Enum<T>>T valueOf(Class<T> enumType, String name)��
        ���԰�һ���ַ���תΪ��Ӧ��ö�������Ҫ���ַ���������ö�����������֡�������ǣ�����
        ����ʱ�쳣IllegalArgumentException��
    ��2��values()������ö�����͵Ķ������飬�÷������Ժܷ���ı������е�ö��ֵ
    ��3��String toString():���ص�ǰö�ٶ�����������
 */
public class MyEnumDemo3 {
    public static void main(String[] args) {
        Season1 summer = Season1.valueOf("SUMMER");
        System.out.println(summer);

        System.out.println("==============");
        Season1[] values = Season1.values();
        for (Season1 sea:values) {
            System.out.println(sea);
        }

        System.out.println("==============");
        System.out.println(Season1.SPRING.toString());
    }
}
