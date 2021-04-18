package Recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class FactorialCalculatorBigInt {
	//recursive method factorial (assumes its parameter is >= 0)
	public static BigInteger factorial(BigInteger number) {
		if (number.compareTo(BigInteger.ONE) <= 0) { //test for base case
			return BigInteger.ONE; //base cases: 0! = 1 and 1! = 1
		}else { //recursion step
			return number.multiply(factorial(number.subtract(new BigInteger("1"))));
		}		
	}
		
	public static void main(String[] args) {
		System.out.println("Enter a number to calculate the factorial of");
		Scanner in = new Scanner (new BufferedReader(new InputStreamReader(System.in)));
		BigInteger num = BigInteger.valueOf(in.nextInt());
		System.out.println("The factorial of " + num + " is " + factorial(num));
		in.close();
	}

}
