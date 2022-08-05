package com.itheima_02;

import java.io.IOException;
import java.io.PrintStream;

/*
    打印流的特点：
        只负责输出数据，不负责读取数据
        有自己的特有方法：print println
        写数据操作同OutputStream中Write相同

    字节打印流
        PrintStream(String fileName)：使用指定的文件名创建新的打印流
        PrintStream(OutputStream out)：初始化可传入字节输出流子类
        PrintStream(File file)：初始化可传入文件对象
 */
public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {
        //PrintStream(String fileName)：使用指定的文件名创建新的打印流
        PrintStream ps = new PrintStream("myOtherStream\\ps.txt");

        //写数据
        //字节输出流有的方法
//        ps.write(97); //文件打开显示a

        //使用特有方法写数据
//        ps.print(97);
//        ps.println();
//        ps.print(98);
        ps.println(97);//文件打开就显示97，原样输出
        ps.println(98);


        //释放资源
        ps.close();
    }
}
