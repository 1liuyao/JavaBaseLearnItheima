package com.itheima;

import cn.itcast.Fu;

/*
    在【不同包】下的【无关类】，只能访问【public】
 */
public class Demo {

    public static void main(String[] args) {
        //创建Fu的对象，测试看有哪些方法可以使用
        Fu f = new Fu();
        f.show4();
    }

}
