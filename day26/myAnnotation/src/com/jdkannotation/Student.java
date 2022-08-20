package com.jdkannotation;

public class Student extends Person{
    @Override
    @Deprecated
    public void show() {
        System.out.println("Student show");
    }
}
