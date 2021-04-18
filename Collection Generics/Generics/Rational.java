package Generics;

public class Rational extends Number implements Comparable<Rational>{
	//data fields for numerator and denominator
	private long numerator = 0;
	private long denominator = 1;
	
	//construct a rational with default properties
	public Rational() {
		this (0, 1);
	}
	
	//construct a rational with specified numerator and denominator
	//simply the fraction by finding the gcd and divide the numerator and denominator by it 
	public Rational(long numerator, long denominator) {
		long gcd = gcd(numerator, denominator);
		//keep the sign (+ or -) to the numerator, easier to compare afterwards
		this.numerator = (denominator > 0 ? 1 : -1) * numerator / gcd;
		this.denominator = Math.abs(denominator) / gcd;
	}
	
	//gcd() method to find greatest common divisor of two numbers
	private static long gcd(long n, long d) {
		long n1 = Math.abs(n);
		long n2 = Math.abs(d);
		int gcd = 1;
		for (int i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
	
	//return numerator
	public long getNumerator() {
		return numerator;
	}
	
	//return denominator
	public long getDenominator() {
		return denominator;
	}
	
	//add a rational number to this rational
	public Rational add(Rational secondRational) {
		long n = numerator * secondRational.getDenominator() + denominator * secondRational.getNumerator();
		long d = denominator * secondRational.getDenominator();
		return new Rational (n, d);
	}
	
	//subtract a rational number from this rational
	public Rational subtract(Rational secondRational) {
		long n = numerator * secondRational.getDenominator() - denominator * secondRational.getNumerator();
		long d = denominator * secondRational.getDenominator();
		return new Rational (n, d);
	}
	
	//multiply a rational number by this rational
	public Rational multiply(Rational secondRational) {
		long n = numerator * secondRational.getNumerator();
		long d = denominator * secondRational.getDenominator();
		return new Rational(n, d);
	}
	
	//divide a rational number by this rational
	public Rational divide(Rational secondRational) {
		long n = numerator * secondRational.getDenominator();
		long d = denominator * secondRational.getNumerator();
		return new Rational(n, d);
	}
	
	//override toString method in the Object class
	@Override
	public String toString() {
		if (denominator == 1) {
			return numerator + " ";
		}else {
			return numerator + " / " + denominator;
		}
	}
	
	//override the equals method in the Object class
	@Override
	public boolean equals(Object other) {
		if ((this.subtract((Rational)(other))).getNumerator() == 0){
			return true;
		}else {
			return false;
		}
	}
	
	//implement the abstract doubleValue method in Number
	@Override
	public double doubleValue() {
		return numerator * 1.0 / denominator;
	}
	
	//implement the abstract intValue method in Number
	@Override
	public int intValue() {
		return (int) doubleValue();
	}
	
	//implement the abstract floatValue method in Number
	@Override
	public float floatValue() {
		return (float) doubleValue();
	}
	
	//implement the abstract longValue method in Number
	@Override
	public long longValue() {
		return (long) doubleValue();
	}
	
	//implement the compareTo method in Comparable
	public int compareTo(Rational o) {
		//if positive, num > o; if negative, num < o; else num == o
		if (this.subtract(o).getNumerator()>0) {
			return 1;
		}else if (this.subtract(o).getNumerator()<0) {
			return -1;
		}else {
			return 0;
		}	
	}
	
	
}

