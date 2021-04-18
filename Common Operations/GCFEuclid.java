
public class GCFEuclid {
	//find gcf of two numbers, num1 > num2
	public static int gcf(int num1, int num2) {
//		return (num1 % num2) == 0 ? num2 : gcf(num2, num1 % num2);
		if (num1 % num2 == 0) {
			return num2;
		}else {
			return gcf(num2, num1 % num2);
		}		
	}
	public static void main(String[] args) {
		System.out.println(gcf(99, 22));
	}

}
