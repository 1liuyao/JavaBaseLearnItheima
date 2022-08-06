package com.itheima_10;

import java.util.*;

/*
StringBuffer
        �̰߳�ȫ���ɱ���ַ�����
        �Ӱ汾JDK 5��ʼ����StringBuilder �����
        ͨ��Ӧ��ʹ��StringBuilder�࣬��Ϊ��֧��������ͬ�Ĳ������������죬��Ϊ����ִ��ͬ��
Vector
        ��Java 2ƽ̨v1.2��ʼ������Ľ���List�ӿڣ�ʹ���ΪJava Collections Framework�ĳ�Ա��
        ���µļ���ʵ�ֲ�ͬ�� Vector��ͬ���� �������Ҫ�̰߳�ȫ��ʵ�֣�����ʹ��ArrayList����Vector
Hashtable
        ����ʵ����һ����ϣ��������ӳ�䵽ֵ�� �κη�null���󶼿�������������ֵ
        ��Java 2ƽ̨v1.2��ʼ����������˸Ľ���ʵ����Map�ӿڣ�ʹ���ΪJava Collections Framework�ĳ�Ա��
        ���µļ���ʵ�ֲ�ͬ�� Hashtable��ͬ���� �������Ҫ�̰߳�ȫ��ʵ�֣�����ʹ��HashMap����Hashtable

����ͬ������ת��Ϊͬ�����ϵķ��������Ϲ�����Collections
static <T> List<T> synchronizedList(List<T> list)
static <K,V> Map<K,V> synchronizedMap(Map<K,V> m)
static <T> Set<T> synchronizedSet(Set<T> s)
 */
public class ThreadDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();

        Vector<String> v = new Vector<String>();
        ArrayList<String> array = new ArrayList<String>();

        Hashtable<String,String> ht = new Hashtable<String, String>();
        HashMap<String,String> hm = new HashMap<String, String>();

        //static <T> List<T> synchronizedList(List<T> list) ���̲߳���ȫ���б�ת���̰߳�ȫ���б�
        List<String> list = Collections.synchronizedList(new ArrayList<String>());
    }
}
