package day03;/*
	Random
	
	���ã�
		���ڲ���һ�������

	ʹ�ò��裺
		1:����
			import java.util.Random;
		2:��������
			Random r = new Random();
		3:��ȡ�����
			int number = r.nextInt(10);
			��ȡ���ݵķ�Χ��[0,10) ����0,������10
*/

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		//��������
		Random r = new Random();
		
		//��ѭ����ȡ10�������
		for(int i=0; i<10; i++) {
			//��ȡ�����
			int number = r.nextInt(10);
			System.out.println("number:" + number);
		}
		
		//���󣺻�ȡһ��1-100֮��������
		int x = r.nextInt(100) + 1;
		System.out.println(x);
	}
}