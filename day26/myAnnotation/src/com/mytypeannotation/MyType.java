package com.mytypeannotation;

import java.util.ArrayList;

class MyType <@MyTypeAnnotation T>{ //在此位置使用注解，需要在@Target中添加ElementType.TYPE_PARAMETER属性值
    void show(T t){
        System.out.println(t.toString());
    }

    //在以下位置使用注释，需要在@Target中添加ElementType.TYPE_USE
    void show1(){
        ArrayList<@MyTypeAnnotation String> strings = new ArrayList<>();
    }

    void show2(){
        int num=(@MyTypeAnnotation int)10L;
    }

    void show3() throws @MyTypeAnnotation IndexOutOfBoundsException{

    }

}

