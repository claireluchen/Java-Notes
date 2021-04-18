package Matrix;

import Generics.Rational;

public class TestRationalMatrix {

	public static void main(String[] args) {
		//create Integer arrays m1, m2
		Rational[][] m1 = new Rational[3][2];
		Rational[][] m2 = new Rational[2][3];
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				m1[i][j] = new Rational(i+1, j+5);
			}
		}
		
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[0].length; j++) {
				m2[i][j] = new Rational(i+1, j+6);
			}
		}
				
		//create an instance of IntegerMatrix
		RationalMatrix rationalMatrix = new RationalMatrix();
				
		//addition
		System.out.println("\nm1 + m2 is ");
		GenericMatrix.printResult(m1, m2, rationalMatrix.addMatrix(m1, m2), '+');
				
		//multiplication
		System.out.println("\nm1 * m2 is ");
		GenericMatrix.printResult(m1, m2, rationalMatrix.multiplyMatrix(m1, m2), '*');
		
	}
		
}
