package com.mytypeannotation;

import java.util.ArrayList;

class MyType <@MyTypeAnnotation T>{ //�ڴ�λ��ʹ��ע�⣬��Ҫ��@Target�����ElementType.TYPE_PARAMETER����ֵ
    void show(T t){
        System.out.println(t.toString());
    }

    //������λ��ʹ��ע�ͣ���Ҫ��@Target�����ElementType.TYPE_USE
    void show1(){
        ArrayList<@MyTypeAnnotation String> strings = new ArrayList<>();
    }

    void show2(){
        int num=(@MyTypeAnnotation int)10L;
    }

    void show3() throws @MyTypeAnnotation IndexOutOfBoundsException{

    }

}

