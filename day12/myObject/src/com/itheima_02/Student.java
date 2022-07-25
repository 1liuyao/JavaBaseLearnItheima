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
        //�Ƚϵ�ַ�Ƿ���ͬ����ͬ����ͬһ�������Լ����Լ��ȳ�Ա����ֵ�϶���ͬ
        if (this == o) return true;

        //�жϲ����Ƿ�Ϊnull���ж����������Ƿ�����ͬһ����
        if (o == null || getClass() != o.getClass()) return false;

        //����ת��
        Student student = (Student) o; //student -- s2

        //�Ƚ������Ƿ���ͬ
        if (age != student.age) return false;
        //�Ƚ����������Ƿ���ͬ����Ϊname��Ϊnull���ܵ���String���е�equals�������Ƚ��ַ��������Ƿ���ͬ
        return name != null ? name.equals(student.name) : student.name == null;
    }

}
