package com.itheima_06;

/*
    ���ֻ�
 */
public class NewPhone extends Phone {

    /*
    public void call(String name) {
        System.out.println("������Ƶ����");
//        System.out.println("��" + name + "��绰");
        super.call(name);
    }
    */

    @Override //������ⷽ����д�ĸ�ʽ�Ƿ���ȷ
    public void call(String name) {
        System.out.println("������Ƶ����");
//        System.out.println("��" + name + "��绰");
        super.call(name);
    }

}
