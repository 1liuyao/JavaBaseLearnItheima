package com.itheima_01;
/*
    内部类：在类中定义一个类，例如：电脑中含有CPU

    内部类根据在外部类所处的位置不同，分为【成员内部类】【局部内部类】

    关系：（1）子类继承父类：is a，猫是一种动物
         （2）类实现接口：like a，行为的规范，公共的规则
         （3）外部类包含内部类：has a，内部类是外部类的组成部分

    内部类格式：【内部类和外部类不能同名】
        public class 类名A{//外部类A
              修饰符 class 类名B{//内部类B

              }
        }

    内部类访问特点：
        内部类可以直接访问外部类的成员，包括【私有】
        外部类要访问内部类的成员，必须创建对象

    访问权限：
    （1）外部类只能使用public和默认访问权限
    （2）成员位置【内部类、成员属性、成员方法】可以使用四种权限：
        private 默认 protected public

    问题：为什么外部类不能被private修饰？
    回答：整个类被私有，说明属性和方法均无法访问，那么这个类的存在也就无意义了

    问题：为什么外部类不能被protected修饰？
    回答：如果A类用protected修饰，那么【不同包】的类B想要调用A类的功能就必须继承
         A类，然而继承的前提又是类B可以访问到类A，是矛盾的。因此外部类只定义包级别
         的访问，即包内可访问用默认，想要包外可访问用public。
         protected关键字重点描述的是【继承】关系中的访问权限，如果一个方法想要子类
         【无论身处何地】都能访问到，就用protected修饰

    问题：abstract interface final修饰类时如何选择？
    回答：（1）类是否需要被继承：不需要，选final
         （2）类中【所有】方法没法给出具体的描述，是，选interface
         （3）类中【部分】方法没法给出具体的描述，是，选abstract


 */
public class Outer {

    private int num = 10;

    class Inner {

        public void show() {
            System.out.println(num);
        }

    }

    public void method() {
//        show();

        Inner i = new Inner();
        i.show();
    }

}
