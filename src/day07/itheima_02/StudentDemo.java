package day07.itheima_02;

/*
    ѧ��������
 */
public class StudentDemo {
    public static void main(String[] args) {
        //��������
        Student s = new Student();
        System.out.println(s);//����.����+��ֵַ

        //ʹ�ö���
        System.out.println(s.name + "," + s.age);

        s.name = "����ϼ";
        s.age = 30;

        System.out.println(s.name + "," + s.age);

        s.study();
        s.doHomework();
    }
}
