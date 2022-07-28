package com.itheima_07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/*
    List���ϳ������ࣺArrayList��LinkedList
        ArrayList���ײ����ݽṹ�����飬��ѯ�죬��ɾ��
        LinkedList���ײ����ݽṹ��������ѯ������ɾ��

    ��ϰ��
        �ֱ�ʹ��ArrayList��LinkedList��ɴ洢�ַ���������
 */
public class ListDemo {
    public static void main(String[] args) {
        //�������϶���
        ArrayList<String> array = new ArrayList<String>();

        array.add("hello");
        array.add("world");
        array.add("java");

        //����
        for (String s : array) {
            System.out.println(s);
        }
        //ʣ�����ֱ�����ʽ��Ҳ���
        System.out.println("--------");

        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        for(String s : linkedList) {
            System.out.println(s);
        }
        //ʣ�����ֱ�����ʽ��Ҳ���

        System.out.println("��ʽ����");
        for (int i=0;i<linkedList.size();i++){
            String s=linkedList.get(i);
            System.out.println(s);
        }

        System.out.println("��ʽ����");
        ListIterator<String> listIterator = linkedList.listIterator();
        while(listIterator.hasNext()){
            String s=listIterator.next();
            System.out.println(s);
        }

    }
}
