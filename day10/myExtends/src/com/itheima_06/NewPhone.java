package com.itheima_06;

/*
    新手机
 */
public class NewPhone extends Phone {

    /*
    public void call(String name) {
        System.out.println("开启视频功能");
//        System.out.println("给" + name + "打电话");
        super.call(name);
    }
    */

    @Override //帮助检测方法重写的格式是否正确
    public void call(String name) {
        System.out.println("开启视频功能");
//        System.out.println("给" + name + "打电话");
        super.call(name);
    }

}
