package com.itheima_03;

/*
    测试类
 */
public class GenericDemo {
    public static void main(String[] args) {
//        Generic g = new Generic();
//        g.show("林青霞");
//        g.show(30);
//        g.show(true);
////        g.show(12.34);
         //泛型类改进
//        Generic<String> g1 = new Generic<String>();
//        g1.show("林青霞");
//
//        Generic<Integer> g2 = new Generic<Integer>();
//        g2.show(30);
//
//        Generic<Boolean> g3 = new Generic<Boolean>();
//        g3.show(true);

        //为了简化上述调用代码，将泛型方法，调用该方法时，允许传入任意【引用】类型
        Generic g = new Generic();
        g.show("林青霞");
        g.show(30);
        g.show(true);
        g.show(12.34);
        g.show1("123","456");
    }
}
