/**
* 功能：运行时常量测试
* @author pbteach.com
* @version 1.0
*/
public class ConstantRuntime 
{

	public static void main(String[] args) 
	{
		//字符串常量的输出
		final String s = "欢迎来到攀博网www.pbteach.com!";
		System.out.println(s);
		//字符常量 
		final char c = 'A';
		System.out.println(c); 
		final int i = 666;
		//整型常量的输出
		System.out.println(i);
		//小数常量的输出
		final float f1 = 666.66f;
		System.out.println(f1);
		final double f2 = 666.66D;
		System.out.println(f2);
		//布尔常量的输出
		final boolean b1 = true;
		System.out.println(b1);
		//十进制
		final int d1 = 100;
		System.out.println(d1); 
		//二进制
		final int d2 = 0b10110110;
		System.out.println(d2); 
		//八进制
		final int d3 = 0266;
		System.out.println(d3); 
		//十六进制
		final int d4 = 0xB6;
		System.out.println(d4); 

	
	}
}