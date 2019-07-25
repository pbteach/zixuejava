/*

变量的作用域：块级别
*/
class VariableDemo3 {

	//main是一个方法
	public static void main(String[] args) {
		//定义变量，此变量属于方法级别
		int a=1;
		//一个代码块
		{
			//在代码块中定义一个变量，它的作用域只在此块
			int b=2;
			System.out.println(b);
		}

		//一个代码块
		{
			//在代码块中定义一个变量，它的作用域只在此块
			int b=3;
			System.out.println(b);
		}
		//代码块可以直接使用方法级别的变量
		{
			//访问方法级别变量a
			System.out.println(a);
			//试图定义一个和方法级别变量a同名的变量，编译报错
			//int a = 2;
			//System.out.println(a);
		}
		//在方法范围无法访问代码块中的变量
		//System.out.println(b);
	}
}