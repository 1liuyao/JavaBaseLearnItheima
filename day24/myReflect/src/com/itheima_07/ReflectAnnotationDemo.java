package com.itheima_07;
/*
    【ORM】
    （1）对象关系映射 Object relationship Mapping
    （2）类和表结构对应
    （3）属性和字段对应
    （4）对象和记录对应

    如何利用注解和反射完成类和表结构的映射？
 */

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ReflectAnnotationDemo {
    public static void main(String[] args) throws NoSuchFieldException {
        //获得类上注解
        Class<Student> studentClass = Student.class;
        Annotation[] annotations = studentClass.getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        //获得类上注解的value值
        AnnotationTable annotation = studentClass.getAnnotation(AnnotationTable.class);
        String value = annotation.value();
        System.out.println(value);

        //获得成员属性上的注解
        Field id = studentClass.getDeclaredField("id");
        FieldName annotation1 = id.getAnnotation(FieldName.class);
        String s = annotation1.columnName();
        int length = annotation1.length();
        String type = annotation1.type();
        System.out.println(s+" "+length+" "+type);
    }
}

