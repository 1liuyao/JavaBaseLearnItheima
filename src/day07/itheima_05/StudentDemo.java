package day07.itheima_05;

/*
    ѧ��������
 */
public class StudentDemo {
    public static void main(String[] args) {
        //��������
        Student s = new Student();

        //ʹ��set��������Ա������ֵ
        s.setName("����ϼ");
        s.setAge(30);

        s.show();

        //ʹ��get������ȡ��Ա������ֵ
        System.out.println(s.getName() + "---" + s.getAge());
        System.out.println(s.getName() + "," + s.getAge());

    }
}
