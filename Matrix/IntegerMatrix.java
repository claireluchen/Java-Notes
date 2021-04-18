package Matrix;

public class IntegerMatrix extends GenericMatrix<Integer> { //extends generic type, specifies that it's Integer
	@Override //add two integers, overridewhat is implemented for Integer objects
	protected Integer add(Integer o1, Integer o2) {
		return o1 + o2;
	}
	
	@Override //multiply two integers
	protected Integer multiply(Integer o1, Integer o2) {
		return o1*o2;
	}
	
	@Override //specify zero for an integer
	protected Integer zero() {
		return 0;
	}
	
}
