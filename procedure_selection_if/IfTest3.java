/*
	键盘录入月份的值，输出对应的季节。
	
	春	3,4,5
	夏	6,7,8
	秋	9,10,11
	冬	12,1,2
	
	分析：
		A:键盘录入月份的值，所以我们要使用Scanner。
		B:我们应该判断这个月份在那个季节，而这个判断情况较多，所以，用if语句格式3。
		
	if语句的使用场景：
		A:针对表达式是一个boolean类型的判断
		B:针对一个范围的判断
*/
import java.util.Scanner;

class IfTest3 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//录入数据
		System.out.println("请你输入一个月份:");
		int month = sc.nextInt();
		
		//第三种格式实现即可
		if(month<1 || month>12) {
			System.out.println("你输入的月份有误");
		}else if(month == 1) {
			System.out.println("冬季");
		}else if(month == 2) {
			System.out.println("冬季");
		}else if(month == 3) {
			System.out.println("春季");
		}else if(month == 4) {
			System.out.println("春季");
		}else if(month == 5) {
			System.out.println("春季");
		}else if(month == 6) {
			System.out.println("夏季");
		}else if(month == 7) {
			System.out.println("夏季");
		}else if(month == 8) {
			System.out.println("夏季");
		}else if(month == 9) {
			System.out.println("秋季");
		}else if(month == 10) {
			System.out.println("秋季");
		}else if(month == 11) {
			System.out.println("秋季");
		}else {
			System.out.println("冬季");
		}
		System.out.println("--------------");
		
		//这个程序确实是符合了我们的需求，但是就是看起来比较麻烦
		//那么，我们能不能改进一下呢?
		//month == 3
		//month == 4
		//month == 5
		//我们发现，上面三个都是春季。
		//而他们本身每一个都是一个boolean表达式
		//所以，我们就可以考虑使用逻辑运算符给他们连接起来改进
		if(month<1 || month>12) {
			System.out.println("你输入的月份有误");
		}else if(month==3 || month==4 || month==5) {
			System.out.println("春季");
		}else if(month==6 || month==7 || month==8) {
			System.out.println("夏季");
		}else if(month==9 || month==10 || month==11) {
			System.out.println("秋季");
		}else {
			System.out.println("冬季");
		}
		System.out.println("--------------");
		
		//这个时候，程序代码以及可以了。
		//但是呢，假如我要求你输入一个月份，判断是上半年还是下半年。
		//这个时候，我们的判断条件连接就是6个boolean表达式
		//我们可能还有更多的连接
		//这个时候，其实我们还有另外的一种改进方案：
		//month == 3
		//month == 4
		//month == 5
		//month>=3 && month<=5
		//用范围也是可以改进的。
		if(month<1 || month>12) {
			System.out.println("你输入的月份有误");
		}else if(month>=3 && month<=5) {
			System.out.println("春季");
		}else if(month>=6 && month<=8) {
			System.out.println("夏季");
		}else if(month>=9 && month<=11) {
			System.out.println("秋季");
		}else {
			System.out.println("冬季");
		}
		System.out.println("--------------");
	}
}