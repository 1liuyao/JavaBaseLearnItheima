package com.itheima_04;
//���ͽӿڵ�ʵ����
public class GenericImpl<T> implements Generic<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
