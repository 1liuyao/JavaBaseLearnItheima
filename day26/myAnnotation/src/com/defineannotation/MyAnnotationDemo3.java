package com.defineannotation;
/*
    自定义注解参照@SuppressWarnings格式

    @Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface SuppressWarnings {
        String[] value();
    }

 */

import com.sun.deploy.security.ValidationState;

import java.lang.annotation.*;

@Documented//表示@MyAnnotationDemo3会保留在javadoc文档中
@Target({ElementType.METHOD})//表明@MyAnnotationDemo3只能修饰方法
@Retention(RetentionPolicy.RUNTIME)
@Inherited//具备继承性
@Repeatable(MyRepeatDemo.class)
public @interface MyAnnotationDemo3 {
    //String value();//代表注解MyAnnotationDemo3使用时需要传递参数值，参数名为value，
                    // 如果有多个参数值则使用String[] value()
    String value() default "hello";//给出成员的默认值，那么在使用注解时，可以不传参数。

}
