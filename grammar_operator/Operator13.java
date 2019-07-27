/*
	三目运算符应用：求三个数的最大值
*/
public class Operator13
{
	public static void main(String[] args) 
	{

		//求三个整数中的最大值
		int a = 5;
		int b = 6;
		int c = 7;
		
		//思路分析：
		//1、先求出前两个数a和b中的最大值
		int m1 = ((a > b)? a: b);
		//2、再拿前前两个数中的最大值和第三个数比较，最终得到三个数中的最大值
		int m2 = (m1 > c? m1: c);
		System.out.println("m2:"+m2);
		
	}

	
}

