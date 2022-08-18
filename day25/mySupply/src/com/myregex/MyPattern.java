package com.myregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    Pattern:��ʾ������ʽ��������������ʽ����
    Matcher�����չ��򣬴�ͷ��ȡ�ı�����ȡ���Ϲ�����ַ���
 */
public class MyPattern {
    public static void main(String[] args) {
        String str="23rdrtrre5554��ҷ�Ŷi����Java113����ط����ַ����Ƿ�Javadj������҅Java";
        Pattern p = Pattern.compile("Java\\d{0,2}");
        //��ȡ�ı�ƥ�����Ķ���
        //m:�ı�ƥ��������
        //str����
        //p������
        //mҪ��str���ҷ���p������Ӵ�
        Matcher m = p.matcher(str);
        //�����ı�ƥ������ͷ��ʼ��ȡ��Ѱ���Ƿ������������ִ�
        //���û�У���������false
        //����У�����true���ڵײ��¼�ִ�����ʼ�����ͽ�������+1
        //boolean b = m.find();

        //�����ײ�����find������¼�����������ַ����Ľ�ȡ
        //subString����ʼ��������������������ͷ����β
        //��ѽ�ȡ��С������
//        String s1=m.group();
//        System.out.println(s1);
        while (m.find()){
            System.out.println(m.group());
        }

        //��������ȡ
        //����1��Java��Java17���҅��Java11324Java8adfֻ��ȡJava����Ҫ���������
        //?����ǰ������ݣ���Java
        //=��ʾ��Java��Ҫ���������
        //�����ڻ�ȡ��ʱ��ֻҪǰ�벿�֣���ֻҪJava
        System.out.println("=================");
        String s1="Java��Java17���҅��Java11324Java8adf";
        String regex1="(?i)Java(?=8|11|17)";
        Pattern compile = Pattern.compile(regex1);
        Matcher matcher = compile.matcher(s1);
        while (matcher.find()){
            System.out.println(matcher.group());
        }

        //����2����ȡ����Java8 Java11 Java17
        String regex2="(?i)Java(8|11|17)";
        String regex3="(?i)Java(?:8|11|17)";

        //����3����ȡ����Java8 Java11 Java17��Java�ı�
        String regex4="(?i)Java(?��8|11|17)";//��ȡJava

        //̰����ȡ������ȡ���ݵ�ʱ�򾡿��ܶ�Ļ�ȡ����
        //��̰����ȡ������ȡ���ݵ�ʱ�򾡿����ٵĻ�ȡ����
        //java���У�Ĭ�ϵľ���̰����ȡ�������+����*�������?����ô�ͱ�ɷ�̰����ȡ
        System.out.println("---------------------");
        String regex5="ab+";//̰����ȡ�õ���abbbbbbbb
        String regex6="ab+?";//��̰����ȡ�õ���ab
        String s2="abbbbbbbb";

        Pattern compile1 = Pattern.compile(regex6);
        Matcher matcher1 = compile1.matcher(s2);
        while (matcher1.find()){
            System.out.println(matcher1.group());
        }

    }
}
