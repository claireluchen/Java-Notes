package Generics;
//? extends T is called a bounded wildcard, represents T or a subtype of T.
//<? Extends Number> is a wildcard type that represents Number or a subtype of Number
public class BoundedWildCard {

	public static void main(String[] args) {
		GenericStack<Integer> intStack = new GenericStack<>();
		intStack.push(1);
		intStack.push(0);
		intStack.push(-1);
		
		System.out.println("The max is " + max(intStack));
	}
	//find the maximum in a stack of numbers, using bounded wildcard
	public static double max(GenericStack<? extends Number> stack) {
		double max = ((Number) stack.pop()).doubleValue();
		
		while(!stack.isEmpty()) {
			double value = ((Number) stack.pop()).doubleValue();
			if (value > max) {
				max = value;
			}
		}
		return max;		
	}	
}
