package com.itheima_04;
/*
    ǰ�᣺
	    ����һ������߽ӿ�
		�����������Ǿ�����Ҳ�����ǳ�����

	��ʽ��
		new �������߽ӿ���(){
			��д����;
		};

	���⣺������ʲô��?
	�ش���Ϊ��Ҫ��д���������������ڲ�����һ���̳��˸������ʵ���˸ýӿڵġ�������������
 */
public class Outer {

    public void method() {
        /*
        new Inter() {//���в�������������Ϊû�е���show����
            @Override
            public void show() {
                System.out.println("�����ڲ���");
            }
        };
        */

//        show();

        /*
        new Inter() {//�����������һ�������˵Ķ��󣬱�����һ��û�����ֵ��������
            @Override
            public void show() {
                System.out.println("�����ڲ���");
            }
        }.show();
        ////��д���ø�����߽ӿڷ�����������1��
        new Inter() {
            @Override
            public void show() {
                System.out.println("�����ڲ���");
            }
        }.show();
        */

        //��д���ø�����߽ӿڷ����������á���Ρ�
        Inter i = new Inter() {
            @Override
            public void show() {
                System.out.println("�����ڲ���");
            }
        };

        i.show();
        i.show();

        //ʹ�������ڲ������з���
        new Inter() {
            @Override
            public void show() {
                System.out.println("�����ڲ���");
            }
            public void show1(){
                System.out.println("�Ǹ����ӿڷ����������ڲ������");
            }
        }.show1();

        //���������ڲ������ã����������ڲ����з����ǲ����е�
        Inter j = new Inter() {
            @Override
            public void show() {
                System.out.println("�����ڲ���");
            }
            public void show1(){
                System.out.println("�Ǹ����ӿڷ����������ڲ������");
            }
        };

        //j.show1();//������Ϊ������߽ӿ��в�����show1()����
                 // Inter j�ǽӿڵ����ã����뿴��ߣ�����ʧ��
        j.show();
    }

}
