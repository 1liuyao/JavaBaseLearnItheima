package com.itheima_02;

/*
    ��������Ϊ�βκͷ���ֵ:
    (1)�������β��ǳ�����������ʵ��Ҫ���Ǹó�����ġ����ࡿ����
    (2)�����ķ���ֵ�ǳ�����������ʵ���ص��Ǹó�����ġ����ࡿ����
 */
public class AnimalOperator {
    //�β�Ϊ����������
    public void useAnimal(Animal a) { //Animal a = new Cat();
        a.eat();
    }
    //����ֵΪ����������
    public Animal getAnimal() {
        Animal a = new Cat();
        return a;
    }

}
