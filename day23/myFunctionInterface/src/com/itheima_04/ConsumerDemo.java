package com.itheima_04;

import java.util.function.Consumer;

/*  ��Consumer�ӿڡ�
    Consumer<T>�ӿ�Ҳ����Ϊ�����ͽӿڣ������ѵ����ݵ����������ɷ���ָ��
    Consumer<T>��������������
        void accept(T t)���Ը����Ĳ���ִ�д˲���
        default Consumer<T> andThen(Consumer after)������һ����ϵ� Consumer������ִ�д˲�����Ȼ��ִ�� after����

 */
public class ConsumerDemo {
    public static void main(String[] args) {
//        operatorString("����ϼ",(String s) -> {
//            System.out.println(s);
//        });

        operatorString("����ϼ", s -> System.out.println(s));
//        operatorString("����ϼ",System.out::println);

//        operatorString("����ϼ", s -> {
//            System.out.println(new StringBuilder(s).reverse().toString());
//        });

        operatorString("����ϼ", s -> System.out.println(new StringBuilder(s).reverse().toString()));
        System.out.println("--------");

        operatorString("����ϼ", s -> System.out.println(s), s -> System.out.println(new StringBuilder(s).reverse().toString()));

    }

    //����һ���������ò�ͬ�ķ�ʽ����ͬһ���ַ�����������
    private static void operatorString(String name, Consumer<String> con1, Consumer<String> con2) {
//        con1.accept(name);
//        con2.accept(name);
        con1.andThen(con2).accept(name);//���������еȼ�
    }

    private static Consumer<String> operatorStringReturn(Consumer<String> con1, Consumer<String> con2){
        //Ϊʲô����ֵ���������Consumer<String>
        //��Ϊ���lambda���ʽֻ����Σ�û�з���ֵ�����Է���Consumer�еĳ��󷽷�accept()
        return (String name) -> { con1.accept(name); con2.accept(name);};
    }

    //����һ������������һ���ַ�������
    private static void operatorString(String name, Consumer<String> con) {
        con.accept(name);
    }
}

/*  ��andThen()����Դ�롿
     default Consumer<T> andThen(Consumer<? super T> after) {
        Objects.requireNonNull(after);
        return (T t) -> { accept(t); after.accept(t); };//ִ������accept����
     }
 */