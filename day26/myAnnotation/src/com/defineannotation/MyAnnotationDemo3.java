package com.defineannotation;
/*
    �Զ���ע�����@SuppressWarnings��ʽ

    @Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface SuppressWarnings {
        String[] value();
    }

 */

import com.sun.deploy.security.ValidationState;

import java.lang.annotation.*;

@Documented//��ʾ@MyAnnotationDemo3�ᱣ����javadoc�ĵ���
@Target({ElementType.METHOD})//����@MyAnnotationDemo3ֻ�����η���
@Retention(RetentionPolicy.RUNTIME)
@Inherited//�߱��̳���
@Repeatable(MyRepeatDemo.class)
public @interface MyAnnotationDemo3 {
    //String value();//����ע��MyAnnotationDemo3ʹ��ʱ��Ҫ���ݲ���ֵ��������Ϊvalue��
                    // ����ж������ֵ��ʹ��String[] value()
    String value() default "hello";//������Ա��Ĭ��ֵ����ô��ʹ��ע��ʱ�����Բ���������

}
