package com.itheima_05;
/*
    ��ʽ2��ʵ��Runnable�ӿ�
        1:����һ����MyRunnableʵ��Runnable�ӿ�
        2:��MyRunnable������дrun()����
        3:����MyRunnable��Ķ���
        4:����Thread��Ķ��󣬰�MyRunnable������Ϊ���췽���Ĳ���
        5:�����߳�

    ���̵߳�ʵ�ַ��������֣�
    ��1���̳�Thread��
    ��2��ʵ��Runnable�ӿ�

    ��ȼ̳�Thread�࣬ʵ��Runnable�ӿڵĺô�
    ��1��������Java���̳еľ�����
    ��2���ʺ϶����ͬ����Ĵ���ȥ����ͬһ����Դ��run�����з�װ�����ݡ�����������̺߳ͳ���Ĵ��롢������Ч���룬�Ϻõ������������������˼��
 */
public class MyRunnableDemo {
    public static void main(String[] args) {
        //����MyRunnable��Ķ���
        MyRunnable my = new MyRunnable();

        //����Thread��Ķ��󣬰�MyRunnable������Ϊ���췽���Ĳ���
        //Thread(Runnable target)
//        Thread t1 = new Thread(my);
//        Thread t2 = new Thread(my);

        //Thread(Runnable target, String name)
        Thread t1 = new Thread(my,"����");
        Thread t2 = new Thread(my,"�ɻ�");

        //�����߳�
        t1.start();
        t2.start();
    }
}
