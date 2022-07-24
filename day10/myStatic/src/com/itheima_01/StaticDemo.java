package com.itheima_01;

/*
    测试类

    static的概念：static关键字是静态的意思，可以修饰【成员方法】，【成员变量】

    static修饰的特点：
    1. 被类的所有对象共享，这也是我们判断是否使用静态关键字的条件
    2. 可以通过类名调用当然，也可以通过对象名调用【推荐使用类名调用】

    static的访问特点：静态成员方法只能访问静态成员，
                    非静态成员方法可以访问静态或者非静态，不受限制

    问题：为什么静态成员方法只能访问静态成员变量和方法
    答：因为静态随着类的加载而加载，，而且优先于对象存在，没有办法在对象未存在时访问对象中的成员

    问题：静态方法中能否使用this和super关键字
    答：不能，因为this代表对象，静态方法存在时，可能不存在对象，无法使用

    问题：成员变量是否需要被static修饰呢？
    答：该成员变量的数据是否是所有对象都一样，如果是，就应该被修饰；
       如果是对象的特有数据，就应该存储到对象中，不用静态修饰

    问题：成员函数是否需要被static修饰呢？
    答：该函数是否访问了对象中的特有数据，是，方法就不能被static修饰
       没有访问对象中的特有数据，就需要被静态修饰


 */
public class StaticDemo {
    public static void main(String[] args) {

        Student.university = "传智大学";

        Student s1 = new Student();
        s1.name = "林青霞";
        s1.age = 30;
//        s1.university = "传智大学";
        s1.show();

        Student s2 = new Student();
        s2.name = "风清扬";
        s2.age = 33;
//        s2.university = "传智大学";//两个学生来源于同一个学校，university应该被共享
        s2.show();
    }
}
