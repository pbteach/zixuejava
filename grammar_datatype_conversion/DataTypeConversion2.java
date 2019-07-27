/*
类型转换：强制转换及其它练习
*/
public class DataTypeConversion2
{
	public static void main(String[] args) 
	{

		byte a = 4;
		int b = 5;
		//下边语句编译报错:从int转换到byte可能会有损失
		//byte c = a + b; 
		//用强制类型转换将a+b的值赋给byte类型变量
		byte d = (byte) (a + b);
		System.out.println(d);

		byte a1=4,a2=5,b1;
		//a1+a2会转为int型，int型数据不能赋值给byte类型的变量
		//b1=a1+a2;
		//System.out.println(b1);

		System.out.println("hello"+'攀'+'博'+'网'+100); //hello攀博网100
		System.out.println('c'+1+"攀博网"); //100攀博网

		System.out.println("100+200="+100+200); //100+200=100200
		System.out.println(100+200+"=100+200"); //300=100+200
	}

	
}
