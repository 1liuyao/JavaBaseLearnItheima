package com.itheima_13;

/*
   ���󣺴��ڶ�������ߣ����������,ʵ������һ������һ����Ŀ��

   ���ڶ�������ߺͶ�������ߵ����
   ΪʲôҪ����while�жϱ�ǣ�
   ԭ���ñ����ѵ��߳���һ���жϱ��

   Ϊʲô����notifyAll
   ��Ϊ��Ҫ���ѶԷ��߳�
   ��Ϊֻ��notify�����׳���ֻ���ѱ����̵߳���������³����������̶߳��ȴ�
 */
public class BoxDemo2 {
    public static void main(String[] args) {
        //��������������ǹ�����������
        Box b = new Box();

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
