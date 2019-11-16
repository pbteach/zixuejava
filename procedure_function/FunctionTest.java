/*
	键盘录入两个数据，返回两个数中的较大值
*/
import java.util.Scanner;

class FunctionTest {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第一个数据:");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个数据:");
		int b = sc.nextInt();
		
		int result = getMax(a,b);
		System.out.println("较大值是："+result);
	}
	
	/*
		需求：两个数中的较大值
		两个明确：
			返回值类型：int
			参数列表：int a,int b			
	*/
	public static int getMax(int a,int b) {
		//if语句
		/*
		if(a > b) {
			//System.out.println(a);
			return a;
		}else {
			//System.out.println(b);
			return b;
		}
		*/
		
		//用三元改进
		//int c = ((a > b)? a: b);
		//return c;
		
		//由于c就是后面的式子
		return ((a>b)? a : b);
	}
}