import java.util.Scanner;

public class BinaryZero {
/*
 题目内容：
计算机内部用二进制来表达所有的值。一个十进制的数字，比如18，在一个32位的计算机内部被表达为00000000000000000000000000011000。可以看到，从左边数过来，在第一个1之前，有27个0。我们把这些0称作前导的零。
现在，你的任务是写一个程序，输入一个整数，输出在32位二进制表达下它前导的零的个数。

输入格式:
一个整数，在32位的整数可以表达的范围内。

输出格式：
一个整数，表达输入被表达为一个32位的二进制数时，在第一个1之前的0的数量

输入样例：
256

输出样例：
23
 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
//		int[] array = new int[32];
		int count = 0;
		
//		for (int i = 0; i < 32; i++) {
//			array[i] = 0;
//		}
		

		for (int i = 0; i < 32; i++) {
			if(input/2 != 0 && input%2 == 0) {
//				array[i] = 0;
				input = input/2;
				count++;
			}if(input%2 == 1) {
//				array[i] = 1;
				input = input/2;
				count++;
			}if(input/2 == 0) {
				break;
			}
		}
//		for (int k : array) {
//			System.out.print(k + " ");
//		}
		System.out.println(32-count);
	}

}
