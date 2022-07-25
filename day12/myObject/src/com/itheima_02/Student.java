package com.itheima_02;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        //this -- s1
        //o -- s2
        //比较地址是否相同，相同就是同一个对象，自己跟自己比成员变量值肯定相同
        if (this == o) return true;

        //判断参数是否为null，判断两个对象是否来自同一个类
        if (o == null || getClass() != o.getClass()) return false;

        //向下转型
        Student student = (Student) o; //student -- s2

        //比较年龄是否相同
        if (age != student.age) return false;
        //比较姓名内容是否相同，因为name不为null才能调用String类中的equals方法，比较字符串内容是否相同
        return name != null ? name.equals(student.name) : student.name == null;
    }

}
