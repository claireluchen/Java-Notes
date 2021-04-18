package CTYLesson;

import java.util.Scanner;

public class ThrowInvalidIndexException {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int num = in.nextInt();
		try {
			if (num >= str.length()) {
				//throwing an exception
				throw new IndexOutOfBoundsException("invalid index");
			}else {
				System.out.println(str.charAt(num));
			}
		}
		catch (IndexOutOfBoundsException ex) {
			System.out.println(ex); //java.lang.IndexOutOfBoundsException: invalid index
			System.out.println("IndexOutOfBoundsException caught"); //IndexOutOfBoundsException caught
		}
		
		
	}

}
