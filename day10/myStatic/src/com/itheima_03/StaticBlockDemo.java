package com.itheima_03;
/*
    1、静态代码块：
        （1）随着类的加载而加载，无论静态代码块写在类中的什么位置，都是先执行类的初始化，再创建对象
        （2）当创建类的多个对象时，只会加载一次

    2、构造代码块：
        （1）先于构造函数执行
        （2）每new一次对象就会执行一次

    3、静态变量
        （1）随着类的加载而加载
        （2）类的初始化阶段会完成赋值
 */
public class StaticBlockDemo {
    public static void main(String[] args) {
        //创建子类多个对象，静态代码块只加载一次
//        Student student = new Student();
//        Student student1 = new Student();
/*        父类静态代码块
                子类静态代码块
        父类构造代码块
                父类构造函数
        子类构造代码块
                子类构造函数
        父类构造代码块
                父类构造函数
        子类构造代码块
                子类构造函数
*/
        //直接访问类静态变量，访问哪个静态成员属性，哪个类被初始化
        //System.out.println(Student.mi);
        /*  以上代码等价于：①访问子类Student静态变量，需要先初始化父类，然后初始化子类
                         ②按照代码书写顺序，执行以下语句：public static int mi=50;
                                                    static {
                                                            mi=150;
                                                            System.out.println("子类静态代码块"+mi);
                                                     }
            父类静态代码块
            子类静态代码块150
            150
         */

        //子类引用访问父类静态成员，不会初始化子类，只会初始化父类
        //System.out.println(Student.m);
        /*  以上代码等价于：①由于需要访问父类成员，所以需加载父类
                         ②然后按照代码书写顺序执行静态变量的赋值操作：static { m=200;}
                                                               public static int m=100;
            父类静态代码块
            100
         */

        //访问类静态常量，不会发生类的初始化
        System.out.println(Student.me);
        System.out.println(Student.mm);
        /*
            10
            20
         */

        //声明类引用数组，不会发生类的初始化
        Student[] students=new Student[10];
        Person[] people=new Person[20];
    }
}
