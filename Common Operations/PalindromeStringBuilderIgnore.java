import java.util.Scanner;

//check if an input string is a palindrome, ignoring elements that are not a letter or digit
public class PalindromeStringBuilderIgnore {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine(); //enter a string
		//display whether it is a palindrome or not
		System.out.println("Ignoring nonalphanumeric characters, is the string a palindrome? " + isPalindrome(s));
				
	}
	
	//isPalindrome, shows true/false result
	public static boolean isPalindrome(String s) {
		String s1 = filter(s); //sending s to a method that removes all nonalphanum elements
		String s2 = reverse(s); //sending s to a method that reverses the string
		//return to main whether the string is a palindrome or not
		return s2.equals(s1);		
	}

	//remove all nonalphanumber elements
	public static String filter(String s) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetterOrDigit(s.charAt(i))){
				stringBuilder.append(s.charAt(i));
			}
		}
		return stringBuilder.toString();
	}
	
	//reverse the string
	public static String reverse(String s) {
		StringBuilder stringBuilder = new StringBuilder(s);
		stringBuilder.reverse(); //invoke reverse in StringBuilder
		return stringBuilder.toString();
	}
}
