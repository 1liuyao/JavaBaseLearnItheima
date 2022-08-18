package com.myclone;

import java.util.StringJoiner;

/*
    ��Cloneable�ӿڡ�
    ��1�����һ���ӿ�����û�г��󷽷������ʾ��ǰ�ӿ���һ������Խӿ�
    ��2�����ʵ����Cloneable�ӿڣ���ʾ��ǰ��Ķ�����Ա���¡�����û��ʵ�֣���ǰ��Ķ����ܱ���¡
 */
public class User implements Cloneable{
    private int id;//��Ϸ��ɫ
    private String username;
    private String password;
    private String path;//��ϷͼƬ
    private int[] data;//��Ϸ����

    public User() {
    }

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "��ɫ���Ϊ��" + id +
                ", �û���" + username +
                ", ����" + password +
                ", ��ϷͼƬ" + path + '\'' +
                ", ����" + arrToString() ;
    }

    public String arrToString(){
        StringJoiner sj=new StringJoiner(",","[","]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i]+"");
        }
        return sj.toString();
    }
    //���¡
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //���ø����е�clone���������ڴ˷�����protected���Σ�����ѡ����д�÷���
        //�൱����Java�����ǿ�¡һ�����󣬲��ѿ�¡֮��Ķ����Ǹ����س�ȥ��

        //�Ȱѱ���¡�Ķ����е������ȡ����
        int[] data = this.data;
        //����������
        int[] newData = new int[data.length];
        //���������е�����
        for (int i = 0; i < data.length; i++) {
            newData[i]=data[i];
        }
        //���ø����еķ�����¡
        User user =(User)super.clone();
        //��Ϊ�����еĿ�¡������ǳ��¡���滻��¡���������е������ֵַ
        user.data=newData;
        return user;
    }

    //ǳ��¡
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
}
