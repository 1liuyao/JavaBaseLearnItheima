package com.myclone;

import java.util.StringJoiner;

/*
    【Cloneable接口】
    （1）如果一个接口里面没有抽象方法，则表示当前接口是一个标记性接口
    （2）如果实现了Cloneable接口，表示当前类的对象可以被克隆，如果没有实现，则当前类的对象不能被克隆
 */
public class User implements Cloneable{
    private int id;//游戏角色
    private String username;
    private String password;
    private String path;//游戏图片
    private int[] data;//游戏进度

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
        return "角色编号为：" + id +
                ", 用户名" + username +
                ", 密码" + password +
                ", 游戏图片" + path + '\'' +
                ", 进度" + arrToString() ;
    }

    public String arrToString(){
        StringJoiner sj=new StringJoiner(",","[","]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i]+"");
        }
        return sj.toString();
    }
    //深克隆
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用父类中的clone方法，由于此方法被protected修饰，所以选则重写该方法
        //相当于让Java帮我们克隆一个对象，并把克隆之后的对象那个返回出去。

        //先把被克隆的对象中的数组获取出来
        int[] data = this.data;
        //创建新数组
        int[] newData = new int[data.length];
        //拷贝数组中的数据
        for (int i = 0; i < data.length; i++) {
            newData[i]=data[i];
        }
        //调用父类中的方法克隆
        User user =(User)super.clone();
        //因为父类中的克隆方法是浅克隆，替换克隆出来对象中的数组地址值
        user.data=newData;
        return user;
    }

    //浅克隆
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
}
