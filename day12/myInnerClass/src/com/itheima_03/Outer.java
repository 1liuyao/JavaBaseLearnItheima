package com.itheima_03;

public class Outer {

    private int num = 10;

    public void method() {
        //Inner i = new Inner();//�����ֲ��ڲ���Ķ�����д�ڵ�һ�У���Ϊ��ʱ�ֲ��ڲ��໹û�м���
        int num2 = 20;
        class Inner {//�ඨ���ڷ����ڲ���Ϊ�ֲ��ڲ���
            public void show() {
                System.out.println(num);
                System.out.println(num2);
            }
        }

        Inner i = new Inner();
        i.show();

    }

}
