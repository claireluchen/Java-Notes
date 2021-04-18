package Recursion;

public class IsPalidrome {
	public static boolean isPalidrome(String str) {
		if (str.length() <= 1) { //base case, str.length() == 1 if original string is odd, str.length() == 0 if original string is even
			return true;
		}
		
		if (str.charAt(0) == str.charAt(str.length() - 1)) { //check whether two ends match
			return isPalidrome(str.substring(1, str.length() - 1)); //ignore the two ends, pass in rest of string
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(isPalidrome("abba")); //pass in a palidrome
	}

}
