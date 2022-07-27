package com.itheima_04;

import java.util.Scanner;

/*
    自定义异常：因为项目中会出现特有的问题，而这些问题并未被java所描述并封装对象
    所以对于这些特有的问题可以按照java对问题进行封装的思想，将特有问题进行自定义的异常封装

    当函数内部出现了throw抛出的异常对象，那么就必须要给对应的处理动作：
    （1）要么在内部try catch
    （2）要么在函数上声明，让调用者处理

    问题：自定义异常为什么要继承Exception
    回答：异常体系有一个特点：因为异常类和异常对象都被抛出。他们都具备可抛性，这个可抛性是Throwable这个体系中独有特点。
         只有这个体系中的类和对象才可以throws和throw操作。

    问题：自定义异常什么时候要继承RuntimeException异常
    回答：如果该异常的发生，无法在继续进行运算，就让自定义异常继承RuntimeException

    throw和throws的区别：
    （1）位置区别：throw声明在函数内部，throws声明在函数上
    （2）抛出的东西不同：throw new ParseException() |  throws ParseException
    （3）被调用的函数在内部throw异常对象时，代表函数内执行到此一定产生了问题
        调用函数时发现被调用函数声明上throws了异常，本函数也采用了throws抛出异常，并不代表本函数执行一定会出现问题，而是可能出现问题

    throw和throws使用注意事项：
    （1）如果函数内部throw 编译时异常对象【Exception的子类】，则在函数声明上必须throw异常类名
    （2）如果函数内部throw 运行时异常对象【RuntimeException的子类】，则函数声明上无需throw，同时调用该函数时可以既不try也不throws
        之所以不在函数上throws声明，是因为不想让调用者处理，当异常发生时，程序在运行时出现了无法继续运算的情况，希望停止程序后，对代码进行修正。

 */
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数：");

        int score = sc.nextInt();

        Teacher t = new Teacher();
        try {
            t.checkScore(score);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}
