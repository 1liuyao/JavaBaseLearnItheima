package cn.itcast;

/*
    【同一个包下】的非子类，即无关类不能访问private权限修饰的成员，
    可以访问【默认】【protected】【public】
 */
public class Demo {

    public static void main(String[] args) {
        //创建Fu的对象，测试看有哪些方法可以使用
        Fu f = new Fu();
        f.show2();
        f.show3();
        f.show4();
    }

}
