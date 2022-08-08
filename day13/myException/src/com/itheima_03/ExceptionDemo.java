package com.itheima_03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    问题：什么时候选择使用throws
    回答：（1）当有些问题我们没有权限处理
         （2）当有些问题不该我们处理
         （2）当有些问题我们想要调用我们的人去处理

    throws 异常类名;
    这个格式是跟在方法的括号后面的

    针对多异常的处理：
    注意：（1）throws后面跟的异常类名越具体越好
         （2）throws后面可以跟多个异常类名
         （3）try后可以跟多个catch，被调用的函数抛出了几个异常，就应该由几个catch与之匹配，不要定义多余的catch块
         （4）如果多个catch块中的异常存在继承关系，父类异常catch块放在最下面，所以catch（Exception e）应该放在最下面。
         （5）建议在进行catch处理时，catch中一定要定义具体的处理方式，不要简单定义一句a.printStackTrace(),也不要简单的就书写一条输出语句
             可以记录到日志文件中。

    继承体系中抛出异常的规则：
    在java中重写了某方法后，该方法可以抛出的异常有:
    （1）不抛出任何异常
    （2）仅抛出父类方法的的部分异常
    （3）抛出父类方法抛出异常的子类型异常
    （4）可以抛出与父类方法完全相同的异常
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("开始");
//        method();
        //method()2; //此处飘红，调用者需要处理被调用者抛出的异常
        try {
            method2();
        }catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("结束");
    }

    //编译时异常，在功能定义时抛出异常，没有处理，那么将来谁调用他，谁就得处理，强制调用者处理
    public static void method2() throws ParseException {
        String s = "2048-08-09";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(s);
        System.out.println(d);
    }

    //运行时异常，以下采用了和编译时异常同样的显示处理，但是并没有解决问题，
    // 而是抛，那么抛给谁去处理了呢？JVM，所以程序没有执行完，没有输出结束
    //如果还想要程序继续往下执行，只能try
    public static void method() throws ArrayIndexOutOfBoundsException {
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);
    }

}
