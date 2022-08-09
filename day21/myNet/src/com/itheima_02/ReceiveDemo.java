package com.itheima_02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
    UDP�������ݵĲ���
        1:�������ն˵�Socket����(DatagramSocket)
        2:����һ�����ݰ������ڽ�������
        3:����DatagramSocket����ķ�����������
        4:�������ݰ������������ڿ���̨��ʾ
        5:�رս��ն�
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //�������ն˵�Socket����(DatagramSocket)
        //DatagramSocket(int port) �������ݱ��׽��ֲ�����󶨵����������ϵġ�ָ���˿ڡ�
        DatagramSocket ds = new DatagramSocket(10086);

        //����һ�����ݰ������ڽ�������
        //DatagramPacket(byte[] buf, int length) ����һ�� DatagramPacket���ڽ��ճ���Ϊ length���ݰ�
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys,bys.length);

        //����DatagramSocket����ķ�����������
        ds.receive(dp);

        //�������ݰ������������ڿ���̨��ʾ
        //byte[] getData() �������ݻ���������С��1024
//        byte[] datas = dp.getData();
        //int getLength() ����Ҫ���͵����ݵĳ��Ȼ���յ������ݵĳ���
//        int len = dp.getLength();
//        String dataString = new String(datas,0,len);
//        System.out.println("�����ǣ�" + dataString);
        System.out.println("�����ǣ�" + new String(dp.getData(),0,dp.getLength()));
        System.out.println("��������СΪ��"+dp.getData().length);//��������СΪ��1024
        System.out.println("ʵ�ʴ������ݴ�СΪ"+dp.getLength());// ʵ�ʴ������ݴ�СΪ16

        //�رս��ն�
        ds.close();
    }
}
