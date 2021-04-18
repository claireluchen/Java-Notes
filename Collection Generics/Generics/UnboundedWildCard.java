package Generics;
//<?> is a wildcard that represents any object type
//Note that even though Integer is a subtype of Object, GenericStack<Integer> is not a subtype of GenericStack<Object>
public class UnboundedWildCard {

	public static void main(String[] args) {
		GenericStack<Integer> intStack = new GenericStack<>();
		intStack.push(1);
		intStack.push(2);
		intStack.push(-1);
		
		print(intStack); //-1 2 1 
	}
	//prints objects and empties the stack
	public static void print(GenericStack<?> stack) {
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}
	
	
}
