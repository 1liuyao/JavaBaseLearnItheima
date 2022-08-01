package com.itheima;

import java.io.File;
import java.io.IOException;

/*
    File类创建功能：
        public boolean createNewFile()：当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
            （1）如果文件不存在，就创建文件，并返回true
            （2）如果文件或者【与文件同名的目录】存在，就不创建文件，并返回false
            （3）创建文件前，要保证目录已创建好

        public boolean mkdir()：创建由此抽象路径名命名的目录
            （1）如果目录不存在，就创建目录，并返回true
            （2）如果目录存在，就不创建目录，并返回false

        public boolean mkdirs()：创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录
            自己补齐
 */
public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        //需求1：我要在E:\\itcast目录下创建一个文件java.txt
        File f1 = new File("E:\\itcast\\java.txt");
        System.out.println(f1.createNewFile());
        System.out.println("--------");

        //需求2：我要在E:\\itcast目录下创建一个目录JavaSE
        File f2 = new File("E:\\itcast\\JavaSE");
        System.out.println(f2.mkdir());
        System.out.println("--------");

        //需求3：我要在E:\\itcast目录下创建一个多级目录JavaWEB\\HTML
        File f3 = new File("E:\\itcast\\JavaWEB\\HTML");
//        System.out.println(f3.mkdir());//由于JavaWEB和HTML均不存在，此方法没有办法生成多级目录
        System.out.println(f3.mkdirs());
        System.out.println("--------");

        //需求4：我要在E:\\itcast目录下创建一个文件javase.txt
        File f4 = new File("E:\\itcast\\javase.txt");
//        System.out.println(f4.mkdir());//此方法返回true，生成了一个多级目录，最后一级文件夹名为javase.txt，没有生成具体文件
        System.out.println(f4.createNewFile());
    }
}
