package com.itheima_01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
    ��������Ҫ�أ�
    ��1��ip��ַ��Ψһ��ʶ�����е��豸��32bit��ipv4����128��ipv6��
    ��2���˿ڣ�Ψһ��ʶ�豸�е�Ӧ�ó���0~65535������˿ںű�����һ���������Ӧ�ó���ռ�ã�������ʧ��
    ��3��Э�飺ͨ�Ź���

    socket=ip+�˿ں�

    DOS�������
    ipconfig���鿴����IP��ַ
    ping IP��ַ����������Ƿ���ͨ

    ����IP��ַ��127.0.0.1���ǻ��͵�ַ�����Դ�������ַ��һ����������ʹ��

    InetAddress
        �����ʾInternetЭ�飨IP����ַ

    public static InetAddress getByName(String host)��ȷ���������Ƶ�IP��ַ���������ƿ����ǻ������ƣ�Ҳ������IP��ַ
    public String getHostName()����ȡ��IP��ַ��������
    public String getHostAddress()�������ı���ʾ�е�IP��ַ�ַ���
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        //public static InetAddress getByName(String host)��ȷ���������Ƶ�IP��ַ���������ƿ����ǻ������ƣ�Ҳ������IP��ַ
//        InetAddress address = InetAddress.getByName("LAPTOP-0J5D9G09");
        InetAddress address = InetAddress.getByName("192.168.0.106");

        //public String getHostName()����ȡ��IP��ַ��������
        String name = address.getHostName();
        //public String getHostAddress?()�������ı���ʾ�е�IP��ַ�ַ���
        String ip = address.getHostAddress();

        System.out.println("��������" + name);
        System.out.println("IP��ַ��" + ip);
    }
}
