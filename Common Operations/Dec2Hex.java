

import java.util.Scanner;

public class Dec2Hex {

	public static void main(String[] args) {
		//read in one number can convert it into hexadecimal number (string form)
		//A = 10; B = 11; C = 12; D = 13; E = 14; F = 15
		Scanner in = new Scanner(System.in);
		int dec = in.nextInt();
		String hex = "";
		
		for( ; dec!=0 ; ) {
			int hexValue = dec % 16;
			//(char)(hexValue + '0') converts int value to a char between 0 and 9, inclusive
			//(char)(hexValue + 'A') converts int value to a char between A and F, inclusive
			char hexDigit = (0 <= hexValue && hexValue < 10) ? (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
			hex = hexDigit + hex; //to add to the front of the existing string
			dec /= 16;
		}
		System.out.println(hex);
	}

}
