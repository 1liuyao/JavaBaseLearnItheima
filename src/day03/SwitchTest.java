package day03;/*
	�����ﶬ

	����
		һ����12���£������ڴ����ﶬ4�����ڣ�����¼��һ���·ݣ����ó���ʵ���жϸ��·������ĸ����ڣ��������

	����3��4��5
	�ģ�6��7��8
	�9��10��11
	����1��2��12
*/

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		//����¼���·����ݣ�ʹ�ñ�������
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ���·ݣ�");
		int month = sc.nextInt();
		
		//������жϣ��������switch���ʵ��
		//��ÿ������У���������Ӧ�ļ���
		/*
		switch(month) {
			case 1:
				System.out.println("����");
				break;
			case 2:
				System.out.println("����");
				//break;
			case 3:
				System.out.println("����");
				break;
			case 4:
				System.out.println("����");
				break;
			case 5:
				System.out.println("����");
				break;
			case 6:
				System.out.println("�ļ�");
				break;
			case 7:
				System.out.println("�ļ�");
				break;
			case 8:
				System.out.println("�ļ�");
				break;
			case 9:
				System.out.println("�＾");
				break;
			case 10:
				System.out.println("�＾");
				break;
			case 11:
				System.out.println("�＾");
				break;
			case 12:
				System.out.println("����");
				break;
			default:
				System.out.println("��������·�����");
				//break;
		}
		*/
		
		/*case��͸��
		  һ��ƥ��case��δ����break����������˳��ִ�У����ǻ�����ڴ�֮���
		  ����case�����жϣ�ֱ��ִ�����飬ֱ������break�������Ҵ�����
		 */
		switch(month) {
			case 1:
			case 2:
			case 12:
				System.out.println("����");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("����");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("�ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("�＾");
				break;
			default:
				System.out.println("��������·�����");
		}		
	}
}