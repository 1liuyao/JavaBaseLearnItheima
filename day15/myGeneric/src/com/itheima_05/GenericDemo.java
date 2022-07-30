package com.itheima_05;

import java.util.ArrayList;
import java.util.List;

/*
    类型通配符：<?>
        List<?>：表示元素类型未知的List，它的元素可以匹配任何的类型
        这种带通配符的List仅表示它是各种泛型List的【父类】，【并不能把元素添加到其中】
        当操作类型时，不需要使用类型的具体功能，只使用Object类中的功能，可以使用<？>来表示未知类型

    类型通配符上限：<? extends 类型>
        List<? extend s Number>：它表示的类型是Number或者其子类型

    类型通配符下限：<? super 类型>
        List<? super Number>：它表示的类型是Number或者其父类型

    什么时候使用泛型？
    当类中操作的【引用数据】类型不确定的时候，以前用Object来进行扩展，现在可以用泛型来表示，这样可以避免强转。

    泛型细节：
    （1）泛型到底代表什么类型取决于调用者传入的类型，如果没有传，默认时Object类型。
    （2）使用带泛型的类创建对象时，等式两边指定的泛型必须一致.
    （3）等式两边可以在任意一边使用泛型，在另一边不使用
     例如：List list2 = new ArrayList<Number>();
          List<?> list2 = new ArrayList();
    （4）List<? extends T> a ,可以把a及其a的子类赋给a，从a里取的元素都会被强制转换为 T 类型，
        不过需要注意的是，不能向 a 添加任何除 null 外是元素。
    （5）List<? super T> a ,可以把a及其a的父类赋给a，从a里取的元素都会被强制转换为Object类型，
        不过需要注意的是，可以向a添加元素，但添加的只能是T及其子类元素.
 */
public class GenericDemo {
    public static void main(String[] args) {
        //类型通配符：<?>
        List<?> list1 = new ArrayList<Object>();
        List<?> list2 = new ArrayList<Number>();
        List<?> list3 = new ArrayList<Integer>();
       // List<String> list4=new ArrayList<Object>();//报错，等式两边指定的泛型必须一致
        System.out.println("--------");

        //类型通配符上限：<? extends 类型>
//        List<? extends Number> list4 = new ArrayList<Object>();//父类超过Number上限
        List<? extends Number> list5 = new ArrayList<Number>();
        List<? extends Number> list6 = new ArrayList<Integer>();
        System.out.println("--------");

        //类型通配符下限：<? super 类型>
        List<? super Number> list7 = new ArrayList<Object>();
        List<? super Number> list8 = new ArrayList<Number>();
//        List<? super Number> list9 = new ArrayList<Integer>();//Integer小于Number下限

        List<? extends Object> list10=new ArrayList<String>();
        //list10.add("10");//不可以使用add方法，因为集合既可以存储String又可以存储Object子类，所以添加具体对象不合适，类型检查会出现安全问题
    }
    public static void method(ArrayList<? extends Object> a){
        //a.add("123");//a集合中的元素只能调用Object类中的方法，具体子类型的方法不能用，因为子类型不确定
    }
}
