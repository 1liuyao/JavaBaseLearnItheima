package com.defineannotation;

public class AnnotationTest {
    //@MyAnnotationDemo3("HELLO"//ע����ֻ��valueһ����Ա����ôvalue����ʡ��

    //�ظ�ע�⣬������ͬһ��λ��ʹ��ͬһ��ע������ʱ������д������
//    @MyAnnotationDemo3(value = "helllo")
//    @MyAnnotationDemo3(value = "World")

    //jdk1.8֮ǰ������ʹ���ظ�ע�⣬������ע���е�����Ϊ����MyAnnotationDemo3[] value();
    //@MyRepeatDemo({@MyAnnotationDemo3("Hello"),@MyAnnotationDemo3("World")})

    //jdk8֮��,ʹ��@Repeatable
    @MyAnnotationDemo3("Hello")
    @MyAnnotationDemo3("World")
    public static void main(String[] args) {

    }
}
