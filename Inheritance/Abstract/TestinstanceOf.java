package LessonAbstract;

public class TestinstanceOf {
	public static void main(String[] args) {
		//an array of 2 elements
		Animal[] array = {new Robin(), new Chiwawa()};
		for (int i = 0; i < array.length; i++) {
			if (array[i] instanceof Robin) {
				((Robin) array[i]).chirp();
			}else {
				((Chiwawa) array[i]).bark();
			}
		}
		/*
		chirp
		bark
		 */
		
	}
}
