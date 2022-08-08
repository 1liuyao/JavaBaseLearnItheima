package com.itheima_15;

/*
    ������������̴߳��ڶ���״̬���Ͳ����ȡ����ǣ���ô�߳̾Ͳ������.

    ���������void interrupt() �ж�����̡߳����̴߳�����״̬ת�ɾ���״̬��
 */

public class StopInterruptThread1 {
    public static void main(String[] args) {
       StopThread1 st = new StopThread1();

        Thread t1 = new Thread(st);
        Thread t2 = new Thread(st);

        t1.start();
        t2.start();

        int num = 0;

        while (true) {
            if (num++ == 60) {
                t1.interrupt();//���̴߳�wait��ת�ɾ���״̬
                t2.interrupt();
                break;
            }
            System.out.println(Thread.currentThread().getName() + "...main");
        }
    }
}

class StopThread1 implements Runnable {
    private boolean flag = true;//ͨ������ѭ����ǿ���run��while��ִ��

    @Override
    public synchronized void run() {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("�ж��쳣");
                flag=false;
            }
            System.out.println(Thread.currentThread().getName() + "...run");
        }
    }

    public void setFlag() {
        flag = false;
    }
}

