package com.itheima_02;

import java.io.IOException;
import java.net.*;

/*
    UDP�������ݵĲ���
        1:�������Ͷ˵�Socket����(DatagramSocket)
        2:�������ݣ��������ݴ��
        3:����DatagramSocket����ķ�����������
        4:�رշ��Ͷ�

    UDP�ص㣺����������
            �������ܽ��������ɿ�
            �ٶȿ죬�ӳٵͣ�����С��ͷ��8���ֽڡ�
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        //�������Ͷ˵�Socket����(DatagramSocket)
        // DatagramSocket() �������ݱ��׽��ֲ�����󶨵����������ϵ��κο��ö˿�
        DatagramSocket ds = new DatagramSocket();

        //�������ݣ��������ݴ��
        //DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        //����һ�����ݰ������ͳ���Ϊ length�����ݰ���ָ�������ϵ�ָ���˿ںš�
        byte[] bys = "hello,udp,������".getBytes();
//        int length = bys.length;
//        InetAddress address = InetAddress.getByName("192.168.1.66");
//        int port = 10086;
//        DatagramPacket dp = new DatagramPacket(bys,length,address,port);
        DatagramPacket dp = new DatagramPacket(bys,bys.length,InetAddress.getByName("192.168.0.106"),10086);

        //����DatagramSocket����ķ�����������
        //void send(DatagramPacket p) �Ӵ��׽��ַ������ݱ���
        ds.send(dp);

        //�رշ��Ͷ�
        //void close() �رմ����ݱ��׽���
        ds.close();
    }
}
