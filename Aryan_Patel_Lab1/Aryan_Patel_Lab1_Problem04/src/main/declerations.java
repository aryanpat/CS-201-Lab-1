package main;

public class declerations {

	public static void main(String[] args) {
		
		int inch = 1;
		int feet = 12 * inch;
		
		byte myFeet = 5;
		byte myInch = 8;
		
		int myFeetToInch = myFeet * feet;
		int totalInches = myFeetToInch + myInch;
		
		System.out.println("My total height in inches is " + totalInches + " inches.");
		
		
		float adultTicket = 11;
		float kidsTicket = adultTicket / 2;
		
		byte adultsComing = 3;
		byte kidsComing = 2;
		
		float adultBuy = adultsComing * adultTicket;
		float kidsBuy = kidsComing * kidsTicket;
		
		float totalCost = adultBuy + kidsBuy;
		
		System.out.println("The total cost for movie tickets is $" + totalCost + ".");
		
		
		int yearlyPay = 47500;
		float monthlyPay = yearlyPay / 12;
		
		double tax = 0.29;
		double deduction = monthlyPay * tax;
		
		double takeHome = monthlyPay - deduction;
		float convert = (float)takeHome;
		
		System.out.println("The monthly take home pay after taxes is $" + convert + ".");
			

	}

}
