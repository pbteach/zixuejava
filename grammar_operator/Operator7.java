/*
	逻辑运算符优先级
*/
public class Operator7
{
	public static void main(String[] args) 
	{

		int a = 4;
		int b = 8; 
		boolean c = ++a>=5 && b--<=8;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("-------第一步结束-------");
		boolean d = !c ||  b-->=8 && ++a<b;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("d:"+d);
	}

	
}
