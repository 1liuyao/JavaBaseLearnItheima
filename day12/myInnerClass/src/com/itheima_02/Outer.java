package com.itheima_02;

public class Outer {

    private int num = 10;//�ⲿ���Աλ��

    /*
    public class Inner {
        public void show() {
            System.out.println(num);//numǰʡ����Outer.this
        }
    }
    */

    private class Inner {
        int num=20;//��Ա�ڲ����Աλ��
        public void show() {
            int num=30;//��Ա�ڲ���ľֲ�λ��
            System.out.println(num);//�ͽ�ԭ�򣬾ֲ��з��ʾֲ�
            System.out.println(this.num);//this�����࣬inner().bnum
            System.out.println(Outer.this.num);//�ⲿ���this���ã�ָ���ⲿ���Ա����
        }
    }

    public void method() {
        Inner i = new Inner();
        i.show();
    }

}
