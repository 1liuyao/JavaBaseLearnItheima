package com.itheima_03;

/*
    【引用类方法】：其实就是引用类的【静态方法】
    （1）格式：类名::静态方法
    （2）范例：Integer::parseInt  Integer类的方法：public static int parseInt(String s) 将此String转换为int类型数据
    （3）注意：①Lambda表达式被类方法替代的时候，它的形式参数【全部传递】给静态方法作为参数
             ②接口中的抽象方法的【形参列表和返回值类型】与【方法引用的】形参列表和返回值类型 相同！

    练习：
        1:定义一个接口(Converter)，里面定义一个抽象方法：
            int convert(String s);
        2:定义一个测试类(ConverterDemo)，在测试类中提供两个方法
            一个方法是：useConverter(Converter c)
            一个方法是主方法，在主方法中调用useConverter方法

 */
public class ConverterDemo {
    public static void main(String[] args) {
        //在主方法中调用useConverter方法

//        useConverter((String s) -> {
//            return Integer.parseInt(s);
//        });

        useConverter(s -> Integer.parseInt(s));

        //引用类方法
        useConverter(Integer::parseInt);

        //Lambda表达式被类方法替代的时候，它的形式参数全部传递给静态方法作为参数
    }

    private static void useConverter(Converter c) {
        int number = c.convert("666");
        System.out.println(number);
    }
}
