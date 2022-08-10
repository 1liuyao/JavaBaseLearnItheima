package com.itheima_02;

/*
    函数式编程：强调做什么，而不是以什么形式去做

    Lambda表达式的格式：(形式参数) -> {代码块}
    （1）形式参数：如果有多个参数，参数之间用逗号隔开；如果没有参数，留空即可
    （2）->：由英文中画线和大于符号组成，固定写法。代表指向动作
    （3）代码块：是我们具体要做的事情，也就是以前我们写的方法体内容

    Lambda表达式的使用前提：
    （1）有一个接口
    （2）接口中有且仅有一个抽象方法

    练习1：接口中抽象方法【无参无返回值】
        1:定义一个接口(Eatable)，里面定义一个抽象方法：void eat();
        2:定义一个测试类(EatableDemo)，在测试类中提供两个方法
            一个方法是：useEatable(Eatable e)
            一个方法是主方法，在主方法中调用useEatable方法
 */
public class EatableDemo {
    public static void main(String[] args) {
        //在主方法中调用useEatable方法
        Eatable e = new EatableImpl();
        useEatable(e);

        //匿名内部类
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("一天一苹果，医生远离我");
            }
        });

        //Lambda表达式
        useEatable(() -> {
            System.out.println("一天一苹果，医生远离我");
        });
    }

    private static void useEatable(Eatable e) {
        e.eat();
    }
}
