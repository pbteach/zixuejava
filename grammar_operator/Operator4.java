/*
	逻辑运算符：&、|、^、!、&&、||
*/
public class Operator4
{
	public static void main(String[] args) 
	{

		int a = 2;
		int b = 3;
		int c = 4;
		
		//&逻辑与，两个操作数都为true结果才为true，否则为false
		System.out.println((a > b) & (a > c)); //false & false = false
		System.out.println((a > b) & (a < c)); //false & true = false
		System.out.println((a < b) & (a > c)); //true & false = false
		System.out.println((a < b) & (a < c)); //true & true = true
		System.out.println("------------------------------");
		
		//|逻辑或，两个操作数只要有一个true结果就为true，否则为false
		System.out.println((a > b) | (a > c)); //false | false = false
		System.out.println((a > b) | (a < c)); //false | true = true
		System.out.println((a < b) | (a > c)); //true | false = true
		System.out.println((a < b) | (a < c)); //true | true = true
		System.out.println("------------------------------");
		
		//^逻辑异或,两个操作数只要有不一样结果就为true，否则为false
		System.out.println((a > b) ^ (a > c)); //false ^ false = false
		System.out.println((a > b) ^ (a < c)); //false ^ true = true
		System.out.println((a < b) ^ (a > c)); //true ^ false = true
		System.out.println((a < b) ^ (a < c)); //true ^ true = false
		System.out.println("------------------------------");
		
		//!逻辑非，真的非是假，假的非是真，一个数非两次还是原来的数
		System.out.println(!(a > b)); //!false = true
		System.out.println(!(a < b)); //!true = false
		System.out.println(!!(a > b)); //!!false = false
		System.out.println(!!!(a > b)); //!!!false = true
	}

	
}
