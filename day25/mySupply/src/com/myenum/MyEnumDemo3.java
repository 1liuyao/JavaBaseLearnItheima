package com.myenum;

/*
    【Enum类中的主要方法】
    （1）static <T extends Enum<T>>T valueOf(Class<T> enumType, String name)：
        可以把一个字符串转为对应的枚举类对象。要求字符串必须是枚举类对象的名字。如果不是，会有
        运行时异常IllegalArgumentException。
    （2）values()：返回枚举类型的对象数组，该方法可以很方便的遍历所有的枚举值
    （3）String toString():返回当前枚举对象常量的名称
 */
public class MyEnumDemo3 {
    public static void main(String[] args) {
        Season1 summer = Season1.valueOf("SUMMER");
        System.out.println(summer);

        System.out.println("==============");
        Season1[] values = Season1.values();
        for (Season1 sea:values) {
            System.out.println(sea);
        }

        System.out.println("==============");
        System.out.println(Season1.SPRING.toString());
    }
}
