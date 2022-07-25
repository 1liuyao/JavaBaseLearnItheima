package com.itheima;
/*
    ������һ�δ��������ʱ��

    ģ�����ģʽ���������ڲ�һ����ʵ��ȷ����һ����ʵ�ֲ�ȷ������ʱ���԰Ѳ�ȷ���Ĳ���
               ��¶��ȥ��������ʵ�֡�
    ע�⣺��1�������д��ͬһ��Դ�ļ��У�ֻ����һ��public�࣬�����ļ�����������ͬ
         ��2��һ���ļ�����ֻ�з�public��
         ��3�����ֻ��һ����pulic�࣬�ļ������Ժ�������ͬ
         ���ǣ�һ��Դ�ļ�����ֻ����һ��public����ڣ���Դ�ļ�����public�������ͬ
 */

 public abstract class TemplateDesignPatterns{
    public final void getTime(){
        long start=System.currentTimeMillis();
        code();
        long end=System.currentTimeMillis();
        System.out.println(end-start);

    }

    public abstract void code() ;
}
 class Zi extends TemplateDesignPatterns{
    @Override
    public void code() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
    }

     public static void main(String[] args) {
         new Zi().getTime();
     }
}