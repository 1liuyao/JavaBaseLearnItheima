package com.itheima_06;

/*
    ����
        ĳ��ӰԺĿǰ������ӳ������Ƭ������100��Ʊ��������3��������Ʊ�������һ������ģ��õ�ӰԺ��Ʊ

    ˼·��
        1:����һ����SellTicketʵ��Runnable�ӿڣ����涨��һ����Ա������private int tickets = 100;
        2:��SellTicket������дrun()����ʵ����Ʊ�����벽������
            A:�ж�Ʊ������0������Ʊ������֪���ĸ���������
            B:����Ʊ֮����Ʊ��Ҫ��1
            C:Ʊû���ˣ�Ҳ�����������ʣ�������������ѭ������Ʊ�Ķ���һֱִ��
        3:����һ��������SellTicketDemo��������main���������벽������
            A:����SellTicket��Ķ���
            B:��������Thread��Ķ��󣬰�SellTicket������Ϊ���췽���Ĳ�������������Ӧ�Ĵ�������
            C:�����߳�
 */
public class SellTicketDemo {
    public static void main(String[] args) {
        //����SellTicket��Ķ���
        SellTicket st = new SellTicket();

        //��������Thread��Ķ��󣬰�SellTicket������Ϊ���췽���Ĳ�������������Ӧ�Ĵ�������
        Thread t1 = new Thread(st,"����1");
        Thread t2 = new Thread(st,"����2");
        Thread t3 = new Thread(st,"����3");

        //�����߳�
        t1.start();
        t2.start();
        t3.start();
    }
}
