package cn.itcast;
/*
    【同一个包下】的子类，不能访问private权限修饰的成员，
    可以访问【默认】【protected】【public】
 */
public class Zi extends Fu {

    public static void main(String[] args) {
        //创建Zi的对象，测试看有哪些方法可以使用
        Zi z = new Zi();
        System.out.println(z.a);
        z.show2();
        z.show3();
        z.show4();
    }

}
