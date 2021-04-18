import java.util.Scanner;

public class AllWaysToGetSum {
	private static Scanner in = new Scanner(System.in);
	private static int n = in.nextInt(); //get the sum we're aiming for
	private static int counter = 0; //keep track of the number of ways we could reach the sum
	//prev = previous number, each number after >= prev
	//sum = sum of the current numbers
	//ans = string of numbers and "+"
	public static void fun(int prev, int sum, String ans) {
		if (sum == n) { //if sum has reached the sum we're aiming for
			System.out.println(ans);
			counter++; //add one to the counter
			return;
		}
		for (int i = prev; i + sum <= n; i++) {
			//call itself again while making sure the sum isn't over the expected
			fun(i, sum + i, ans + "+" + i); 
		}
	}
	public static void main(String[] args) {
		//iterate n / 2 times so that cases like 6 = 4 + 2 wouldn't happen (only keep 6 = 2 + 4)
		for (int i = 1; i <= n / 2; i++) {
			fun(i, i, n + "=" + i);
		}
		System.out.println(counter);
	}

}
