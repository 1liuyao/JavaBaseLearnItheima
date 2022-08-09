package com.itheima_04;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
    TCP�������ݵĲ���
        1:�����ͻ��˵�Socket����(Socket)
        2:��ȡ�������д����
        3:�ͷ���Դ
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //�����ͻ��˵�Socket����(Socket)
        //Socket(InetAddress address, int port) �������׽��ֲ��������ӵ�ָ��IP��ַ��ָ���˿ں�
//        Socket s = new Socket(InetAddress.getByName("192.168.1.66"),10000);
        //Socket(String host, int port) �������׽��ֲ��������ӵ�ָ�������ϵ�ָ���˿ں�
        Socket s = new Socket("192.168.0.106",8888);

        //��ȡ�������д����
        //OutputStream getOutputStream() ���ش��׽��ֵ������
        OutputStream os = s.getOutputStream();
        os.write("hello,tcp,������".getBytes());

        //�ͷ���Դ
        s.close();
    }
}
