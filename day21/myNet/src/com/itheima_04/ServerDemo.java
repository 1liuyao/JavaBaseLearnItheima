package com.itheima_04;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    TCPͨ���ص㣺�������ӣ���������������
               �ɿ�����

    TCP�������ݵĲ���
        1:�����������˵�Socket����(ServerSocket)
        2:��ȡ�������������ݣ�����������ʾ�ڿ���̨
        3:�ͷ���Դ

    Socket(InetAddress address,int port) �������׽��ֲ��������ӵ�ָ��IPָ���˿ں�
    Socket(String host, int port) �������׽��ֲ��������ӵ�ָ�������ϵ�ָ���˿ں�

    InputStream getInputStream() ���ش��׽��ֵ�������
    OutputStream getOutputStream() ���ش��׽��ֵ������

    ServerSocket(int port)�����ط���������
    Socket accept()���������˼������Ŀͻ��˶���
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //�����������˵�Socket����(ServerSocket)
        //ServerSocket(int port) �����󶨵�ָ���˿ڵķ������׽���
        ServerSocket ss = new ServerSocket(8888);

        //Socket accept() ����Ҫ���ӵ����׽��ֲ�������
        Socket s = ss.accept();

        //��ȡ�������������ݣ�����������ʾ�ڿ���̨
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("�����ǣ�" + data);

        //�ͷ���Դ
        s.close();
        ss.close();
    }
}
