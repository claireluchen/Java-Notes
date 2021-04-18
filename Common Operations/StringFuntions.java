import javafx.geometry.Point2D;

public class StringFuntions {

	public static void main(String[] args) {
		/*
		'0' to '9' => 48 to 57
		'A' to 'Z' => 65 to 90
		'a' to 'z' => 97 to 122
		\b means backspace
		\t means tab
		\n means line feed, starts a new line
		\f means form feed, printer starts a new page
		\r means carriage return, cursor moving to the beginning of the line
		\\ printing a backslash "\"
		\"" printing double quote ""			
		 */
		
		//Point2D class in the javafx.geometry is used to represent a point in a 2D plane
		int x1 = 5, y1 = 4, x2 = 3, y2 = 2;
		Point2D p1 = new Point2D(x1, y1);
		Point2D p2 = new Point2D(x2, y2);
		System.out.println(p1.midpoint(p2)); //Point2D [x = 4.0, y = 3.0]
		System.out.println(p1.distance(p2)); //2.8284271247461903
		
		//when an integer is cast into a char, only lower 16 bits of data are used
		//the lower 16 bits hex code 0041 is assigned to ch
		char ch = (char) 0XAB0041; //A
		//when floating point turned into char, the float is first cast into int
		ch = (char) 65.25; //A
		//casting char into int
		int i = (int) 'A'; //65
		i = '2' + '3'; //101 since '2' is 50 and '3' is 51
		i = 2 + 'a'; //93
		ch = (char) i; //'c'
		
		//Methods in Character class
		//returns true if it's a digit
		Character.isDigit('1'); //true
		//returns true if it's a letter
		Character.isLetter('1'); //false
		//returns true if it's a digit or letter
		Character.isLetterOrDigit('1'); //true
		//returns true if it's a lower case letter
		Character.isLowerCase('a'); //true
		//returns true if it's a upper case letter
		Character.isUpperCase('a'); //false
		//returns the lower case of a character
		Character.toLowerCase('A'); //a
		//returns the upper case of a character
		Character.toUpperCase('a'); //A
		
		//Methods in String class
		//returns number of chars
		"abc".length(); //3
		//returns char at specified index
		"abc".charAt(0); //a
		//returns a new string concatenated
		"abc".concat("abc"); //abcabc
		String str = "abc"+"abc"; //abcabc
		//letters in upper case
		"abc".toUpperCase(); //ABC
		//letters in lower case
		"ABC".toLowerCase(); //abc
		//returns a new string with whitespace trimmed on both sides
		"  abc  ".trim(); //abc
		
		//Comparison for Strings
		//returns true if two strings have same content
		"abc".equals("abc"); //true
		//returns true if two strings have same content, case insensitive
		"abc".equalsIgnoreCase("ABC"); //true
		//returns an int that indicate whether the lexicographical of the string is >, =, < than s1
		"abc".compareTo("ABC"); //32
		"abc".compareTo("bcd"); //-1
		//same as compareTo, case insensitive
		"abc".compareToIgnoreCase("ABC"); //0
		//returns true if the string starts with the prefix
		"abc".startsWith("a"); //true
		//returns true if the string ends with the suffix
		"abc".endsWith("a"); //false
		//returns true if s1 is a substring in the string
		"abcde".contains("abc"); //true
		//returns the string's substring [begin index, end]
		"abc".substring(1); //bc
		//returns the string's substring [begin index, end)
		"abcde".substring(1, 4); //bcd
		//returns the index of the first/last occureence of ch in the string. -1 if not matched
		//can also find the index of the first substring
		"abc".indexOf('a'); //0
		"abca".lastIndexOf('a'); //3
		//returns the index of the first/last occureence of ch after indicated index. -1 if not matched
		//can also find the index of a substring
		"abca".indexOf('a', 1); //3
		"abca".lastIndexOf('a', 3); //3
		//returns a new string that replaces all matching chars in this string with the new char
		"abca".replace('a', 'd'); //dbcd
		//returns a new string that replaces the first/all matching substring with the new substring
		"abcabc".replaceFirst("abc", "d"); //dabc
		"abcabc".replaceAll("abc", "d"); //dd
		//returns an array of strings consisting of the substrings split by the delimiter
		"abc abc".split(" "); //[abc, abc]
		
		//convert a string into an array of chars
		char[] chars = "HelloWorld".toCharArray();
		//copies a substring of the string from index srcBegin to index srcEnd-1 into a character array starting from index arrayBegin
		//getChars(int srcBegin, int srcEnd, char[] array, int arrayBegin)
		"Java".getChars(0, 3, chars, 5); //HelloJava
		//convert primitive type into string
		String temp = String.valueOf(new char[] {'J','A','V','A'});
		
		//StringBuilder, StringBuffer
		StringBuilder stringBuilder = new StringBuilder();
		//appends a char
		stringBuilder.append("Welcome"); 
		stringBuilder.append(' '); 
		stringBuilder.append("to"); 
		stringBuilder.append(' '); 
		stringBuilder.append("Java");
		//stringBuilder becomes Welcome to Java
		//deletes chars from startIndex to endIndex-1
		stringBuilder.delete(0, 7); // to Java
		//deletes char at a specific index
		stringBuilder.deleteCharAt(0); //to Java
		//inserts a string/primitive type into the builder at the position offset
		stringBuilder.insert(0, "Welcome ");
		//replace the chars form startIndex to endIndex - 1 with the specified string
		stringBuilder.replace(8, 15, "Home"); //Welcome Home
		//reverse the characters in the builder
		stringBuilder.reverse(); //emoH emocleW
		//returns a String object
		stringBuilder.toString(); 
		//returns the capacity of the builder
		stringBuilder.capacity(); //16
		//returns the char at the index
		stringBuilder.charAt(0); //e
		//returns the number of characters in the builder
		stringBuilder.length(); //12
		//set a new lenth in this builder
		stringBuilder.setLength(10); //emoH emocl
		//return a substring
		stringBuilder.substring(0, 3); //emo
		//reduces the storage size for string builder
		stringBuilder.trimToSize();
		
	}

}
