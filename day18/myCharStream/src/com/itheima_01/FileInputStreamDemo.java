package com.itheima_01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
    需求：字节流读文本文件数据，出现乱码。

    一个汉字存储：
        如果是GBK编码，占用2个字节
        如果是UTF-8编码，占用3个字节

    为什么会出现字符流【理解】？
    由于字节流操作中文不是特别的方便，所以Java就提供字符流【字符流 = 字节流 + 编码表】

    中文的字节存储方式：
    用字节流复制文本文件时，文本文件也会有中文，但是没有问题，原因是最终底层操作会自动进行字节拼接成中文，
    如何识别是中文的呢？
    汉字在存储的时候，无论选择哪种编码存储，第一个字节都是负数

    编码表：基础知识
    （1）计算机中存储的信息都是用【二进制】表示
    （2）编码：字符   -->  二进制
    （3）解码：二进制  -->  字符
    （4）采用何种规则编码，就要采用对应规则解码，否则就会出现乱码

 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("myCharStream\\a.txt");
//
//        int by;
//        while ((by = fis.read()) != -1) {
//            System.out.print((char) by);
//        }
//
//        fis.close();

//        String s = "abc"; //[97, 98, 99]
        String s = "中国";  //[-28, -72, -83, -27, -101, -67]
//        byte[] bys = s.getBytes();
//        byte[] bys = s.getBytes("UTF-8"); //[-28, -72, -83, -27, -101, -67]//3个字节代表一个汉字
        byte[] bys = s.getBytes("GBK"); //[-42, -48, -71, -6]//2个字节代表一个汉字
        System.out.println(Arrays.toString(bys));
    }
}
