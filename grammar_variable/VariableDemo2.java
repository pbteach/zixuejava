/*

变量的作用域：方法级别
*/
class VariableDemo2 {
	//定义一个方法
	public static void fun1(){
		//定义变量a并赋值99，此变量只在fun1方法中有效，不同方法中的变量互不影响
		int a = 99;
		System.out.println(a);
		//同一个作用域内定义了一个同名的变量则编译时报错
		//int a = 990;
		//System.out.println(a);
	}
	//定义一个方法
	public static void fun2(){
		//定义变量a并赋值199，此变量只在fun2方法中有效，不同方法中的变量互不影响
		int a = 199;
		System.out.println(a);
	}
	public static void main(String[] args) {
		//调用fun1方法
		fun1();
		//调用fun2方法
		fun2();
	}
}