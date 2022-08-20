package com.jdkannotation;

public class MyAnnotationDemo2 {
    public static void main(String[] args) {
        //调用已废弃的方法
        new Student().show();

        @SuppressWarnings("unused")//声明变量没有使用，压制这类警告。
        int num=10;
    }
}
