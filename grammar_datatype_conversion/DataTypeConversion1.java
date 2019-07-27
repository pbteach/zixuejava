/*
类型转换：自动转换
*/
public class DataTypeConversion1 
{
	public static void main(String[] args) 
	{

		//一个float和一个int相加
		int a = 1;
		double b = 4.2d;
		System.out.println(a + b);
		
		//定义一个int类型和double类型
		int c = 3;
		double d = 5.69d;
		d+=c;
		System.out.println(d);
		//将int和double相加的结果赋值给int会损失精度
		c+=d;
		System.out.println(c);

		//不允许将高级别类型的数据直接赋值给低级别类型的变量
		//int e = 5.6d;
		//System.out.println(e);
		//可以将低级别的数据赋值给高级别类型的变量
		double f = 77;
		System.out.println(f);
		
	}

	
}
