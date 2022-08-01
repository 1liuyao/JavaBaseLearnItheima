package com.itheima;

import java.io.File;

/*
    File����жϺͻ�ȡ���ܣ�
        public boolean isDirectory()�����Դ˳���·������ʾ��File�Ƿ�ΪĿ¼
        public boolean isFile()�����Դ˳���·������ʾ��File�Ƿ�Ϊ�ļ�
        public boolean exists()�����Դ˳���·������ʾ��File�Ƿ����

        public String getAbsolutePath()�����ش˳���·�����ľ���·�����ַ���
        public String getPath()�����˳���·����ת��Ϊ·�����ַ���
        public String getName()�������ɴ˳���·������ʾ���ļ���Ŀ¼������

        public String[] list()�����ش˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼�������ַ�������
        public File[] listFiles()�����ش˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼��File��������
        ע�⣺���ֻ��Ҫ����ĳһ����·���µ�Ŀ¼�����ļ�����ôʹ��list()��������
             ����������ļ��󣬻���Ҫ���ļ����в�����ʹ��File�෽������ôʹ��listFiles()����
 */
public class FileDemo04 {
    public static void main(String[] args) {
        //����һ��File����
        File f = new File("myFile\\java.txt");

//        public boolean isDirectory()�����Դ˳���·������ʾ��File�Ƿ�ΪĿ¼
//        public boolean isFile()�����Դ˳���·������ʾ��File�Ƿ�Ϊ�ļ�
//        public boolean exists()�����Դ˳���·������ʾ��File�Ƿ����
        //��File f��ָ����ļ�������ʱ��������false
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.exists());

//        public String getAbsolutePath()�����ش˳���·�����ľ���·�����ַ���
//        public String getPath()�����˳���·����ת��Ϊ·�����ַ���
//        public String getName()�������ɴ˳���·������ʾ���ļ���Ŀ¼������
        System.out.println(f.getAbsolutePath());//ȫ·�������̷�������
        System.out.println(f.getPath());//��һ��Ŀ¼\�ļ���
        System.out.println(f.getName());//�ļ���
        System.out.println("--------");

//        public String[] list()�����ش˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼�������ַ�������
//        public File[] listFiles()�����ش˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼��File��������
        File f2 = new File("E:\\itcast");

        String[] strArray = f2.list();//�����itcast��һ����Ŀ¼���ļ���
        for(String str : strArray) {
            System.out.println(str);
        }
        System.out.println("--------");

        File[] fileArray = f2.listFiles();
        for(File file : fileArray) {
//            System.out.println(file);//�����itcast��һ����Ŀ¼���ļ�����ȫ·������
//            System.out.println(file.getName());
            if(file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }
}
