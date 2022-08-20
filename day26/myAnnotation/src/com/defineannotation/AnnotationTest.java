package com.defineannotation;

public class AnnotationTest {
    //@MyAnnotationDemo3("HELLO"//注解中只有value一个成员，那么value可以省略

    //重复注解，当想在同一个位置使用同一个注解两次时，以下写法报错
//    @MyAnnotationDemo3(value = "helllo")
//    @MyAnnotationDemo3(value = "World")

    //jdk1.8之前，若想使用重复注解，可以让注释中的属性为数组MyAnnotationDemo3[] value();
    //@MyRepeatDemo({@MyAnnotationDemo3("Hello"),@MyAnnotationDemo3("World")})

    //jdk8之后,使用@Repeatable
    @MyAnnotationDemo3("Hello")
    @MyAnnotationDemo3("World")
    public static void main(String[] args) {

    }
}
