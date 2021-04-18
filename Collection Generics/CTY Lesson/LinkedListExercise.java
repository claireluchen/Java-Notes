package Lesson;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/*
Customer class, name and a randomly generated waiting time
ask user to add customer or quit
display elements in first-in, first-out queue form
 */
public class LinkedListExercise {

	public static void main(String[] args) {
		LinkedList<Customer> list = new LinkedList<>();
		Scanner in = new Scanner(System.in);
		Random gen = new Random();

		for (;;) {
			System.out.println("Add Customer or quit");
			String input = in.next();
			if (input.contentEquals("add")) {
				System.out.println("Enter name");
				String name = in.next();
				int num = gen.nextInt(20) + 1;
				list.add(new Customer(name, num));
			}else {
				System.out.println("Customer's information");
				list.forEach(e -> System.out.println(e.getName() + ": " + e.getTime()));				
				in.close();
				break;
			}
		}
			
	}
	
}

class Customer{
	private String name;
	private int time;
	public Customer(String name, int time) {
		this.name = name;
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public int getTime() {
		return time;
	}
}