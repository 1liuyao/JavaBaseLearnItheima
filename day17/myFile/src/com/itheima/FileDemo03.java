package com.itheima;

import java.io.File;
import java.io.IOException;

/*
    File类删除功能：
        public boolean delete()：删除由此抽象路径名表示的【文件】或【目录】
        注意：（1）在删除文件夹时，必须保证这个文件夹中没有内容【包含目录或者文件】，才可以将文件删除。
             （2）删除不存在的文件或目录返回false

    绝对路径和相对路径的区别：
    （1）绝对路径：完整的路径名，不需要任何其他信息就可以定位它所表示的文件。例如：E:\itcast\java.txt
    （2）相对路径：必须使用取自其他路径名的信息进行解释。例如：myFile\java.txt
 */
public class  FileDemo03 {
    public static void main(String[] args) throws IOException {
//        File f1 = new File("E:\\itcast\\java.txt");
        //需求1：在当前模块目录下创建java.txt文件，需要给出【模块名】，否则文件会创建在和myfile同级的目录下
        File f1 = new File("myFile\\java.txt");
//        System.out.println(f1.createNewFile());

        //需求2：删除当前模块目录下的java.txt文件
        System.out.println(f1.delete());
        System.out.println("--------");

        //需求3：在当前模块目录下创建itcast目录
        File f2 = new File("myFile\\itcast");
//        System.out.println(f2.mkdir());

        //需求4：删除当前模块目录下的itcast目录
        System.out.println(f2.delete());
        System.out.println("--------");

        //需求5：在当前模块下创建一个目录itcast,然后在该目录下创建一个文件java.txt
        File f3 = new File("myFile\\itcast");
//        System.out.println(f3.mkdir());
        File f4 = new File("myFile\\itcast\\java.txt");//创建文件前要先创建目录
//        System.out.println(f4.createNewFile());

        //需求6：删除当前模块下的目录itcast
        System.out.println(f4.delete());//删除目录前要先删除目录下的文件
        System.out.println(f3.delete());
    }
}
