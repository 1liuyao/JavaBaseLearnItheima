package day07.itheima_06;
/*
    学生测试类
 */
public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();
        Student s1=new Student("刘瑶",25);

        //使用set方法给成员变量赋值
        s.setName("林青霞");
        s.setAge(30);

        //调用show方法
        s.show();
        s.show1();
    }
}
