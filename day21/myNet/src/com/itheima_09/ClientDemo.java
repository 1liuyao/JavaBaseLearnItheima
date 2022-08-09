package com.itheima_09;

import java.io.*;
import java.net.Socket;

/*
    客户端：数据来自于文本文件，接收服务器反馈

    问题：程序一致等待
    原因：Socket流read方法是阻塞式的，如果无法读到流中的终止标记，则会一致等待读取

    TCP流终止标记：
    void shutdownInput() 在Socket输入流末尾写入终止标记
    void shutdownOutput() 在Socket输出流末尾写入终止标记
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket("192.168.1.66",10000);

        //封装文本文件的数据
        BufferedReader br = new BufferedReader(new FileReader("myNet\\InetAddressDemo.java"));
        //封装输出流写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line=br.readLine())!=null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

//        System.out.println(22222);

        //自定义结束标记
        //自定义结束标记的弊端：如果读取的文件中本来就包含了自定义结束标记【886】，则会服务端会判定Socket读取流结束，复制的文件就会有残缺
//        bw.write("886");
//        bw.newLine();
//        bw.flush();

        //public void shutdownOutput()：向TCP写入流中写入停止标记
        s.shutdownOutput();

        //接收反馈
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = brClient.readLine(); //等待读取数据
        System.out.println("服务器的反馈：" + data);

        //释放资源
        br.close();
        s.close();
    }
}
