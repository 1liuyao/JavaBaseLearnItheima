package com.itheima_07;
/*
    ��ORM��
    ��1�������ϵӳ�� Object relationship Mapping
    ��2����ͱ�ṹ��Ӧ
    ��3�����Ժ��ֶζ�Ӧ
    ��4������ͼ�¼��Ӧ

    �������ע��ͷ��������ͱ�ṹ��ӳ�䣿
 */

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ReflectAnnotationDemo {
    public static void main(String[] args) throws NoSuchFieldException {
        //�������ע��
        Class<Student> studentClass = Student.class;
        Annotation[] annotations = studentClass.getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        //�������ע���valueֵ
        AnnotationTable annotation = studentClass.getAnnotation(AnnotationTable.class);
        String value = annotation.value();
        System.out.println(value);

        //��ó�Ա�����ϵ�ע��
        Field id = studentClass.getDeclaredField("id");
        FieldName annotation1 = id.getAnnotation(FieldName.class);
        String s = annotation1.columnName();
        int length = annotation1.length();
        String type = annotation1.type();
        System.out.println(s+" "+length+" "+type);
    }
}

