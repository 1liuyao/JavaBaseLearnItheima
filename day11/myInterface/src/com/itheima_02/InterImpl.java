package com.itheima_02;

//public class InterImpl implements Inter {

public class InterImpl extends Object implements Inter {//�����д���ȼۣ�ϵͳĬ�ϼ�extends Object
    public InterImpl() {
        super();
    }//���ڽӿ�û�й��캯��������ʵ����Ĺ��캯�����õ�ʱobject��Ĺ��캯��
    //object����������Ļ��࣬һ�������û�м̳��κ�һ���࣬��Ĭ�ϼ̳�object

    @Override
    public void method() {
        System.out.println("method");
    }

    @Override
    public void show() {
        System.out.println("show");
    }
}
