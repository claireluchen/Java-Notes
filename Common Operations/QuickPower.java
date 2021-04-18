public class QuickPower {
	//calculate the power after modulation. Ex: 2 ^ 4 -> 6
	public static int powAfterMod(int base, int exp, int mod) {
		if (exp == 0) { //if exponent = 0
			return 1;
		}else {
			int temp = powAfterMod(base, exp / 2, mod);
			temp = temp * temp % mod;
			if (exp % 2 == 0) { //if the exponent is even
				return temp;
			}else { //if the exponent is odd
				return temp * base % mod;
			}
		}
	}
	
	//calculate the power
	//the algorithm uses the fact that b ^ e = (b ^ (e/2)) ^2
	//if e is even, then e / 2 works
	//if e is odd, then e / 2 is rounded down. Ex: if e = 3, e / 2 = 1, same as (e - 1) / 2, so a base is lost
	//if e is odd, we'd need to do ((b ^ (e/2)) ^ 2) * b
	public static int pow(int base, int exp) {
		if (exp == 0) { //if exponent = 0
			return 1;
		}else {
			int temp = pow(base, exp / 2);
			temp = temp * temp;
			if (exp % 2 == 0) { //if the exponent is even
				return temp;
			}else { //if the exponent is odd
				return temp * base;
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(powAfterMod(2, 4, 10));
		System.out.println(pow(2, 4));
	}

}
