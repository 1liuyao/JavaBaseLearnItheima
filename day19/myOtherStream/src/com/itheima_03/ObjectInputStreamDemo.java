package com.itheima_03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
    （1）对象序列化：就是将对象保存到磁盘中，或者在网络中传输对象。这种机制就是使用一个字节序列表示一个对象，
                  该字节序列包含：【对象的类型】、【对象的数据】和【对象中存储的属性】等信息。
    （2）序列化与反序列化：
            序列化:字节序列写到文件，相当于文件中持久保存了一个对象的信息。
            反序列化：该字节序列还可以从文件中读取回来，重构对象。
    （3）序列化流与反序列化流：
            对象序列化流ObjectOutputStream：将Java对象的原始数据类型和图形写入OutputStream。
            对象反序列化流ObjectInputStream：读取（重构）对象。

     注意：（1）如果流是网络套接字流，则可以在另一个主机上或另一个进程中重构对象。
          （2）能被序列化和反序列化的对象，其所属的类必须实现Serializable接口

    构造方法：
        ObjectInputStream(InputStream in)：创建从指定的InputStream读取的ObjectInputStream

    反序列化对象的方法：
        Object readObject()：从ObjectInputStream读取一个对象
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //ObjectInputStream(InputStream in)：创建从指定的InputStream读取的ObjectInputStream
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myOtherStream\\oos.txt"));

        //Object readObject()：从ObjectInputStream读取一个对象
        Object obj = ois.readObject();

        Student s = (Student) obj;
        System.out.println(s.getName() + "," + s.getAge());

        ois.close();
    }
}
