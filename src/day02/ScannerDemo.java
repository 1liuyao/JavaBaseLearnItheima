package day02;/*
	�������룺
		������
			import java.util.Scanner;
		��������
			Scanner sc = new Scanner(System.in);
		�������ݣ�
			int x = sc.nextInt();
*/
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		//��������
		Scanner sc = new Scanner(System.in);
		
		//��������
		int x = sc.nextInt();
		
		//�������
		System.out.println("x:" + x);
	}
}