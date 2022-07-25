package com.itheima_01;

/*
    Object 是类层次结构的根，每个类都可以将 Object 作为超类。所有类都直接或者间接的继承自该类

    看方法源码：先选中方法，再按下Ctrl+B

    建议所有子类重写此方法：toString()

    怎么重写呢？自动生成即可，ALT+Insert生成toString方法

    问题；面向对象中，为什么说子类的构造方法默认访问的是父类的【无参】构造方法呢？
    回答：因为它们的顶级父类Object，只有【无参】构造方法。
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("林青霞");
        s.setAge(30);
        System.out.println(s); //com.itheima_01.Student@3f3afe78
        System.out.println(s.toString()); //com.itheima_01.Student@3f3afe78

        /*//以下为println源码调用过程，最终调用的是Object类的toString()方法
        public void println(Object x) { //x = s;
            String s = String.valueOf(x);
            synchronized (this) {
                print(s);
                newLine();
            }
        }

        public static String valueOf(Object obj) { //obj = x;
            return (obj == null) ? "null" : obj.toString();
        }

        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
         */

    }
}
