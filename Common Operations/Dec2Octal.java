import java.util.Scanner;

//convert from decimal to octal number
public class Dec2Octal {

	public static void main(String[] args) {
		System.out.println("Please enter a number in decimal");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int oct = 0;
		for (int i = 0; ; i++) {
			int remainder = num % 8;
			num /= 8;
			oct += remainder * Math.pow(10, i);
			if (num <= 0) {
				break;
			}
		}
		System.out.println("The octal equivalent is: " + oct);
		
	}

}
