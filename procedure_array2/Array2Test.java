/*
	���󣺶�ά�������
	
	��ѭ�����Ƶ��Ƕ�ά����ĳ��ȣ���ʵ����һά����ĸ�����
	��ѭ�����Ƶ���һά����ĳ��ȡ�
*/
class Array2Test {
	public static void main(String[] args) {
		//����һ����ά����
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		//����˭����{1,2,3}
		//arr[0]���ǵ�һ������
		//arr[0] = {1,2,3};
		for(int x=0; x<arr[0].length; x++) {
			System.out.println(arr[0][x]);
		}
		System.out.println("--------------");
		
		for(int x=0; x<arr[1].length; x++) {
			System.out.println(arr[1][x]);
		}
		System.out.println("--------------");
		
		for(int x=0; x<arr[2].length; x++) {
			System.out.println(arr[2][x]);
		}
		System.out.println("--------------");
		
		//��ѭ���Ľ�
		for(int x=0; x<3; x++) {
			for(int y=0; y<arr[x].length; y++) {
				System.out.print(arr[x][y]+" ");
			}
			System.out.println();
		}
		System.out.println("--------------");
		
		//���ʱ��ע���ˣ�3�����Ǹ�������Ĵ���ó�����
		//���ǣ�����������κε����鶼��������
		//���ԣ�����Ӧ����취�Ľ�
		//��ʵ����������ѭ���ĳ��Ⱦ��Ƕ�ά����ĳ���
		
		for(int x=0; x<arr.length; x++) {
			for(int y=0; y<arr[x].length; y++) {
				System.out.print(arr[x][y]+" ");
			}
			System.out.println();
		}
		System.out.println("--------------");
		
		//�÷����Ľ�
		//���÷���
		printArray2(arr);
		System.out.println("--------------");
		
		//��������һ�������Ǳ仯��
		int[][] arr2 = {{1,2,3},{4,5},{6}};
		printArray2(arr2);
	}
	
	/*
		���󣺱�����ά����
		������ȷ��
			����ֵ���ͣ�void
			�����б�int[][] arr
	*/
	public static void printArray2(int[][] arr) {
		for(int x=0; x<arr.length; x++) {
			for(int y=0; y<arr[x].length; y++) {
				System.out.print(arr[x][y]+" ");
			}
			System.out.println();
		}
	}
}