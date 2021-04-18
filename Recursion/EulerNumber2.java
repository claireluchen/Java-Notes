package Recursion;

import java.util.Scanner;

public class EulerNumber2 {
	//recursive method factorial (assumes its parameter is >= 0)
	private static long factorial(int number) {
		if (number == 0 || number == 1) { //test for base case
			return 1; //base cases: 0! = 1 and 1! = 1
		}else { //recursion step
			return number * (factorial(number - 1));
		}		
	}
		
	//calculate the product of 0! * 1! * ... * n!
	//used as the denominator
	private static long productOfFactorial(int n) {
		if (n == 0) {
			return 1;
		}else {
			return factorial(n) * (productOfFactorial(n - 1)); 
		}
	}
		
	//calculate the numerator of the division
	//for each term, productOfFactorial(n) / factorial(n)
	//add the terms together and return the final sum
	//current should always start with 0
	private static long numerator(int current, int n) {
		if (current == n) {
			return productOfFactorial(n) / (factorial(current));
		}else {
			return (productOfFactorial(n) / (factorial(current))) + (numerator(current + 1, n));
		}
	}
	
	public static double eulerNumber(int n) {
		return ((double) numerator(0, n)) / (productOfFactorial(n));
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter n, for which the Euler's number will be calculated: ");
		int n = in.nextInt();
		in.close();
		double result = eulerNumber(n);
		System.out.printf("Euler number is %.5f", result);
	}

}
