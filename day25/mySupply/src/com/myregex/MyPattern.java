package com.myregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    Pattern:表示正则表达式，是描述正则表达式的类
    Matcher：按照规则，从头读取文本，截取符合规则的字符串
 */
public class MyPattern {
    public static void main(String[] args) {
        String str="23rdrtrre5554大家发哦i电脑Java113冻结地方当局发的那份Javadj基督教覅Java";
        Pattern p = Pattern.compile("Java\\d{0,2}");
        //获取文本匹配器的对象
        //m:文本匹配器对象
        //str：大传
        //p：规则
        //m要在str中找符合p规则的子串
        Matcher m = p.matcher(str);
        //拿着文本匹配器从头开始读取，寻找是否有满足规则的字串
        //如果没有，方法返回false
        //如果有，返回true。在底层记录字串的起始索引和结束索引+1
        //boolean b = m.find();

        //方法底层会根据find方法记录的索引进行字符串的截取
        //subString（起始索引，结束索引）：包头不包尾
        //会把截取的小串返回
//        String s1=m.group();
//        System.out.println(s1);
        while (m.find()){
            System.out.println(m.group());
        }

        //带条件爬取
        //需求1：Java的Java17大家覅的Java11324Java8adf只截取Java，不要后面的数字
        //?代表前面的数据，即Java
        //=表示在Java后要跟随的数据
        //但是在获取的时候，只要前半部分，即只要Java
        System.out.println("=================");
        String s1="Java的Java17大家覅的Java11324Java8adf";
        String regex1="(?i)Java(?=8|11|17)";
        Pattern compile = Pattern.compile(regex1);
        Matcher matcher = compile.matcher(s1);
        while (matcher.find()){
            System.out.println(matcher.group());
        }

        //需求2：获取所有Java8 Java11 Java17
        String regex2="(?i)Java(8|11|17)";
        String regex3="(?i)Java(?:8|11|17)";

        //需求3：爬取除了Java8 Java11 Java17的Java文本
        String regex4="(?i)Java(?！8|11|17)";//截取Java

        //贪婪爬取：在爬取数据的时候尽可能多的获取数据
        //非贪婪爬取：在爬取数据的时候尽可能少的获取数据
        //java当中，默认的就是贪婪爬取，如果在+或者*后面加上?，那么就变成非贪婪爬取
        System.out.println("---------------------");
        String regex5="ab+";//贪婪爬取得到：abbbbbbbb
        String regex6="ab+?";//非贪婪爬取得到：ab
        String s2="abbbbbbbb";

        Pattern compile1 = Pattern.compile(regex6);
        Matcher matcher1 = compile1.matcher(s2);
        while (matcher1.find()){
            System.out.println(matcher1.group());
        }

    }
}
