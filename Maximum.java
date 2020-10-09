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

		public static void printMaxInteger(int num1, int num2, int num3, int max) {
			System.out.printf("Max of %d, %d and %d is  %d\n", num1, num2, num3, max);
		}
}
