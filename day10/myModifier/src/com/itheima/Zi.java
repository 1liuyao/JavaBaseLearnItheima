package com.itheima;

import cn.itcast.Fu;

/*
    在【不同包】下的子类，只能访问【protected】【public】
 */
public class Zi extends Fu {

    public static void main(String[] args) {
        //创建Zi的对象，测试看有哪些方法可以使用
        Zi z = new Zi();
        System.out.println(z.a);
        z.show3();
        z.show4();
    }

}
