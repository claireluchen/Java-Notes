import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {

	public static void main(String[] args) {
		//to combine strings into a StringBuilder, you may write the code using a collect method
		String[] names = {"John", "Peter", "Susan", "Kim", "Jen"};
		//use a StringBuilder and accumulate the result
		//three functional arguments: 1) supplier function to construct a new instance of the result container
		//2) an accumulator function to incorporate the elements from the stream to the result container
		//3) a combining function to merge the contents of one result container into another
		StringBuilder sb = Stream.of(names).collect(() -> new StringBuilder(), (c, e) -> c.append(e), (c1, c2) -> c1.append(c2));
		System.out.println(sb); //JohnPeterSusanKimJen
		
		//the lambda expression () -> new StringBuilder() creates a StringBuilder object for storing the result
		//can be simplified using the method reference StringBuilder::new
		//(c, e) -> c.append(e) and (c1, c2) -> c1.append(c2) become StringBuilder::append
		//when executing, multiple StringBuilder are created then merged using a combiner function
		//the purpose of the combiner is for parallel processing
		sb = Stream.of(names).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
		System.out.println(sb);
		
		//sequential foreach loop
		sb = new StringBuilder();
		//note that the third argument, (c1, c2) -> c1.append(c2) is not used in sequential implementation
		//it's used when the stream pipeline is executed in parallel
		for (String s: names) {
			sb.append(s); 
		}
		System.out.println(sb);
		
		//a Collector interface defines the methods for returning a supplier, an accumulator, and a combiner
		//static factory method toList() in the Collectors class creates an instance of the Collector interface
		List<String> list = Stream.of(names).collect(Collectors.toList());
		System.out.println(list); //[John, Peter, Susan, Kim, Jen]
		
		//get the number of characters for all names
		Stream.of(names).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).length();
		
		//collect into ArrayList
		List<String> list2 = Stream.of(names).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		System.out.println(list2);
		
		//Collectors.toList()
		list2 = Stream.of(names).collect(Collectors.toList());
		System.out.println(list2);
		
		//Collectors.toSet()
		Set<String> set = Stream.of(names).map(e -> e.toUpperCase()).collect(Collectors.toSet());
		System.out.println(set);
		
		//Collectors.toMap()
		Map<String, Integer> map = Stream.of(names).collect(Collectors.toMap(e -> e, e -> e.length()));
		System.out.println(map);
		
		//total number of characters is
		Stream.of(names).collect(Collectors.summingInt(e -> e.length())); //sum of integers
		
		//summary information
		IntSummaryStatistics stats = Stream.of(names).collect(Collectors.summarizingInt(e -> e.length()));
		//max
		System.out.println(stats.getMax());
		//min
		System.out.println(stats.getMin());
		//average
		System.out.println(stats.getAverage());
		
	}

}
