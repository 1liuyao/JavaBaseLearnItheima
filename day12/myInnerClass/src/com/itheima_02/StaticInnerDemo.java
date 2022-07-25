package com.itheima_02;

import java.sql.SQLOutput;

/*
    ��̬��Ա�ڲ���
    �ٳ��ַ��ʾ����ԣ�ֻ�ܷ����ⲿ��ľ�̬��Ա
    �������Ա�ڲ����ж����˾�̬��Ա������ڲ���ֻ���Ǿ�̬��
    ���ⲿ�ྲ̬�������ʳ�Ա�ڲ��࣬�ڲ���Ҳ�����Ǿ�̬��
 */
public class StaticInnerDemo {
    public int num=20;
    public static int num1=30;
    //�Ǿ�̬��Ա�ڲ�������Ǿ�̬����
    private class Inner{
        public void show(){
            System.out.println(num);
        }
    }
    //�Ǿ�̬��Ա�ڲ��������̬����
//    private class Inner1{//������һ����Ա�ڲ����г�Ա������ɾ�̬�������Ϊ��̬
//        public static void show(){
//            //System.out.println(num);//�����޷����ʷǾ�̬��Ա
//            System.out.println(num1);
//        }
//    }
    //��̬��Ա�ڲ�������Ǿ�̬����
    private static class Inner2{
        public void show(){
            //System.out.println(num);//�����޷����ʷǾ�̬��Ա
            System.out.println(num1);
        }
    }
    //��̬��Ա�ڲ��������̬����
    private static class Inner3{
        public static void show(){
            //System.out.println(num);//�����޷����ʷǾ�̬��Ա
            System.out.println(num1);
        }
    }
    public void showInnner(){
        //���ʷǾ�̬��Ա�ڲ���Ǿ�̬����
        new Inner().show();
        //���ʾ�̬��Ա�ڲ���Ǿ�̬����
        new Inner2().show();
        //���ʾ�̬��Ա�ڲ��ྲ̬����
        StaticInnerDemo.Inner3.show();

    }

    public static void showInner1(){
        //�ⲿ�ྲ̬����ֻ�ܷ��ʾ�̬�ڲ���
        //new Inner().show();//�����޷��Ӿ�̬�����������÷Ǿ�̬ ���� this����ΪInner()�ǷǾ�̬��
        new Inner2().show();
        StaticInnerDemo.Inner3.show();
    }

    public static void main(String[] args) {
        //���ʷǾ�̬��Ա�ڲ��ࣨ��̬���Ǿ�̬������
        new StaticInnerDemo().showInnner();
        //��֤�ⲿ�ྲ̬�������ʳ�Ա�ڲ���
        StaticInnerDemo.showInner1();
    }
}
