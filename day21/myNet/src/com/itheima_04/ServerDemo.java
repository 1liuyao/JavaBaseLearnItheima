package com.itheima_04;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    TCP通信特点：面向链接：需先启动服务器
               可靠传输

    TCP接收数据的步骤
        1:创建服务器端的Socket对象(ServerSocket)
        2:获取输入流，读数据，并把数据显示在控制台
        3:释放资源

    Socket(InetAddress address,int port) 创建流套接字并将其连接到指定IP指定端口号
    Socket(String host, int port) 创建流套接字并将其连接到指定主机上的指定端口号

    InputStream getInputStream() 返回此套接字的输入流
    OutputStream getOutputStream() 返回此套接字的输出流

    ServerSocket(int port)：返回服务器对象
    Socket accept()：服务器端监听到的客户端对象
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器端的Socket对象(ServerSocket)
        //ServerSocket(int port) 创建绑定到指定端口的服务器套接字
        ServerSocket ss = new ServerSocket(8888);

        //Socket accept() 侦听要连接到此套接字并接受它
        Socket s = ss.accept();

        //获取输入流，读数据，并把数据显示在控制台
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("数据是：" + data);

        //释放资源
        s.close();
        ss.close();
    }
}
