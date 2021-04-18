package Recursion;

import java.math.BigInteger;

public class Sum {
	//calculate the sum of 1 + 2 + ... + n
	public static BigInteger sum(BigInteger n) {
		if (n.equals(BigInteger.ONE)) { //base case
			return BigInteger.ONE;
		}else {
			return n.add(sum(n.subtract(BigInteger.ONE)));
		}
	}
	
	public static void main(String[] args) {
		System.out.println(sum(new BigInteger("10")));
	}

}
