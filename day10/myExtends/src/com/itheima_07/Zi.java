package com.itheima_07;

/*  方法重写概念：子类出现了和父类中一模一样的方法声明（方法名一样，参数列表也必须一样）

    方法重写的应用场景：当子类需要父类的功能，而功能主体子类有自己特有内容时，
                    可以重写父类中的方法，这样，即沿袭了父类的功能，又定义了子类特有的内容

    Override注解：用来检测当前的方法，是否是重写的方法，起到【校验】的作用

    方法重写的注意事项：
    1. 私有方法不能被重写(父类私有成员子类是不能继承的)
    2. 子类方法访问权限不能更低(public > 默认 > 私有)
*/
public class Zi extends Fu {

    /*
    @Override //子类不可以重写父类中的私有方法
    private void show() {
        System.out.println("Zi中show()方法被调用");
    }
    */

    /*
    @Override
    public void method() {
        System.out.println("Zi中method()方法被调用");
    }
    */

    @Override
    public void method() {
        System.out.println("Zi中method()方法被调用");
    }
}
