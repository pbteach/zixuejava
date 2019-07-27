/*
	交换两个变量的值，使用中间变量实现
*/
public class Operator11
{
	public static void main(String[] args) 
	{

		int a = 5;
		int b = 10;
		System.out.println("原来：a:"+a+",b:"+b);
		//定义中间变量，并存储a的值(以免给a赋值丢掉a原来的值)
		int c = a;
		//将b赋值给a（a原来的值赋给了c，不怕丢了）
		a = b;
		//将中间变量（a的值）赋值给b
		b = c;
		//最终实现了两个变量值的交换
		System.out.println("交换后：a:"+a+",b:"+b);
		
	}

	
}

