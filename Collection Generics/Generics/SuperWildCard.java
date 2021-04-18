package Generics;
//<? super T> represents type T or a supertype of T
public class SuperWildCard {

	public static void main(String[] args) {
		GenericStack<String> stack1 = new GenericStack<>();
		GenericStack<Object> stack2 = new GenericStack<>();
		stack2.push("Java");
		stack2.push(2);
		stack1.push("Sun");
		add(stack1, stack2); //Object is a superclass of String
		print(stack2); //Sun 2 Java 
	}

	public static <T> void add (GenericStack<T> stack1, GenericStack<? super T> stack2) {
		while (! stack1.isEmpty()) {
			stack2.push((T) stack1.pop());
		}
	}
	
	//prints objects and empties the stack
	public static void print(GenericStack<?> stack) {
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}
	
}
