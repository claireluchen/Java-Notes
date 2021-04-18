import java.util.Scanner;

public class DonatingBaseNum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//to donate a binary integer literal, use a leading 0b or 0B
		System.out.println(0b1110); //14
		//to donate an octal integer literal, use a leading 0
		System.out.println(01110); //584
		//to donate a hexadecimal integer literal, use a leading 0x or 0X
		System.out.println(0x1110); //4368
		
	}

}
