/*
	��ά���飺����Ԫ��Ϊһά�����һ�����顣
	
	��ʽ1��
		��������[][] ������ = new ��������[m][n];
		
		m:��ʾ�����ά�����ж��ٸ�һά���顣
		n:��ʾÿһ��һά�����Ԫ���ж��ٸ���
		
	ע�⣺
		A:���¸�ʽҲ���Ա�ʾ��ά����
			a:�������� ������[][] = new ��������[m][n];
			b:��������[] ������[] = new ��������[m][n];
		B:ע�����涨�������
			int x;
			int y;
			int x,y;
			
			int[] x;
			int[] y[];
			
			int[] x,y[];
*/
class Array2Demo {
	public static void main(String[] args) {
		 //����һ����ά����
		 int[][] arr = new int[3][2];
		 //������һ����ά����arr
		 //�����ά������3��һά�����Ԫ��
		 //ÿһ��һά������2��Ԫ��
		 //�����ά��������
		 System.out.println(arr); //��ֵַ	[[I@175078b
		 //�����ά����ĵ�һ��Ԫ��һά���������
		 System.out.println(arr[0]); //��ֵַ	[I@42552c
		 System.out.println(arr[1]); //��ֵַ	[I@e5bbd6
		 System.out.println(arr[2]); //��ֵַ	[I@8ee016
		 //�����ά�����Ԫ��
		 System.out.println(arr[0][0]); //0
		 System.out.println(arr[0][1]); //0
	}
}