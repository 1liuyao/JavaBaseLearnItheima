package day07.itheima_03;

/*
    �������ָ����ͬ�����к���1��new���󣬵��Ƕ������ָ��ͬһ��ʵ��

    �ܽ᣺
    ��������������ָ��ͬһ���ڴ�ռ䣨��������¼�ĵ�ֵַ��һ���ģ�
    ֻҪ���κ�һ�������޸����ڴ��е����ݣ��������ʹ����һ������������ݻ�ȡ��
    �����޸ĺ�����ݡ�
 */
public class StudentTest03 {
    public static void main(String[] args) {
        //������һ������ʹ��
        Student s1 = new Student();

        s1.name = "����ϼ";
        s1.age = 30;
        System.out.println(s1.name + "," + s1.age);

        //�ѵ�һ������ĵ�ַ��ֵ���ڶ�������
        Student s2 = s1;

        s2.name = "������";
        s2.age = 28;
        System.out.println(s1.name + "," + s1.age);
        System.out.println(s2.name + "," + s2.age);
    }
}
