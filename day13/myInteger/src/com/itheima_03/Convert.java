package com.itheima_03;

public class Convert {
    /*
        总结基本数据类型包装类、基本数据类型、字符串之间的转换

        1、包装类转换成基本数据类型
       （1）包装类Byte Short Integer Long Float Double继承父类【抽象类Number】
           抽象了将以上任意包装类转化成基本数据类型的方法，在子类中给出了具体实现。
           方法命名如下：基本数据类型Value()，例如：int intValue()
       （2）包装类Character直接继承Object，具备方法：char charValue()
       （3）包装类Boolean直接继承Object，具备方法：boolean booleanValue()
       因此，将包装类转化成基本数据类型采用：包装类对象.【基本数据类型Value()】

       2.基本数据类型转化成包装类
       （1）包装类Byte Short Integer Long Float Double采用：
            static Integer valueOf(int i)将基本数据类型转化成包装类
           例如：Integer.valueOf(int i)，即【包装类类名.valueOf(基本数据类型)】
       （2）包装类Character使用：static Character valueOf(char c)将char转Character
       （3）包装类Boolean使用：static Boolean valueOf(boolean b)将boolean装Boolean
       因此，将基本数据类型转化成包装类采用：包装类名.valueOf(基本数据类型)

       3、基本数据类型转成String
       （1）方式一：String.valueOf(基本数据类型)
       （2）方式二：包装类.toString()【实际上方式一只是封装了方式二】

       4、String转成基本数据类型
       （1）byte short int long float double采用：包装类.parse包装类名（字符串）
        例如：Short.parseShort(String)将字符串转化成short类型
       （2）char：new String().charAt(int index) 返回指定位置字符
       （3）另外一种方式：基本数据类型+空串，例如:s=10+"";
       （4）char[]转成String：直接使用String构造方法String(char[] value)
       （5）String转成char[]：new String().toCharArray()
                            String.valueOf()
       （6）byte[]转成String：直接使用String构造方法String(byte[] bytes)
       （7）String转成byte[]：new String().getBytes();

       5、包装类转成String：包装类对象.toString()
       6、String转成包装类
       （1）方式一：先转成基本数据类型再转成包装类【Character只能采用此方式】
       （2）除了Character包装类外，可采用另外一种方式：包装类类名.valueOf(String)
           例如：Integer.valueOf(String s)

        注：char Character String之间的转化需要特别注意
           由于String基本是多个字符的情况，所以由String转成Character或者char时，
           就需要单独的方法。但是由char，Character转成String，由小到多就可以遵循一般方法


     */
    public static void main(String[] args) {
        char a='a';
        byte b=1;
        String s="100";
        Double d=1.0;
        Boolean ff=true;
        Character uu='b';
        System.out.println(Byte.toString(b));
        System.out.println(Character.toString(a));
        System.out.println(String.valueOf(a));
        System.out.println(String.valueOf(b));
        System.out.println(Integer.parseInt(s));
        System.out.println(d.toString());
        System.out.println(ff.toString());
        System.out.println(uu.toString());

    }
}
