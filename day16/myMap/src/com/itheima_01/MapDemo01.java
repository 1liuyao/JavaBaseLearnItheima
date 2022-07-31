package com.itheima_01;

import java.util.HashMap;
import java.util.Map;

/*
    Map���ϸ���
        Interface Map<K,V>	K���������ͣ�V��ֵ������
        ����ӳ�䵽ֵ�Ķ��󣻲��ܰ����ظ��ļ���ÿ��������ӳ�䵽���һ��ֵ��null��
        ������ѧ����ѧ�ź�����
              itheima001	����ϼ
              itheima002	������
              itheima003	������

    ����Map���ϵĶ���
        ��̬�ķ�ʽ
        �����ʵ����HashMap

    Map���ϵ��ص㣺
    ��1����ֵ��ӳ���ϵ
    ��2��һ������Ӧһ��ֵ
    ��3���������ظ���hash���������ֵ�����ظ�
    ��4��Ԫ�ش�ȡ����

    Map��---HashTable���ײ��ǹ�ϣ�����ݽṹ���߳�ͬ���������Դ洢null����nullֵ
         ---HashMap���ײ��ǹ�ϣ�����ݽṹ���̲߳�ͬ�������Դ洢null����nullֵ
         ---TreeMap���ײ��Ƕ������ṹ���̲߳�ͬ���������Դ洢null����nullֵ,���ԶԼ����еļ�����ָ��˳������
 */
public class MapDemo01 {
    public static void main(String[] args) {
        //�������϶���
        Map<String,String> map = new HashMap<String,String>();

        //V put(K key, V value) ��ָ����ֵ���ӳ���е�ָ���������
        map.put("itheima001","����ϼ");
        map.put("itheima002","������");
        map.put("itheima003","������");
        map.put("itheima003","����");//�Ḳ��ǰһ����ͬ����Ӧ��ֵ������put����Ҳ���������޸�Ԫ�ص�value

        //������϶���
        System.out.println(map);
    }
}
