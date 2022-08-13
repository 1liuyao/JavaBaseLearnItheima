package com.itheima_06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
    练习2：通过配置文件运行类中的方法
    需求描述：针对频繁需要修改或者以后需要修改的数据，我们不希望在代码中写死，而是写在配置中，
            以后只需要通过修改配置文件，不用修改代码上线。
            例如：下面代码今天需要Student对象，明天需要Teacher对象，后天又需要Student对象。
                 说明产生对象这个操作需要频繁变更，那么就像文件名和需要调用的方法写在配置文件中，以后通过读取配置文件生成对象
 */
public class ReflectTest02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Student s = new Student();
//        s.study();

//        Teacher t = new Teacher();
//        t.teach();

        /*
            class.txt
            className=xxx
            methodName=xxx
         */

        //加载数据
        Properties prop = new Properties();
        FileReader fr = new FileReader("myReflect\\class.txt");
        prop.load(fr);
        fr.close();

        /*
            className=com.itheima_06.Student
            methodName=study
         */
        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        //通过反射来使用
        Class<?> c = Class.forName(className);//com.itheima_06.Student

        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        Method m = c.getMethod(methodName);//study
        m.invoke(obj);
    }
}
