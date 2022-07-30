package com.itheima_05;

import java.util.TreeSet;

/*
    存储学生对象并遍历，创建集合使用无参构造方法
    要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序

    实现步骤：
    （1）用TreeSet集合存储自定义对象，无参构造方法使用的是自然排序对元素进行排序
    （2）自然排序就是一个类出生了就具有排序特性，那么就让元素所属类实现Comparable接口，重写compareTo()方法
    （3）重写方法时，一定要注意排序规则必须按照要求的主要条件和次要条件来写。

    public int compareTo(T o)
    （1）return 0：代表所有元素都相等，则只会存入第一个元素
    （2）return 1：存入顺序与取出顺序相同
    （3）return -1：存入顺序与取出顺序相反

 */
public class TreeSetDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> ts = new TreeSet<Student>();

        //创建学生对象
        Student s1 = new Student("xishi", 29);
        Student s2 = new Student("wangzhaojun", 28);
        Student s3 = new Student("diaochan", 30);
        Student s4 = new Student("yangyuhuan", 33);

        Student s5 = new Student("linqingxia",33);
        Student s6 = new Student("linqingxia",33);

        //把学生添加到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        //遍历集合
        for (Student s : ts) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
