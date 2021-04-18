package Matrix;

import Generics.Rational;

public class RationalMatrix extends GenericMatrix<Rational>{
	@Override //add two rational numbers
	protected Rational add(Rational r1, Rational r2) {
		return r1.add(r2);
	}
	
	@Override //multiply two rational numbers
	protected Rational multiply(Rational r1, Rational r2) {
		return r1.multiply(r2);
	}
	
	@Override //specify zero for a rational number
	protected Rational zero() {
		return new Rational(0, 1);
	}
	
}
