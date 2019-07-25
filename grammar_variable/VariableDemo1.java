/*

变量在使用前必须先定义，变量定义后则在内存开辟一块空间。

变量赋值是指给变量所表示的内存空间存上数据。

变量定义后在使用前必须赋值才可以使用，可以在定义的同时进行赋值，也可以单独进行赋值。

变量名称必须符合java中标识符的要求：由大小写字母、数字、下划线（_）和美元符号（$）组成，开头不能是数字，不能使用关键字，区分大小写。
*/
class VariableDemo1 {
	public static void main(String[] args) {
		//定义变量a并赋值99
		int a = 99;
		System.out.println(a);
		//变量定义后必须赋值后才可以使用
		//int b;
		//下边的语句使用变量b编译时报错:尚未初始化变量b
		//System.out.println(b);
		
		int c;
		c = 100;
		System.out.println(c);
		
		//在一行上定义多个变量中间用分号分隔，不推荐
		//int x = 11; int y = 22; int z  = 33;
		//建议下边的定义方法
		int x = 11; 
		int y = 22; 
		int z  = 33;
				
		//int g,int h; //错误
		//int i; int j; //正确
		int e, f;
		e = 44;
		f = 55;
		System.out.println(e);
		System.out.println(f);

	}
}