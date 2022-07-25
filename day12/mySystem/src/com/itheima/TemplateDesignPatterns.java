package com.itheima;
/*
    需求：求一段代码的运行时间

    模板设计模式：当功能内部一部分实现确定，一部分实现不确定，这时可以把不确定的部分
               暴露出去，让子类实现。
    注意：（1）多个类写在同一个源文件中，只能有一个public类，并且文件名与类名相同
         （2）一个文件可以只有非public类
         （3）如果只有一个非pulic类，文件名可以和类名不同
         总是，一个源文件至多只能有一个public类存在，且源文件名与public类必需相同
 */

 public abstract class TemplateDesignPatterns{
    public final void getTime(){
        long start=System.currentTimeMillis();
        code();
        long end=System.currentTimeMillis();
        System.out.println(end-start);

    }

    public abstract void code() ;
}
 class Zi extends TemplateDesignPatterns{
    @Override
    public void code() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
    }

     public static void main(String[] args) {
         new Zi().getTime();
     }
}