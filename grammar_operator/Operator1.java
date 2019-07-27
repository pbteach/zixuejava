/*
算术运算符：+,-,*,/,%,++,--
*/
public class Operator1 
{
	public static void main(String[] args) 
	{
		//+ 加、正号、字符串连接
		int a = 1;
		int b = 2;
		String s1 = "攀博网";
		String s2 = "自学编程";
		//s1和s2字符串拼接
		String s3 = s1 + s2;
		System.out.println(a+b);
		System.out.println(+b);
		System.out.println(s3);

		// /和%

		int c = 6;
		int d = 2;
		int e = 4;
		//两个整数相除结果取整
		System.out.println(c/d);
		System.out.println(c/e);
		//两个小数相除结果为小数
		double f = 6d;
		double g = 4d;
		System.out.println(f/g);

		//求余
		int h = 6;
		int i = 4;
		System.out.println(h%i);
		System.out.println(-h%i);
		
		int j = 8;
		//符号在前先加1再赋值
		System.out.println(++j);
		int k = 8;
		//符号在前先赋值再加1
		System.out.println(k++);
		int m = 9;
		int n = m++;
		System.out.println(m);
		System.out.println(n);
		//自减
		int o = 9;
		int p = o--;
		System.out.println(o);
		System.out.println(p);


	    //取模（了解）
		int r = 6;
		int s = 4;
		System.out.println(Math.floorMod(r,s));
		System.out.println(Math.floorMod(-r,s));

	}

	
}
