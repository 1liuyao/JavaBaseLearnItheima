package com.itheima_01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
    网络编程三要素：
    （1）ip地址：唯一标识网络中的设备，32bit【ipv4】，128【ipv6】
    （2）端口：唯一标识设备中的应用程序，0~65535，如果端口号被另外一个服务或者应用程序占用，则启动失败
    （3）协议：通信规则

    socket=ip+端口号

    DOS常用命令：
    ipconfig：查看本机IP地址
    ping IP地址：检查网络是否连通

    特殊IP地址：127.0.0.1：是回送地址，可以代表本机地址，一般用来测试使用

    InetAddress
        此类表示Internet协议（IP）地址

    public static InetAddress getByName(String host)：确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
    public String getHostName()：获取此IP地址的主机名
    public String getHostAddress()：返回文本显示中的IP地址字符串
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        //public static InetAddress getByName(String host)：确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
//        InetAddress address = InetAddress.getByName("LAPTOP-0J5D9G09");
        InetAddress address = InetAddress.getByName("192.168.0.106");

        //public String getHostName()：获取此IP地址的主机名
        String name = address.getHostName();
        //public String getHostAddress?()：返回文本显示中的IP地址字符串
        String ip = address.getHostAddress();

        System.out.println("主机名：" + name);
        System.out.println("IP地址：" + ip);
    }
}
