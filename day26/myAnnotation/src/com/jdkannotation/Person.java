package com.jdkannotation;

public class Person implements Infl{
    private String name;
    private String age;

    public Person() {
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public void show(){
        System.out.println("Person show");
    }

    @Override
    public void show1() {
        System.out.println("实现接口，重写方法，使用@Override注释验证重写格式正确性");
    }
}
