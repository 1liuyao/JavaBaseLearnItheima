package com.itheima_02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    需求：
        把“E:\\itcast\\窗里窗外.txt”复制到模块目录下的“窗里窗外.txt”

        数据源：
            E:\\itcast\\窗里窗外.txt --- 读数据 --- InputStream --- FileInputStream
        目的地：
            myByteStream\\窗里窗外.txt --- 写数据 --- OutputStream --- FileOutputStream

    思路：
        1:根据数据源创建字节输入流对象
        2:根据目的地创建字节输出流对象
        3:读写数据，复制文本文件(一次读取一个字节，一次写入一个字节)
        4:释放资源

    流对象操作规律总结：
    （1）明确源和目的：数据源：InputStream    Reader
                    数据汇：OutputStream   Writer
    （2）明确要操作的数据是否是纯文本数据
        如果是，数据源Reader       数据汇Writer
        如果否，数据源InputStream  数据汇OutputStream
    （3）选择合适的流对象
        数据源对应的设备：硬盘（File）  内存（array）  键盘（System.in）
        数据汇对应的设备：硬盘（File）  内存（array）  键盘（System.out）
    （4）需要在基本操作上附加其他功能吗？比如缓冲【装饰类】
 */
public class CopyTxtDemo {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字节输入流对象
        FileInputStream fis = new FileInputStream("E:\\itcast\\窗里窗外.txt");
        //根据目的地创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("myByteStream\\窗里窗外.txt");

        //读写数据，复制文本文件(一次读取一个字节，一次写入一个字节)
        int by;
        while ((by=fis.read())!=-1) {
            fos.write(by);
        }

        //释放资源
        fos.close();
        fis.close();
    }
}
