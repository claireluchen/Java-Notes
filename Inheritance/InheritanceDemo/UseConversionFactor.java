package LessonInheritance;

//importing the ConversionFactor class defined in Interface so that all of its constants can be accessed
import static Interface.ConversionFactor.*;

public class UseConversionFactor {

	public double getYardsToMeter(double y) {
		//same as return y * Interface.ConversionFactor.YARDS_TO_M; (without using import statement)
		return y * YARDS_TO_M;
		//or accessing the constant by PackageName.ClassName.ConstantName
		//return y * ConversionFactor.YARDS_TO_M; (using ConversionFactor defined in this package)
	}
		
	
	public static void main(String[] args) {
		UseConversionFactor convert = new UseConversionFactor();
		System.out.println(convert.getYardsToMeter(100));
	}

}



