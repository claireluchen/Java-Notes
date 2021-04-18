
public class CommonRegex {

	public static void main(String[] args) {
		//remove punctuation from a string
		String str = "1dgsa!%2favd";
		str = str.replaceAll("\\p{Punct}", ""); //1dgsa2favd
		System.out.println(str);
		//remove all non-letter from a string
		str = "1dgsa!%2favd";
		str = str.replaceAll("[^a-zA-Z ]", ""); //dgsafavd
		System.out.println(str);
				
	}

	//check if a string is a number (0 to 9)
	public static boolean isNumeric(String str) {
		  return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
	}
}
