package com.itheima_02;

import java.io.FileInputStream;
import java.io.IOException;

/*
    需求：
        把文件fos.txt中的内容读取出来在控制台输出

    FileInputStream：从文件系统中的文件获取输入字节
        FileInputStream(String name)：通过打开与实际文件的连接来创建一个FileInputStream,该文件由文件系统中的路径名name命名

    使用字节输入流读数据的步骤：
        1:创建字节输入流对象
        2:调用字节输入流对象的读数据方法
        3:释放资源
    注意：创建输入流对象时，如果命名文件不存在，是一个目录而不是常规文件，【数据源不存在】
         或者由于某些其他原因无法打开读取，因此抛出一个FileNotFoundException。

    int read() 从该输入流读取一个字节的数据。如果没有更多的数据，因为文件的结尾已经到达，则返回-1 。
 */
public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        //FileInputStream(String name)
        FileInputStream fis = new FileInputStream("day17\\myByteStream\\fos.txt");

        //调用字节输入流对象的读数据方法
        //int read()：从该输入流读取一个字节的数据

        /*
        //第一次读取数据
        int by = fis.read();
        System.out.println(by);
        System.out.println((char)by);

        //第二次读取数据
        by = fis.read();
        System.out.println(by);
        System.out.println((char)by);

        //再多读取两次
        by = fis.read();
        System.out.println(by);
        by = fis.read();
        System.out.println(by);

        //如果达到文件的末尾， read()返回-1
        */

        /*
        int by = fis.read();
        while (by != -1) {
            System.out.print((char)by);
            by = fis.read();
        }
        */

        //优化上面的程序
        int by;
        /*
            fis.read()：读数据
            by=fis.read()：把读取到的数据赋值给by
            by != -1：判断读取到的数据是否是-1
         */
        while ((by=fis.read())!=-1) {
            System.out.print((char)by);
        }

//        for (by= fis.read();by!=-1;by= fis.read()){
//            System.out.print((char)by);
//        }

//        do {
//            by= fis.read();
//            System.out.print((char)by);
//        }while (by!=-1);

        //释放资源
        fis.close();
    }
}
