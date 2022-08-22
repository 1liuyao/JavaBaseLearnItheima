package com.itheima_07;

@AnnotationTable("db_student")
public class Student {
    @FieldName(columnName = "db_id",type="int",length=10)
    private int id;
    @FieldName(columnName = "db_age",type="int",length=10)
    private int age;
    @FieldName(columnName = "db_name",type="varchar",length=5)
    private String name;

    public Student() {
    }

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Reflect1{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}
