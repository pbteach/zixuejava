/*
	if����ʽ2����ϰ��
		A:��ȡ���������нϴ��ֵ
		B:�ж�һ����������������ż��,���������������ż��
*/
import java.util.Scanner;

class IfTest {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//��ȡ���������нϴ��ֵ
		System.out.println("�������һ�����ݣ�");
		int a = sc.nextInt();
		
		System.out.println("������ڶ������ݣ�");
		int b = sc.nextInt();
		
		//����һ�������������ֵ
		int max;
		
		if(a > b) {
			max = a;
		}else {
			max = b;
		}
		
		System.out.println("max:"+max);
		System.out.println("----------------");
		
		//�ж�һ����������������ż��
		System.out.println("��������Ҫ�жϵ����ݣ�");
		int x = sc.nextInt();
		
		if(x%2 == 0) {
			System.out.println(x+"���������ż��");
		}else {
			System.out.println(x+"�������������");
		}
	}
}