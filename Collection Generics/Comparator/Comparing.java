import java.util.*;

public class Comparing {

	public static void main(String[] args) {
		/*
		Comparator.comparing(e -> e.length()) uses a lambda expression
		Comparator.comparing(String::length) uses a method reference
		Comparator.comparing(
			new java.util.function.Function<String, Integer>(){
				public Integer apply(String s){
					return s.length();
				}
			}
		) uses an anonymous inner class
		 */
		
		//sorts a list of Loan objects based on their sum property, in ascending order
		Loan[] list = {new Loan(5.5, 10, 2323), new Loan(5, 10, 1000)};
		Arrays.sort(list, Comparator.comparing(Loan::getSum)); //comparing method
		for (Loan l : list) {
			System.out.println(l.getSum());
		}
		
		//sorts a list of Loan objects based on their sum property, in descending order
		Arrays.sort(list, Comparator.comparing(Loan::getSum).reversed());
		for (Loan l : list) {
			System.out.println(l.getSum());
		}
		
		//sort using a primary, second, third criteria using the Comparator's default thenComparing method
		Arrays.sort(list, Comparator.comparing(Loan::getSum).thenComparing(Loan::getInterest).thenComparing(Loan::getYear));
		for (Loan l : list) {
			System.out.println(l.getSum() + " " + l.getInterest() + " " + l.getYear());
		}
		
	}
	
	static class Loan implements Comparator<Loan>{
		private double sum;
		private double interest;
		private int year;
		public Loan(double a, int b, double c) {
			interest = a;
			year = b;
			sum = c;
		}
		public double getSum() {
			return sum;
		}
		public double getInterest() {
			return interest;
		}
		public int getYear() {
			return year;
		}
		@Override
		public int compare(Loan o1, Loan o2) {
			if (o1.getSum() > o2.getSum()) {
				return 1;
			}else if (o1.getSum() == o2.getSum()){
				return 0;
			}else {
				return -1;
			}
		}

	}

}
