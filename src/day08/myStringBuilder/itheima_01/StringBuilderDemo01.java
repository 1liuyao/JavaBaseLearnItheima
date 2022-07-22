package day08.myStringBuilder.itheima_01;

/*
    StringBuilder构造方法：
        public StringBuilder()：创建一个空白可变字符串对象，不含有任何内容
        public StringBuilder(String str)：根据字符串的内容，来创建可变字符串对象
 */
public class StringBuilderDemo01 {
    public static void main(String[] args) {
        //public StringBuilder()：创建一个空白可变字符串对象，不含有任何内容
        StringBuilder sb = new StringBuilder();
        System.out.println("sb:" + sb);
        System.out.println("sb.length():" + sb.length());

        //public StringBuilder(String str)：根据字符串的内容，来创建可变字符串对象
        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println("sb2:" + sb2);
        System.out.println("sb2.length():" + sb2.length());

        String s = new String();
        String s1="";
        StringBuilder s2 = new StringBuilder();

        System.out.println(s.equals(s1));//空串内容比较,返回true
        System.out.println(s.equals(s2));//false,源码中表示如果非String对象和String比较直接返回false

        //比较StringBuilder与String可以将StringBuilder通过.toString()
        //方法转换为String后进行，String中的equals方法是执行逐字符比较后返回结果。
        System.out.println(s.equals(s2.toString()));//true
        System.out.println(s==s1);
    }
}
