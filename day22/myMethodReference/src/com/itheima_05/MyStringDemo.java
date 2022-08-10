package com.itheima_05;

/*
    【引用类的实例方法】：其实就是引用类中的成员方法
    格式：类名::成员方法
    范例：String::substring
         public String substring(int beginIndex,int endIndex)
         从beginIndex开始到endIndex结束，截取字符串。返回一个子串，子串的长度为endIndex-beginIndex
    注意：Lambda表达式被类的实例方法替代的时候，第一个参数作为调用者，后面的参数全部传递给该方法作为参数

    问：为什么类的实例方法引用第一个参数为调用者？
    回答：因为类的实例方法没有办法像类的静态方法一样被类名调用，针对具体类我们可以通过类对象调用【这就和引用对象的实例方法一样了】，
         针对抽象类我们需要使用多态形式，用父类的引用调用抽象类中的非抽象方法。
         因此若想引用类中的实例方法，就需要在接口抽象方法中第一个参数传入类对象的引用，否则没有办法调用方法了

    练习
        1:定义一个接口(MyString)，里面定义一个抽象方法：
            String mySubString(String s,int x,int y);
        2:定义一个测试类(MyStringDemo)，在测试类中提供两个方法
            一个方法是：useMyString(MyString my)
            一个方法是主方法，在主方法中调用useMyString方法
 */
public class MyStringDemo {
    public static void main(String[] args) {
        //在主方法中调用useMyString方法

//        useMyString((String s,int x,int y) -> {
//            return s.substring(x,y);
//        });

        useMyString((s,x,y) -> s.substring(x,y));

        //引用类的实例方法
        useMyString(String::substring);

        //Lambda表达式被类的实例方法替代的时候
        //第一个参数作为调用者
        //后面的参数全部传递给该方法作为参数
    }

    private static void useMyString(MyString my) {
        String s = my.mySubString("HelloWorld", 2, 5);
        System.out.println(s);
    }
}
