package Generics;

public class GenericStack<E> { //generic type E declared
	private java.util.ArrayList<E> list = new java.util.ArrayList<>();
	
	public GenericStack() {} //default constructor
	
	//getSize
	public int getSize() {
		return list.size();
	}
	
	//top element in the stack
	public E peek() {
		return list.get(getSize()-1);
	}
	
	//adds a new element to the top of the stack
	public void push(E o) {
		list.add(o);
	}
	
	//returns the element at the top of the stack and removes it
	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize()-1);
		return o;	
	}
	
	//returns true if the stack is empty
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
	
	public static void main(String[] args) {
		GenericStack<String> stack1 = new GenericStack<>(); //stack to hold strings
		stack1.push("London");
		stack1.push("Paris");
		stack1.push("Berlin");
		System.out.println(stack1.peek());
		
		GenericStack<Integer> stack2 = new GenericStack<>(); //stack to hold integers
		stack2.push(1); //1 is autoboxed to new Integer(1)
		stack2.push(2);
		stack2.push(3);
		System.out.println(stack2.peek());
	}


}
