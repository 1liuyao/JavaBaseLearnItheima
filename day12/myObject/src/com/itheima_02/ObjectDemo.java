package com.itheima_02;

/*
    ������

    public boolean equals?(Object obj)��ָʾһЩ���������Ƿ���ڴ�
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("����ϼ");
        s1.setAge(30);

        Student s2 = new Student();
        s2.setName("����ϼ");
        s2.setAge(30);

        //���󣺱Ƚ���������������Ƿ���ͬ
//        System.out.println(s1 == s2);//���ַ�ʽ�Ƚϵ��ǵ�ֵַ������ȡ��

        System.out.println(s1.equals(s2));

        /*//����Object��equals()����
            public boolean equals(Object obj) {
                //this -- s1
                //obj -- s2
                return (this == obj);
            }
         */

    }
}
