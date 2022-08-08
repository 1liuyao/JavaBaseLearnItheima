package com.itheima_13;

public class Box {
    //����һ����Ա��������ʾ��xƿ��
    private int milk;
    //����һ����Ա��������ʾ�����״̬
    private boolean state = false;

    //�ṩ�洢ţ�̺ͻ�ȡţ�̵Ĳ���
    public synchronized void put(int milk) {
        //�����ţ�̣��ȴ�����
        while(state) {//���ڻ����߳��ǻ����̳߳��е�һ���̣߳���˿��ܻ��ѵ����������̣߳������ѭ���жϣ�
            //����ܳ��֣�һ�������������꣬wait����������һ��֮ǰ��wait�������ߣ���ʱ������Ҫ�жϱ�ǣ����
            //������������������
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //���û��ţ�̣�������ţ��
        this.milk = milk;
        System.out.println(Thread.currentThread().getName()+ "���̹�����" + this.milk + "ƿ�̷�������");

        //�������֮���޸�����״̬
        state = true;

        //���������ȴ����߳�
        notifyAll();//�൱��this.notifyAll()��ѭ���жϱ�Ǻ󣬿��ܳ��������̶߳��������״̬������ʹ��notifyAll
    }

    public synchronized void get() {
        //���û��ţ�̣��ȴ�����
        while(!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //�����ţ�̣�������ţ��
        System.out.println(Thread.currentThread().getName()+ "�û��õ���" + this.milk + "ƿ��");

        //�������֮���޸�����״̬
        state = false;

        //���������ȴ����߳�
        notifyAll();//�൱��this.notifyAll()
    }
}
