/*
	位运算符：<<,>>,>>>
*/
public class Operator9
{
	public static void main(String[] args) 
	{

		//<< 左移1位即左边数乘以2的1次方，左移2位即左边数乘以2的2次方，以此类推
		System.out.println(3 << 2); //3*2^2 = 3*4 = 12;
	
		//>> 右移1位即左边数除乘以2的1次方，右移2位即左边数除乘以2的2次方，以此类推
		System.out.println(24 >> 2); 
		//负数转成二进制要用补码，最终将补码右移，再转成原码
		System.out.println(-24 >> 2); 
		//无符号数右移无论最高位是0还是1左边补齐0
		System.out.println(24 >>> 2);
		System.out.println(-24 >>> 2);


	}

	
}
