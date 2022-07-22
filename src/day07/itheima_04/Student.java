package day07.itheima_04;

/*
    学生类

    成员变量和局部变量的区别【理解】：
    （1）类中位置不同：成员变量（类中方法外）局部变量（方法内部或方法声明上）
    （2）内存中位置不同：成员变量（堆内存）局部变量（栈内存）
    （3）生命周期不同：成员变量（随着对象的存在而存在，随着对象的消失而消失）
        局部变量（随着方法的调用而存在，随着方法的调用完毕而消失）
    （4）初始化值不同：成员变量（有默认初始化值）
                    局部变量（没有默认初始化值，必须先定义，赋值才能使用）

     private关键字：
     被private修饰的成员，只能在本类进行访问，针对private修饰的成员变量，如果需要
     被其他类使用，提供相应的操作：
    （1）提供“get变量名()”方法，用于获取成员变量的值，方法用public修饰
    （2）提供“set变量名(参数)”方法，用于设置成员变量的值，方法用public修饰
 */
public class Student {
    //成员变量
    String name;
    //    int age;
    private int age;//如果不使用private修饰，调用者可以传入任意年龄

    //提供get/set方法
    public void setAge(int a) {
//        age = a;

        if (a < 0 || a > 120) {
            System.out.println("你给的年龄有误");
        } else {
            age = a;
        }
    }

    public int getAge() {
        return age;
    }

    //成员方法
    public void show() {
        System.out.println(name + "," + age);
    }
}
