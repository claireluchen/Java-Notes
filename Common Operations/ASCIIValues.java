
public class ASCIIValues {

	public static void main(String[] args) {
		for (int i = 31; i < 150; i++) {
			System.out.print(i + ": " + ((char) i) + "\t");
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}

}
