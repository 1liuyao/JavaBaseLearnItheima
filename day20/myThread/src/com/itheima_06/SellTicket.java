package com.itheima_06;

//����һ����SellTicketʵ��Runnable�ӿڣ����涨��һ����Ա������private int tickets = 100;
public class SellTicket implements Runnable {
    private int tickets = 100;//����ʵ��Runnable�ķ�ʽ�����߳̽�����tickets����Ϊ�̲߳�������һ������
                        // ������ü̳�Thread��ʽ����ÿ����һ��������������̣߳��ͻ��ڶ��ڴ��в���һ��ticket
                        //�޷�ʵ�ֶ���̹߳���һ����Դ��

    //��SellTicket������дrun()����ʵ����Ʊ�����벽������

    @Override
    public void run() {
//        A:�ж�Ʊ������0������Ʊ������֪���ĸ���������
//        B:����Ʊ֮����Ʊ��Ҫ��1
//        C:Ʊû���ˣ�Ҳ�����������ʣ�������������ѭ������Ʊ�Ķ���һֱִ��

        while (true) {
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + tickets + "��Ʊ");
                tickets--;
            }
        }
    }
}
