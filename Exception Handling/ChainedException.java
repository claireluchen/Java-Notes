
public class ChainedException {

	public static void main(String[] args) {
		try {
			method1();
		}
		catch (Exception ex) {
			System.out.println(ex); //java.lang.Exception: New info from method1
			ex.printStackTrace();
			/*
			java.lang.Exception: New info from method1
				at ChainedException.method1(ChainedException.java:30)
				at ChainedException.main(ChainedException.java:6)
			Caused by: java.lang.Exception: New info from method2
				at ChainedException.method2(ChainedException.java:35)
				at ChainedException.method1(ChainedException.java:26)
				... 1 more
			 */
		}
		
	}
	
	public static void method1() throws Exception{
		try {
			method2();
		}
		catch (Exception ex) {
			//chained exception
			throw new Exception ("New info from method1" , ex);
		}
	}

	public static void method2() throws Exception{
		throw new Exception ("New info from method2");
	}
}
