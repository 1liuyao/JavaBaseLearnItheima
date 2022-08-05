package com.itheima_04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
    Properties和IO流结合的方法：【借助流实现集合的读取和写入，相当于封装了map集合写入文件，和从文件中读取map集合的功能】
        void load(Reader reader)：
            从输入字符流读取属性列表（键和元素对）

        void store(Writer writer, String comments)：
            将此属性列表（键和元素对）写入此 Properties表中，以适合使用 load(Reader)方法的格式写入输出字符流

        load(InputStream inStream):
        从输入字节流读取属性列表（键和元素对）

        store(OutputStream out, String comments):
        将此 Properties表中的此属性列表（键和元素对）以适合于使用 load(InputStream)方法加载到 Properties表格的格式写入输出流

        void list(PrintStream out) 将此属性列表打印到指定的输出流。
        void list(PrintWriter out) 将此属性列表打印到指定的输出流。
 */
public class PropertiesDemo03 {
    public static void main(String[] args) throws IOException {
        //把集合中的数据保存到文件
//        myStore();

        //把文件中的数据加载到集合
        myLoad();

    }

    private static void myLoad() throws IOException {
        Properties prop = new Properties();

        //void load(Reader reader)：
        FileReader fr = new FileReader("myOtherStream\\fw.txt");
        prop.load(fr);
        fr.close();

        System.out.println(prop);
    }

    private static void myStore() throws IOException {
        Properties prop = new Properties();

        prop.setProperty("itheima001","林青霞");
        prop.setProperty("itheima002","张曼玉");
        prop.setProperty("itheima003","王祖贤");

        //void store(Writer writer, String comments)：
        FileWriter fw = new FileWriter("myOtherStream\\fw.txt");
        prop.store(fw,null);
        fw.close();
    }
}
