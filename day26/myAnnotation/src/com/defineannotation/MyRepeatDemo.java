package com.defineannotation;

import java.lang.annotation.*;

//ÖØ¸´×¢½â
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Inherited
public @interface MyRepeatDemo {
   MyAnnotationDemo3[] value();
}
