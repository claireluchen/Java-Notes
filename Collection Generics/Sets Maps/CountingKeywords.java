package SetsMaps;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
For each word in a Java source file, determine whether the word is a keyword
Store all the Java keywords in a HashSet, since set is more efficient to determine whether an element is in it than a list.
Order doesn't matter, so no need to use LinkedHashSet
For each word read from the file, test whether it's in the set, using contains()
Keep track of count
 */
public class CountingKeywords {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Java source file");
		String filename = in.nextLine();
		in.close();
		
		File file = new File(filename);
		if (file.exists()) {
			System.out.println("There are " + countKeywords(file) + " keywords in the file");
		}else {
			System.out.println("The file does not exist");
		}
	}
	
	public static int countKeywords(File file) throws Exception{
		//Array of all Java keywords + true, false, null
		String[] keywordString = {"abstract", "assert", "boolean", "break", "byte", "case",
									"catch", "char", "class", "const", "continue", "default",
									"do", "double", "else", "enum", "extends", "for", "final",
									"finally", "float", "goto", "if", "implements", "import",
									"instanceof", "int", "interface", "long", "native", "new",
									"package", "private", "protected", "public", "return", "short",
									"static", "strictfp", "super", "switch", "synchronized", "this",
									"throw", "throws", "transient", "try", "void", "volatile",
									"while", "true", "false", "null"};
		//keyword set
		Set<String> keywordSet = new HashSet<>(Arrays.asList(keywordString));
		int count = 0;
		
		Scanner in = new Scanner(file);
		while(in.hasNext()) {
			String word = in.next();
			if (keywordSet.contains(word)) {
				count++;
			}
		}
		in.close();
		return count;
	}
}
