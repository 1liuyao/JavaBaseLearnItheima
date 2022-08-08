package com.itheima_14;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Box {
    //����һ����Ա��������ʾ��xƿ��
    private int milk;
    //����һ����Ա��������ʾ�����״̬
    private boolean state = false;
    //����������ʹ��������
    Lock lock = new ReentrantLock();
    //��Ϊ�̱߳�����������ܵ��õȴ����ѷ��������Կ���ͨ��lock���Condition����
    Condition condition_pro = lock.newCondition();
    Condition condition_con = lock.newCondition();

    //�ṩ�洢ţ�̺ͻ�ȡţ�̵Ĳ���
    public void put(int milk) {
        //�����ţ�̣��ȴ�����
        lock.lock();
        try {
            while (state) {//���ڻ����߳��ǻ����̳߳��е�һ���̣߳���˿��ܻ��ѵ����������̣߳������ѭ���жϣ�
                //����ܳ��֣�һ�������������꣬wait����������һ��֮ǰ��wait�������ߣ���ʱ������Ҫ�жϱ�ǣ����
                //������������������
                condition_pro.await();
            }

            //���û��ţ�̣�������ţ��
            this.milk = milk;
            System.out.println(Thread.currentThread().getName() + "���̹�����" + this.milk + "ƿ�̷�������");

            //�������֮���޸�����״̬
            state = true;

            //���������ȴ����߳�
            condition_con.signal();//�൱��this.notifyAll()��ѭ���жϱ�Ǻ󣬿��ܳ��������̶߳��������״̬������ʹ��notifyAll
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public synchronized void get() {
        //���û��ţ�̣��ȴ�����
        lock.lock();
        try {
            while (!state) {
                condition_con.await();
            }

            //�����ţ�̣�������ţ��
            System.out.println(Thread.currentThread().getName() + "�û��õ���" + this.milk + "ƿ��");

            //�������֮���޸�����״̬
            state = false;

            //���������ȴ����߳�
            condition_pro.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
