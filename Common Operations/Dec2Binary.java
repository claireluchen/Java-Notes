import java.util.Scanner;

public class Dec2Binary {

	public static void main(String[] args) {
		//Convert a decimal number to a binary number
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		int bi = 0;
		
		for (int i = 1; input >= 1; i++) {
			int temp = input % 2;
			bi += temp * Math.pow(10, i-1);
			input /= 2;			
		}
		System.out.println(bi);
	}

}
