package com.itheima_15;
/*
    stop�����Ѿ���ʱ����ô���ֹͣ�߳��أ�
    ֻ��һ�ַ���������run����ִ�н���

    �������߳����У����д���ͨ����ѭ���ṹ
    ֻҪ����סѭ�����Ϳ�����run����������Ҳ�����߳̽���

    ���´�����runֻ����whileѭ�������������̵߳�wait����

 */

public class StopInterruptThread {
    public static void main(String[] args) {
        StopThread st=new StopThread();

        Thread t1=new Thread(st);
        Thread t2=new Thread(st);

        t1.start();
        t2.start();

        int num=0;

        while(true){
            if (num++==60){
                st.setFlag();//����flag��run�е�whileѭ������Ϊ�٣���run��������ִ�У��߳̽���
                break;
            }
            System.out.println(Thread.currentThread().getName()+"...main");
        }
    }
}
class StopThread implements Runnable{
    private boolean flag=true;//ͨ������ѭ����ǿ���run��while��ִ��
    @Override
    public void run() {
        while (flag){
            System.out.println(Thread.currentThread().getName()+"...run");
        }
    }
    public void setFlag(){
        flag=false;
    }
}