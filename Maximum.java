package Maximum;


public class Maximum {

	public static  int Max_number(int num1, int num2, int num3) {
		int max = num1;
		if (num2 > num1) {
			max = num2;
		}
		if (num3 > max) {
			max = num3;
		}
		printMaxInteger(num1, num2, num3, max);	
		
		return max;
			
		}
	
	public static  float Max_number_float(float num1, float num2, float num3) {
		float max = num1;
		if (num2 > num1) {
			max = num2;
		}
		if (num3 > max) {
			max = num3;
		}
		printMaxFloat(num1, num2, num3, max);	
		
		return max;
			
		}
	

		private static void printMaxFloat(float num1, float num2, float num3, float max) {
			System.out.printf("Max of %.2, %.2f and %.2f is  %d\n", num1, num2, num3, max);
		
	}

		public static void printMaxInteger(int num1, int num2, int num3, int max) {
			System.out.printf("Max of %d, %d and %d is  %d\n", num1, num2, num3, max);
		}
}