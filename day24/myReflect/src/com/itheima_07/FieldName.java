package com.itheima_07;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
//ÊôÐÔ×¢½â
@interface FieldName{
    String columnName();
    String type();
    int length();
}
