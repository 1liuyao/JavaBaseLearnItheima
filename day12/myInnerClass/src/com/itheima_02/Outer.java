package com.itheima_02;

public class Outer {

    private int num = 10;//外部类成员位置

    /*
    public class Inner {
        public void show() {
            System.out.println(num);//num前省略了Outer.this
        }
    }
    */

    private class Inner {
        int num=20;//成员内部类成员位置
        public void show() {
            int num=30;//成员内部类的局部位置
            System.out.println(num);//就近原则，局部有访问局部
            System.out.println(this.num);//this代表本类，inner().bnum
            System.out.println(Outer.this.num);//外部类的this引用，指向外部类成员属性
        }
    }

    public void method() {
        Inner i = new Inner();
        i.show();
    }

}
