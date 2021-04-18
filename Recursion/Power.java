package Recursion;

import java.math.BigInteger;

public class Power {
	//calculate x ^ n
	public static BigInteger calculate(BigInteger x, BigInteger n) {
		if (n.equals(BigInteger.ZERO)) {
			return BigInteger.ONE;
		}else {
			return x.multiply(calculate(x, n.subtract(BigInteger.ONE)));
		}
	}
	
	public static void main(String[] args) {
		System.out.println(calculate(new BigInteger("2"), new BigInteger("3")));
	}

}
