package Recursion;

public class IsEven {

	public static boolean isEven(int num) {
		if (num == 1) { //base case
			return false;
		}else { //if even, this block should be executed an odd number of times to reach 1, returning true
			//if odd, this block should be executed an even number of times to reach 1, returning false
			return !isEven(num - 1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(isEven(4));
	}

}
