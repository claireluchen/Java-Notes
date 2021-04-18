package Recursion;

import java.math.BigInteger;
import java.util.Scanner;
//avoid this, it results in an exponential explosion of method calls
public class FibonacciSequence {
	private static BigInteger TWO = BigInteger.valueOf(2);
	
	//get nth number of the fibi sequence using recursion
	public static BigInteger numberAt(BigInteger num) {
		//two base cases for the Fibonacci calculation: fibonacci(0) = 0, fibonacci(1) = 1
		//fiboncci(n) = fibonacci(n-1) + fibonacci(n-2)
		if (num.equals(BigInteger.ZERO) || num.equals(BigInteger.ONE)) {
			return num;
		}else {
			return numberAt(num.subtract(BigInteger.ONE)).add(numberAt(num.subtract(TWO)));
		}
	}
	
	//get nth number of the fibi sequence using for loop, faster than recursion
	public static long fibi(long num) {
		long f0 = 0;
		long f1 = 1;
		long f2 = 1;
		if (num == f0) {return 0;}
		else if (num == f1) {return 1;}
		else if (num == f2) {return 1;}
		
		for (int i = 3;i <= num; i++) {
			f0 = f1;
			f1 = f2;
			f2 = f0 + f1;
		}
		return f2;
	}		
	
	//check if a number belongs to the fibi sequence
	public static boolean isFibi(int num) {
		double firstPossibility = Math.sqrt(5 * num * num + 4);
		double secondPossibility = Math.sqrt(5 * num * num - 4);
		if (firstPossibility == (int) firstPossibility || secondPossibility == (int) secondPossibility) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number for which the numberth term in the fibonacci sequence will be calculated");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt(); in.close();
		System.out.println("The " + num + "th number in the sequence is " + numberAt(BigInteger.valueOf(num)));
		System.out.println(fibi(num));
		System.out.println(isFibi(10));
	}

}
