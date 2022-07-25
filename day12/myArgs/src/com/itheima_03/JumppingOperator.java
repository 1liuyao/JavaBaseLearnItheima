package com.itheima_03;
/*
    接口作为形参和返回值:
    (1)方法的形参是接口名，其实需要的是该接口的实现类对象
    (2)方法的返回值是接口名，其实返回的是该接口的实现类对象
 */
public class JumppingOperator {
    //方法的形参是接口名
    public void useJumpping(Jumpping j) { //Jumpping j = new Cat();
        j.jump();
    }
    //方法的返回值是接口名
    public Jumpping getJumpping() {
        Jumpping j = new Cat();
        return j;
    }

}
