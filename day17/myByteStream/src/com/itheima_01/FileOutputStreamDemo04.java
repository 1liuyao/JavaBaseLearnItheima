package com.itheima_01;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    字节流写数据加入异常处理

    try-catch-finally语句块
    try{
        可能出现异常的代码;
    }catch(异常类名 变量名){
        异常的处理代码;
    }finally{
    执行所有清除操作;
    }

    finally特点：被finally控制的语句一定会执行，除非JVM退出
 */
public class FileOutputStreamDemo04 {
    public static void main(String[] args) {
//        try {
//            FileOutputStream fos = new FileOutputStream("myByteStream\\fos.txt");
//            fos.write("hello".getBytes());
//            fos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //加入finally来实现释放资源
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("myByteStream\\fos.txt");
//            fos = new FileOutputStream("Z:\\myByteStream\\fos.txt");
            fos.write("hello".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos != null) {//为了在此处可以访问到fos，所以fos要在语句块外声明
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
