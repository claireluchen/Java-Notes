package CTYLesson;

public class DivideByZeroException extends Exception{
	private int num;
	
	public DivideByZeroException() {
		
	}
	
	public DivideByZeroException(int d) {
		super ("divide by zero");
		num = d;
	}
	
	public DivideByZeroException(String s) {
		super(s);
	}
	
	public int getNum() {
		return num;
	}
	
	
}
