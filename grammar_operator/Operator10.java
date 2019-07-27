/*
	^的特点：
		一个数对另一个数异或两次，该数本身不变;
		一个数对另一个数异或一次，再对自己异或一次，则变成另一个数；
*/
public class Operator10
{
	public static void main(String[] args) 
	{

		int a = 5;
		int b = 10;
		
		//采用异或交换变量的值
		//一个数对另一个数异或两次，该数本身不变;
		System.out.println(a ^ b ^ b); //输出5
		//一个数对另一个数异或一次，再对自己异或一次，则变成另一个数；
		System.out.println(a ^ b ^ a); //输出10
		//一个数对另一个数异或一次，再对自己异或一次，则变成另一个数；
		System.out.println(b ^ a ^ b); //输出5
		System.out.println("--------以上为测试--------");
		a = a ^ b ;
		b = a ^ b ;//相当于System.out.println(a ^ b ^ b);执行后b的值为a的值，即为5
		a = a ^ b ;//此时b为a的值，a ^ b相当于a ^ b ^ a，a的值为10
		System.out.println(a);
		System.out.println(b);

		

	}

	
}

