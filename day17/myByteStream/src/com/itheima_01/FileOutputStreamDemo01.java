package com.itheima_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    IO流介绍：输入/输出(Input/Output)
    流：是一种抽象概念，是对数据传输的总称。也就是说数据在设备间的传输称为流，流的本质是数据传输
    IO流就是用来处理设备间数据传输问题的。常见的应用：文件复制；文件上传；文件下载

    IO流的分类：
    （1）按照数据的流向
        输入流：读数据
        输出流：写数据
    （2）按照数据类型来分
        字节流：字节输入流，字节输出流
        字符流：字符输入流，字符输出流

    IO流的使用场景：如果操作的是纯文本文件，优先使用字符流
                 如果操作的是图片、视频、音频等二进制文件。优先使用字节流
                 如果不确定文件类型，优先使用字节流。字节流是万能的流
    注意：无论什么数据，在计算机中都以字节存储，所以字节流可以处理设备上的所有数据，因此字节流也可以处理字符数据

    那么为什么要有字符流呢？
    因为字符每个国家都不一样，所以涉及到字符编码问题，那么GBK编码的中文用unicode编码解析是有问题的，所以需要获
    取中文字节数据的同时结合指定的编码方式才能正确解析。为了方便于文字的分析，将【字节流】和【编码表】封装成对象，
    这就是字符流对象。只要操作字符数据，优先考虑字符流体系。

    流体系四大基类，都是抽象类：
    （1）字节流：InputStream，OutputStream
    （2）字符流：Reader，Writer

    FileOutputStream：文件输出流用于将数据写入File
        FileOutputStream(String name)：创建文件输出流以指定的名称写入文件

    使用字节输出流写数据的步骤:
    (1)创建字节输出流对象(调用系统功能创建了文件，创建字节输出流对象，让字节输出流对象指向文件)
    (2)调用字节输出流对象的写数据方法
    (3)释放资源(关闭此文件输出流并释放与此流相关联的任何系统资源)
 */
public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        //FileOutputStream(String name)：创建文件输出流以指定的名称写入文件
        FileOutputStream fos = new FileOutputStream("myByteStream\\fos.txt");
        /*
            做了三件事情：
                A:调用系统功能创建了文件
                B:创建了字节输出流对象
                C:让字节输出流对象指向创建好的文件
         */

        //void write(int b)：将指定的字节写入此文件输出流
        fos.write(97);//用txt打开显示‘a’
//        fos.write(57);//在txt文件中写入字符'9'
//        fos.write(55);//在txt文件中写入字符'7'

        //最后都要释放资源
        //void close()：关闭此文件输出流并释放与此流相关联的任何系统资源。
        fos.close();
    }
}
