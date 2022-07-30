package com.itheima_05;

public class Student implements Comparable<Student> {//实现Comparable接口，重写compareTo
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
    public int compareTo(Student s) {//方法中this指向add中的实参
//        return 0;//代表所有元素相等，只会输出第一个元素
//        return 1;//传入的实参更小
//        return -1;//传入的实参更大
        //按照年龄从小到大排序【主要比较条件】
       int num = this.age - s.age;//升序
//        int num = s.age - this.age;//降序
        //年龄相同时，按照姓名的字母顺序排序【次要比较条件】
       int num2 = num==0?this.name.compareTo(s.name):num;
        System.out.println(this.name+"---compare to---"+s.name);
        return num2;
    }
}
