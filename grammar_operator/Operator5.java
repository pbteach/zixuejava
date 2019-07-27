/*
	逻辑运算符：&&双与
*/
public class Operator5
{
	public static void main(String[] args) 
	{

		int a = 3;
		int b = 4;
		int c = 5;
		
		//&&双与
		System.out.println((a > b) && (a > c)); //false && false = false
		System.out.println((a > b) && (a < c)); //false && true = false
		System.out.println((a < b) && (a > c)); //true && false = false
		System.out.println((a < b) && (a < c)); //true && true = true
		System.out.println("----------------");
		
		int x = 3;
		int y = 4;
		//如果使用&则会分别计算左边和右边关系表达式，x和y的值都会加1
		boolean b1 = ((++x == 3) & (y++ == 4));
		//如果使用&&由于具有短路功能，当左边为false则不再计算右边
		//boolean b1 = ((++x == 3) && (y++ == 4));
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println(b1);
	}

	
}
