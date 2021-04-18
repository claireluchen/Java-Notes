import java.util.Scanner;

//Converts a hex string to a decimal integer
public class Hex2Dec {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int dec = 0;
		int length = str.length();
		int index = length - 1;
		
		for (int i = 0; i < length; i++) {
			if (str.charAt(index-i) == 'A') {
				dec += 10 * Math.pow(16, i);
			}else if (str.charAt(index-i) == 'B') {
				dec += 11 * Math.pow(16, i);
			}else if (str.charAt(index-i) == 'C') {
				dec += 12 * Math.pow(16, i);
			}else if (str.charAt(index-i) == 'D') {
				dec += 13 * Math.pow(16, i);
			}else if (str.charAt(index-i) == 'E') {
				dec += 14 * Math.pow(16, i);
			}else if (str.charAt(index-i) == 'F') {
				dec += 15 * Math.pow(16, i);
			}else {
				if (i == 0) {
					dec += Integer.parseInt(str.substring(index)) * Math.pow(16, i);
				}else if (i == length-1) {
					dec += Integer.parseInt(str.substring(0, 1)) * Math.pow(16, i);
				}else {
					dec += Integer.parseInt(str.substring(index-i, index-i+1)) * Math.pow(16, i);
				}
			}
		}
		
		System.out.println(dec);
	}

}
