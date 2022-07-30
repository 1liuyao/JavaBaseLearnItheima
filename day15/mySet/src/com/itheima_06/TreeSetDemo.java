package com.itheima_06;

import java.util.Comparator;
import java.util.TreeSet;

/*
    存储学生对象并遍历，创建TreeSet集合使用【带参】构造方法：TreeSet(Comparator<? super E> comparator)
    要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序

    实现步骤：
    （1）用TreeSet集合存储自定义对象，带参构造方法使用的是比较器排序对元素进行排序的
    （2）比较器排序，就是让集合构造方法接收Comparator的实现类对象，重写compare(T o1,T o2)方法
    （3）重写方法时，一定要注意排序规则必须按照要求的主要条件和次要条件来写
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //this.age - s.age
                //s1,s2
                //注意此处写法，传入的是【两个】需要比较的对象，不需要this
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });

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
