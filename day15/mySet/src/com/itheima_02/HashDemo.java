package com.itheima_02;

/*
    哈希值：
        是JDK根据【对象的地址】或者【字符串】或者【数字】算出来的int类型的数值

    如何获取哈希值：Object类中有一个方法可以获取对象的哈希值：public int hashCode()：返回对象的哈希码值

    哈希值的特点：
    （1）同一个对象多次调用hashCode()方法返回的哈希值是相同的
    （2）默认情况下，不同对象的哈希值是不同的。而重写hashCode()方法，可以实现让不同对象的哈希值相同

 */
public class HashDemo {
    public static void main(String[] args) {
        //创建学生对象
        Student s1 = new Student("林青霞",30);

        //同一个对象多次调用hashCode()方法返回的哈希值是相同的
        System.out.println(s1.hashCode()); //1060830840
        System.out.println(s1.hashCode()); //1060830840
        System.out.println("--------");

        Student s2 = new Student("林青霞",30);

        //默认情况下使用Object类的hashCode()方法计算哈希值，不同对象的哈希值是不相同的
        //通过方法重写，可以实现不同对象的哈希值是相同的
        System.out.println(s2.hashCode()); //2137211482
        System.out.println("--------");

        //字符串内容相同时，哈希值相同，当然也存在字符串内容不同，但是哈希值相同的情况。
        //因此String类重写了hashCode()方法
        System.out.println("hello".hashCode()); //99162322
        System.out.println("world".hashCode()); //113318802
        System.out.println("java".hashCode()); //3254818

        System.out.println("world".hashCode()); //113318802
        System.out.println("--------");

    }
}
