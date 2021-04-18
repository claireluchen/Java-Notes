import java.util.ArrayList;
import java.util.Scanner;
//get all prime factors, include duplicates
public class PrimeFactors {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		ArrayList<Integer> primeList = new ArrayList<>();
	  
        // n must be odd at this point.  So we can skip one element  
		for(int i = 2; i <= Math.sqrt(num); i++) {
			//if not wanting duplicates, add the following comments
//			if (num / i == 0) {
//				primeList.add(i);
				while(num % i == 0) {
		        	 primeList.add(i);
		        	 num /= i;
		         }
//			}	         
	    }
		if (num != 1) {
			primeList.add(num);
		}
		
		System.out.println(primeList);
	}

}
