package com.itheima_01;

/*
    ������
 */
public class CatDemo {

    public static void main(String[] args) {
        //������������󣬲����÷���
        CatOperator co = new CatOperator();
        Cat c = new Cat();
        co.useCat(c);

        Cat c2 = co.getCat(); //new Cat()
        c2.eat();
    }

}
