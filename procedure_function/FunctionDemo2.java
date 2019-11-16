/*
	方法的注意事项：
		A:方法不调用不执行
		B:方法与方法是平级关系，不能嵌套定义
		C:方法定义的时候参数之间用逗号隔开
		D:方法调用的时候不用在传递数据类型
		E:如果方法有明确的返回值，一定要有return带回一个值
*/
class FunctionDemo2 {
	public static void main(String[] args) {
		/*
		错误的
		public static int sum(int a,int b){
			return a + b;
		}
		*/
		
		//sum(10,20);
		
		//int x = 10;
		//int y = 20;
		//错误
		//sum(int x,int y);
	}
	
	public static int sum(int a,int b){
		return a + b;
	}
}