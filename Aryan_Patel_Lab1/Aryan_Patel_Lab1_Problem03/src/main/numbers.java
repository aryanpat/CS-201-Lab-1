package main;

//Declare my 4 numbers
//Add 4 numbers for sum
//Divide sum by 4 for average

public class numbers {

	public static void main(String[] args) {
		
		byte num1 = 3;
		byte num2 = 7;
		byte num3 = 11;
		byte num4 = 1;
		
		float sum = num1 + num2 + num3 + num4;
		float average = sum / 4;
		
		System.out.println("The average is: " + average);
		
		float num5 = num1 - average;
		float num6 = num2 - average;
		float num7 = num3 - average;
		float num8 = num4 - average;
		
		float num9 = num5 * num5;
		float num10 = num6 * num6;
		float num11 = num7 * num7;
		float num12 = num8 * num8;
		
		float sumSquare = num9 + num10 + num11 + num12;
		
		int N = 4;
		int n = N - 1;
		
		
		float variance = sumSquare / n;
		
		System.out.println("The variance is: " + variance);
		
		
		
		
				
	}

}
