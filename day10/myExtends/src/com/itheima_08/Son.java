package com.itheima_08;

/*
    Java中继承的注意事项：
    1. Java中类只支持单继承，不支持多继承
        错误范例：class A extends B, C { }
    说明：因为当一个类同时继承两个父类时，两个父类中有相同的功能，
         那么子类对象调用该功能时，运行哪一个呢？
    2. Java中类支持多层继承
       A继承B B继承C C继承D
 */
/*报错
public class Son extends Father, Mother {

}
*/

public class Son extends Father {

}
