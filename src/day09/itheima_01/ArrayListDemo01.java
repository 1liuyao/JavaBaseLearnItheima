package day09.itheima_01;

import java.util.ArrayList;

/*
    ��������ص㣺�洢�ռ�ɱ䣬�洢�����������ɱ�
    ArrayList�����ȿɱ�����飬�ײ�������ʵ��

    ArrayList���췽����
        public ArrayList?()������һ���յļ��϶���

    ArrayList��ӷ�����
        public boolean add(E e)����ָ����Ԫ��׷�ӵ��˼��ϵ�ĩβ
        public void add(int index,E element)���ڴ˼����е�ָ��λ�ò���ָ����Ԫ��
 */
public class ArrayListDemo01 {
    public static void main(String[] args) {
        //public ArrayList?()������һ���յļ��϶���
//        ArrayList<String> array = new ArrayList<>();//����д��Ҳ����

        ArrayList<String> array = new ArrayList<String>();

        //public boolean add(E e)����ָ����Ԫ��׷�ӵ��˼��ϵ�ĩβ
//        System.out.println(array.add("hello"));

        array.add("hello");
        array.add("world");
        array.add("java");

        //public void add(int index,E element)���ڴ˼����е�ָ��λ�ò���ָ����Ԫ��
        array.add(1, "javase");
//        array.add(3,"javaee");

        //IndexOutOfBoundsException����������Χ����
//        array.add(4,"javaee");

        //�������
        System.out.println("array:" + array);

    }
}
