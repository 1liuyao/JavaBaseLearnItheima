package day07.itheima_05;

/*
    ѧ����
 */
public class Student {
    //��Ա����
    private String name;
    private int age;

    //get/set����
    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
