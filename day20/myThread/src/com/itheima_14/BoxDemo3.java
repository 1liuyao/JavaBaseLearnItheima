package com.itheima_14;

/*
    �����ڶ������ߣ��������ߵ�����£�������������߳�ֻ�����������߳�
         ���notifyAll�����Ļ��ѱ����̵߳����⡣

    ���������Lock+Condition
    ��1����Synchronized������ʾ�ļ������ͷ�������
    ��2����Object���еĵȴ����Ѳ�������ΪCondition���е�await��signal����
    ��3��ͨ����ͬһ��lock�������condition����������ָ�����߳�
 */
public class BoxDemo3 {
    public static void main(String[] args) {
        //��������������ǹ�����������
        Box b=new Box();

        //���������߶��󣬰����������Ϊ���췽���������ݣ���Ϊ���������Ҫ���ô洢ţ�̵Ĳ���
        Producer p = new Producer(b);
        //���������߶��󣬰����������Ϊ���췽���������ݣ���Ϊ���������Ҫ���û�ȡţ�̵Ĳ���
        Customer c = new Customer(b);

        //����2���̶߳��󣬷ֱ�������߶���������߶�����Ϊ���췽���������ݡ����������ߣ����������ߡ�
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);
        Thread t3 = new Thread(c);
        Thread t4 = new Thread(c);

        //�����߳�
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
