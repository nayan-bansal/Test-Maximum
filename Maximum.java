package Maximum;

import java.util.Arrays;

public class Maximum<T extends Comparable<T>> {

	// generic method to find maximum which takes any number of arguments
	public static <T extends Comparable<T>> T maximum(T ... values) {
		Arrays.sort(values);
		T max=values[values.length-1];
		return max;
	}
}