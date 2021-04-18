import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		//create an array
		String[] names = {"John", "Peter", "Susan", "Kim", "Jen", "George", "Alan", "Stacy", "Michelle", "John"};
		
		//display the first four names sorted
		Stream.of(names).limit(4).sorted().forEach(e -> System.out.print(e + " "));
		
		//skip four names and display the rest sorted ignore case
		System.out.println();
		Stream.of(names).skip(4).sorted((e1, e2) -> e1.compareToIgnoreCase(e2)).forEach(e -> System.out.print(e + " "));
		
		//same as above, except with method reference
		System.out.println();
		Stream.of(names).skip(4).sorted(String::compareToIgnoreCase).forEach(e-> System.out.print(e + " "));
		
		//filter, method reference
		//largest string with length > 4
		System.out.println(Stream.of(names).filter(e -> e.length() > 4).max(String::compareTo).get());
		
		//smallest string alphabetically
		System.out.println(Stream.of(names).min(String::compareTo).get());
		
		//check is "Stacy" is in names
		System.out.println(Stream.of(names).anyMatch(e -> e.equals("Stacy")));
		
		//check if all names start with a capital letter
		System.out.println(Stream.of(names).allMatch(e -> Character.isUpperCase(e.charAt(0))));
		
		//check if no name begins with "Ko"
		System.out.println(Stream.of(names).noneMatch(e -> e.startsWith("Ko")));
		
		//number of distinct case-insensitive strings
		System.out.println(Stream.of(names).map(e -> e.toUpperCase()).distinct().count());
		
		//first element in this stream in lower case
		System.out.println(Stream.of(names).map(String::toLowerCase).findFirst().get());
		
		//skip 4 and get any element in this stream
		System.out.println(Stream.of(names).skip(4).sorted().findAny().get());
		
		Object[] namesInLowerCase = Stream.of(names).map(String::toLowerCase).toArray();
		System.out.println(Arrays.toString(namesInLowerCase));
	}

}
