package day07.itheima_06;

/*
    ѧ����

    this�ؼ��֣�this����ǰ���÷��������ã��ĸ�������õķ�����this�ʹ�����һ������
    ��1��this���εı�������ָ����Ա����������Ҫ�����ǣ����־ֲ������ͳ�Ա�������������⣩
    ��2���������β�������Ա����ͬ��������this���εı���ָ�����βΣ������ǳ�Ա����
    ��3���������β�û�����Ա����ͬ��������this���εı���ָ���ǳ�Ա����

    this���ø�ʽ��
    ��1�����ó�Ա���ԣ�this.��Ա���ԡ��൱��this���úͶ�������ָ����ͬһ����ڴ��ַ��
    ��2�����ó�Ա�������ǹ��췽������this.��Ա����
    ��3�����ù��췽����this��ʵ�ʲ����������붨���ڹ��캯����һ�У��������ʧ�ܡ�
 */
public class Student {

    private String name;
    private int age;



//    public void setName(String n) {
//        name = n; //�����βξֲ�����n��name�����������ԣ�nameָ���ǳ�Ա����
//    }

    public void setName(String name) {
//        name = name;//�����βξֲ�����name�ͳ�Ա�����������������this����Ϊ��ô��
                    //�����ڵĳ�Ա��������������ִ����ɾ���ջ�ڴ���ʧ����˾͸�ֵʧ��
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setAge(int a) {
//        age = a;
//    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }

    //this����һ���Ա����
    public void show1(){
        this.show();
        //show(); //����һ���Ա����ʱ��this����ʡ�ԣ������к������������ʵ������this
    }

    //this���ù��췽��
    public Student() {
        System.out.println("1. public Person()");
    }
    public Student(String name, int age)
    {
        // ���ñ������޲ι��췽��
        this();//���붨���ڹ��캯����һ��
        this.name = name;
        this.age = age;
        System.out.println("2. public Person(String name,int  age)");
    }
}
