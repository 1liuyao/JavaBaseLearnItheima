package day07.itheima_07;

/*
    学生类

    构造方法：
        作用：创建对象
        功能：完成对象数据的初始化

    格式：
        修饰符 类名(参数) {

        }

        修饰符一般用：public

    (1)构造方法的创建:如果没有定义构造方法，系统将给出一个默认的无参数构造方法
                   如果定义了构造方法，系统将不再提供默认的构造方法
    (2)构造方法的重载:如果自定义了带参构造方法，还要使用无参数构造方法，
                   就必须再写一个无参数构造方法
    (3)推荐的使用方式:无论是否使用，都手工书写无参数构造方法
    (4)重要功能！可以使用带参构造，为成员变量进行初始化
 */
public class Student {
    private String name;
    private int age;

    //构造方法
    public Student() {
        System.out.println("无参构造方法");
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
