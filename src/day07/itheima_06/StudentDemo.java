package day07.itheima_06;
/*
    ѧ��������
 */
public class StudentDemo {
    public static void main(String[] args) {
        //��������
        Student s = new Student();
        Student s1=new Student("����",25);

        //ʹ��set��������Ա������ֵ
        s.setName("����ϼ");
        s.setAge(30);

        //����show����
        s.show();
        s.show1();
    }
}
