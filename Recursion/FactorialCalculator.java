package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FactorialCalculator {
	//recursive method factorial (assumes its parameter is >= 0)
	public static long factorial(long number) {
		if (number <= 1) { //test for base case
			return 1; //base cases: 0! = 1 and 1! = 1
		}else { //recursion step
			return number * factorial(number - 1);
		}		
	}
	
	public static long factorial(int n, int result) {
		if (n == 0) {
			return result;
		}else {
			return factorial(n-1, n * result);
		}
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println("Enter a number to calculate the factorial of");
		Scanner in = new Scanner (new BufferedReader(new InputStreamReader(System.in)));
		int num = in.nextInt();
		System.out.println("The factorial of " + num + " is " + factorial(num));
		in.close();
	}

}
