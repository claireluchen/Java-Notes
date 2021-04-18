package Recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IsPalidrome2 {
	private static Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	private static String str = in.next();
	private static boolean boo = false;
	
	public static void main(String[] args) {
		palidrome(0);
		System.out.println(boo);
	}
	
	public static void palidrome(int num) {
		if (num == str.length() / 2) {
			boo = true; return;
		}else if (str.charAt(num) != str.charAt(str.length()-1-num)) {
			boo = false; return;
		}else{
			palidrome(++num);
		}
	}
	
	
	public static void isPalidrome(int low, int high) {
		if(high <= low) {
			boo = true; return;
		}else if (str.charAt(low) != str.charAt(high)) {
			boo = false; return;
		}else {
			isPalidrome(low + 1, high - 1);
		}
	}
}
