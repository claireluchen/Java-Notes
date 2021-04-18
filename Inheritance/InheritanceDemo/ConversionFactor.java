package LessonInheritance;

public class ConversionFactor {
	//since these constants are declared in a regular class, not an interface
	//the keywords "public static final" need to be used here to declare a constant
	//otherwise, in an interface, only need to write double INCHES_TO_CM = 2.54;
	public static final double INCHES_TO_CM = 2.54;
	public static final double YARDS_TO_M = .9144;
}
