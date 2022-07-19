package day07.itheima_06;

/*
    学生类

    this关键字：this代表当前调用方法的引用，哪个对象调用的方法，this就代表哪一个对象
    （1）this修饰的变量用于指代成员变量，其主要作用是（区分局部变量和成员变量的重名问题）
    （2）方法的形参如果与成员变量同名，不带this修饰的变量指的是形参，而不是成员变量
    （3）方法的形参没有与成员变量同名，不带this修饰的变量指的是成员变量

    this调用格式：
    （1）调用成员属性：this.成员属性【相当于this引用和对象引用指向了同一块堆内存地址】
    （2）调用成员方法【非构造方法】：this.成员方法
    （3）调用构造方法：this（实际参数）【必须定义在构造函数第一行，否则编译失败】
 */
public class Student {

    private String name;
    private int age;



//    public void setName(String n) {
//        name = n; //由于形参局部变量n和name不重名，所以，name指的是成员变量
//    }

    public void setName(String name) {
//        name = name;//由于形参局部变量name和成员变量重名，如果不加this会认为那么是
                    //函数内的成员变量，函数调用执行完成就在栈内存消失，因此就赋值失败
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setAge(int a) {
//        age = a;
//    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }

    //this调用一般成员方法
    public void show1(){
        this.show();
        //show(); //调用一般成员方法时，this可以省略，本类中函数互相调用其实隐藏了this
    }

    //this调用构造方法
    public Student() {
        System.out.println("1. public Person()");
    }
    public Student(String name, int age)
    {
        // 调用本类中无参构造方法
        this();//必须定义在构造函数第一行
        this.name = name;
        this.age = age;
        System.out.println("2. public Person(String name,int  age)");
    }
}
