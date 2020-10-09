package Maximum;

import java.util.Arrays;

//generic class
public class Maximum<T extends Comparable<T>> {

	// generic method to find maximum which takes any number of arguments
	public static <T extends Comparable<T>> T maximum(T ... values) {
		Arrays.sort(values);
		T max=values[values.length-1];
		printMax(max);
		return max;
	}
	
	public static <T> void printMax(T max) {
		System.out.printf("Maximum :" +max);
		System.out.println("\n");
	}
}