package com.itheima_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
    public static final InputStream in����׼��������ͨ��������Ӧ�ڡ����̡�������������������û�ָ������һ������Դ
 */
public class SystemInDemo {
    public static void main(String[] args) throws IOException {
        //public static final InputStream in����׼������
//        InputStream is = System.in;

//        int by;
//        while ((by=is.read())!=-1) {
//            System.out.print((char)by);
//        }

        //��ΰ��ֽ���ת��Ϊ�ַ�������ת����
//        InputStreamReader isr = new InputStreamReader(is);
//        //ʹ���ַ����ܲ��ܹ�ʵ��һ�ζ�ȡһ�������أ�����
//        //���ǣ�һ�ζ�ȡһ�����ݵķ������ַ����������������з���
//        BufferedReader br = new BufferedReader(isr);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("������һ���ַ�����");
        String line = br.readLine();
        System.out.println("��������ַ����ǣ�" + line);

        System.out.println("������һ��������");
        int i = Integer.parseInt(br.readLine());
        System.out.println("������������ǣ�" + i);

        //�Լ�ʵ�ּ���¼������̫�鷳�ˣ�����Java���ṩ��һ���๩����ʹ�á������ࡿ
        Scanner sc = new Scanner(System.in);
    }
}
