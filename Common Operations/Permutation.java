import java.util.ArrayList;

public class Permutation {
	private static ArrayList<String> list = new ArrayList<>();

	 // Function to print all the permutations of str 
    static void printPermutn(String str, String ans) 
    { 
  
        // If string is empty 
        if (str.length() == 0) { 
        	list.add(ans);
            System.out.print(ans + " "); 
            return; 
        } 
  
        for (int i = 0; i < str.length(); i++) { 
  
            // ith character of str 
            char ch = str.charAt(i); 
  
            // Rest of the string after excluding  
            // the ith character 
            String ros = str.substring(0, i) +  
                         str.substring(i + 1); 
  
            // Recurvise call 
            printPermutn(ros, ans + ch); 
        } 
    } 
	
	public static void main(String[] args) {
		printPermutn("abc", "");
		System.out.println();
		for (int i = 0; i < list.size(); i++) {System.out.print(list.get(i) + " ");}
	}

}
