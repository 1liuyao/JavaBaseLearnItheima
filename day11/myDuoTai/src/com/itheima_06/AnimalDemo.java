package com.itheima_06;

/*
    ������
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //����è�������в���
        Animal a = new Cat();
        a.setName("�ӷ�");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        a = new Cat("�ӷ�", 5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

    }
}
