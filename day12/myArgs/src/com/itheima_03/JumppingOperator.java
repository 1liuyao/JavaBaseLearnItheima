package com.itheima_03;
/*
    �ӿ���Ϊ�βκͷ���ֵ:
    (1)�������β��ǽӿ�������ʵ��Ҫ���Ǹýӿڵ�ʵ�������
    (2)�����ķ���ֵ�ǽӿ�������ʵ���ص��Ǹýӿڵ�ʵ�������
 */
public class JumppingOperator {
    //�������β��ǽӿ���
    public void useJumpping(Jumpping j) { //Jumpping j = new Cat();
        j.jump();
    }
    //�����ķ���ֵ�ǽӿ���
    public Jumpping getJumpping() {
        Jumpping j = new Cat();
        return j;
    }

}
