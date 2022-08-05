package com.itheima_09;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
    复制文件加入异常处理

    (1)try catch finally
        try{
            可能出现异常的代码;
        }catch（异常类名 变量名）{
            异常处理代码;
        }finally{
            执行关闭资源操作;
        }
    (2)JDK7改进方案【try上定义流对象，无finally，自动释放资源】
        try（定义流对象）{
            可能出现异常的代码;
        }catch（异常类名 变量名）{
            异常处理代码;
        }
    (3)JDK9改进方案【try外定义流对象，无finally，自动释放资源】
        定义输入流对象;
        定义输出流对象;
        try（输入流对象;输出流对象）{
            可能出现异常的代码;
        }catch（异常类名 变量名）{
            异常处理代码;
        }
      注意：JDK9在try外创建流对象，创建过程可能源不存在，仍然存在io异常，仍然要抛IOException
 */
public class CopyFileDemo {
    public static void main(String[] args) {

    }

    //JDK9的改进方案
//    private static void method4() throws IOException {
//        FileReader fr = new FileReader("fr.txt");
//        FileWriter fw = new FileWriter("fw.txt");
//        try(fr;fw){
//            char[] chs = new char[1024];
//            int len;
//            while ((len = fr.read()) != -1) {
//                fw.write(chs, 0, len);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    //JDK7的改进方案
    private static void method3() {
        try(FileReader fr = new FileReader("fr.txt");
            FileWriter fw = new FileWriter("fw.txt");){
            char[] chs = new char[1024];
            int len;
            while ((len = fr.read()) != -1) {
                fw.write(chs, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //try...catch...finally
    private static void method2() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("fr.txt");
            fw = new FileWriter("fw.txt");

            char[] chs = new char[1024];
            int len;
            while ((len = fr.read()) != -1) {
                fw.write(chs, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fw!=null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fr!=null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //抛出处理
    private static void method1() throws IOException {
        FileReader fr = new FileReader("fr.txt");
        FileWriter fw = new FileWriter("fw.txt");

        char[] chs = new char[1024];
        int len;
        while ((len = fr.read()) != -1) {
            fw.write(chs, 0, len);
        }

        fw.close();
        fr.close();
    }
}
