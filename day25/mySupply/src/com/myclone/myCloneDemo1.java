package com.myclone;

/*
    对象拷贝：也叫对象复制，把A对象的属性值完全拷贝给B对象

    克隆方式一：【浅拷贝】
        （1）不管对象内部的属性是基本数据类型还是引用数据类型，都完全拷贝过来
        （2）由于被克隆的对象和克隆的对象持有相同的引用数据类型的地址值，则一个对象更改引用类型属性值后，另一个对象的属性值也会发生改变。
        （3）Object类中的clone()方法采用浅拷贝方式

    克隆方式二：【深拷贝】
        （1）成员属性为基本数据类型：直接把值拷贝过来
        （2）成员属性是字符串：直接把地址值拷贝过来，虽然字符串属于引用数据类型，但是字符串在常量池中是唯一的。
        （3）成员属性是引用数据类型：克隆后的对象会重新在堆内存中创建新的内存地址存储引用类型数据。因此克隆对象与被克隆对象的成员属性互相独立。
 */
public class myCloneDemo1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //protected Object clone()
        //1、先创建一个对象
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0};
        User u1 = new User(1, "zhangsan", "1234qwer", "girl11", data);

        //2、克隆对象
        //细节：
        //方法在底层会帮我们创建一个对象，并把原对象中的数据拷贝过去
        //书写细节：
        //1、重写Object类中的clone方法
        //2、让javabean类实现Cloneable接口
        //3、创建原对象并调用clone就可以了
        User u2 = (User) u1.clone();

        //验证一件事情：Object中的克隆是浅克隆
        int[] arr=u1.getData();
        arr[0]=100;

        System.out.println(u1);
        System.out.println(u2);
    }
}
