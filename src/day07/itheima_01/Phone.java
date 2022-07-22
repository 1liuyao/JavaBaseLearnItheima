package day07.itheima_01;

/*
    类的定义

    类的定义步骤：
        定义类
        编写类的成员变量
        编写类的成员方法

    简单理解：类是对事物的一种描述，对象则为具体存在的事物
            类是对象的抽象，对象是类的实体

    手机类：
        类名：
        手机(Phone)

        成员变量：[类中方法外的变量]
        品牌(brand)
        价格(price)

        成员方法：
        打电话(call)
        发短信(sendMessage)
 */
public class Phone {
    //成员变量
    String brand;
    int price;

    //成员方法
    public void call() {
        System.out.println("打电话");
    }

    public void sendMessage() {
        System.out.println("发短信");
    }
}
