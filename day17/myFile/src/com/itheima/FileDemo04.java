package com.itheima;

import java.io.File;

/*
    File类的判断和获取功能：
        public boolean isDirectory()：测试此抽象路径名表示的File是否为目录
        public boolean isFile()：测试此抽象路径名表示的File是否为文件
        public boolean exists()：测试此抽象路径名表示的File是否存在

        public String getAbsolutePath()：返回此抽象路径名的绝对路径名字符串
        public String getPath()：将此抽象路径名转换为路径名字符串
        public String getName()：返回由此抽象路径名表示的文件或目录的名称

        public String[] list()：返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
        public File[] listFiles()：返回此抽象路径名表示的目录中的文件和目录的File对象数组
        注意：如果只想要遍历某一抽象路径下的目录或者文件，那么使用list()方法更好
             如果遍历完文件后，还想要对文件进行操作，使用File类方法，那么使用listFiles()更优
 */
public class FileDemo04 {
    public static void main(String[] args) {
        //创建一个File对象
        File f = new File("myFile\\java.txt");

//        public boolean isDirectory()：测试此抽象路径名表示的File是否为目录
//        public boolean isFile()：测试此抽象路径名表示的File是否为文件
//        public boolean exists()：测试此抽象路径名表示的File是否存在
        //当File f所指向的文件不存在时，都返回false
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.exists());

//        public String getAbsolutePath()：返回此抽象路径名的绝对路径名字符串
//        public String getPath()：将此抽象路径名转换为路径名字符串
//        public String getName()：返回由此抽象路径名表示的文件或目录的名称
        System.out.println(f.getAbsolutePath());//全路径：带盘符的那种
        System.out.println(f.getPath());//上一级目录\文件名
        System.out.println(f.getName());//文件名
        System.out.println("--------");

//        public String[] list()：返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
//        public File[] listFiles()：返回此抽象路径名表示的目录中的文件和目录的File对象数组
        File f2 = new File("E:\\itcast");

        String[] strArray = f2.list();//输出比itcast低一级的目录和文件名
        for(String str : strArray) {
            System.out.println(str);
        }
        System.out.println("--------");

        File[] fileArray = f2.listFiles();
        for(File file : fileArray) {
//            System.out.println(file);//输出比itcast低一级的目录和文件名【全路径名】
//            System.out.println(file.getName());
            if(file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }
}
