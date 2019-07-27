/*
	比较运算符：==,!=,>,>=,<,<=
*/
public class Operator3
{
	public static void main(String[] args) 
	{

		int a = 3;
		int b = 4;
		int c = 3;
	
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a+b == a+c);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		
		//尽量避免对浮点型数据者==或!=的比较
		float d = 1.1f;
		double e = 1.1d;
		System.out.println(d == e);

		//优先级
		boolean flag1 = a != b;
		boolean flag2 = a == b;
		System.out.println(flag1);
		System.out.println(flag2);
	}

	
}
