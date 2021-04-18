import java.util.Scanner;
/*
Modular Arithmetic
Addition property: (a + b) mod n = (a mod n + b mod n) mod n
Subtraction property: (a - b) % n = (a % n - b % n) % n
Multiplication property: (a * b) % n = (a % n * b % n) % n
 */
//give 4 inputs, first 3 are first 3 numbers of the sequence
//determine if it's arithmetic or geometric and calculate the number at nth position
public class ArithmeticGeoMod {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt(); in.close();
		if (b - a == c - b) { //if arithmetic
			System.out.println(a + (d-1) * (b-a));
		}else if (b / a == c / b){ //if geometric
			System.out.println(a * pow(b/a, d-1));
		}else { //if neither
			System.out.println("Neither");
		}		
	}
	
	public static long pow(int base, int exp) {
		if (exp == 0) {
			return base;
		}else if (exp % 2 == 0) {
			return pow(base, exp / 2) * pow(base, exp / 2);
		}else {
			return base * pow(base, exp / 2) * pow(base, exp / 2);
		}
	}
	
}