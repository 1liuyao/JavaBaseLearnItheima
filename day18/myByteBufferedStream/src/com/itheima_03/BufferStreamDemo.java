package com.itheima_03;

import java.io.*;

/*
    字节缓冲流：【内部封装了一个字节数组buf[8092]】
        BufferOutputStream
        BufferedInputStream

    构造方法：
        字节缓冲输出流：BufferedOutputStream(OutputStream out)
        字节缓冲输入流：BufferedInputStream(InputStream in)

    问题：为什么构造方法需要的是字节流，而不是具体的文件或者路径呢？
    回答：字节缓冲流仅仅提供缓冲区，而真正的读写数据还得依靠基本的字节流对象进行操作
 */
public class BufferStreamDemo {
    public static void main(String[] args) throws IOException {
        //字节缓冲输出流：BufferedOutputStream(OutputStream out)
//        FileOutputStream fos = new FileOutputStream("day18\\myByteBufferedStream\\bos.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
        /*

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myByteStream\\bos.txt"));
        //写数据
        bos.write("hello\r\n".getBytes());
        bos.write("world\r\n".getBytes());
        //释放资源
        bos.close();
        */

        //字节缓冲输入流：BufferedInputStream(InputStream in)
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myByteStream\\bos.txt"));

        //一次读取一个字节数据
//        int by;
//        while ((by=bis.read())!=-1) {
//            System.out.print((char)by);
//        }

        //一次读取一个字节数组数据
        byte[] bys = new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1) {
            System.out.print(new String(bys,0,len));
        }

        //释放资源
        bis.close();
    }
}
