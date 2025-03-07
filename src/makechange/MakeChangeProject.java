package makechange;

import java.util.Scanner;

public class MakeChangeProject {
	

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the total purchase price: ");
		double purchasePrice = kb.nextDouble();
		System.out.println("Please enter amount paid:");
		double amountPaid = kb.nextDouble();
		if (amountPaid < purchasePrice) {
			double amountNeeded = purchasePrice - amountPaid;
			System.out.println("Sorry, that isn't enough money! "
					+ "You need another $" + amountNeeded + ".");
		}
		
		if (amountPaid == purchasePrice) {
			System.out.println("Change due: $0.00");
			System.out.println("Thank you for your purchase! Have a great day!");
		}
		
		  
		
	}

}
//				double changeDue = 1.00 - .67;
//				System.out.println("Change due: " + changeDue);
//				changeDue = (changeDue * 100) + .0000001;
//				currencyDue();

//		divide changedue by 100 and cast to int to get number of $1 bills to return,
//		500 for $5 bills, 1000 for $10 bills, and 2000 for $20 bills.
//		25 for quarters, 10 for dimes, 5 for nickels, 1 for pennies
//		
//
//
//		public static void currencyDue() {
//	1:    ex: cost: $35.19   paid: $40.00    change = 4.81 * 100 = 481
//	2:	 twentyDue = (int) changeDue / 1000 = x
//	3:	 tenDue = (int) changeDue / 1000 = x
//	4:	 fiveDue = (int) changeDue / 500 = x
//	5:	 dollarDue = (int) changeDue / 100 = 4
//	6:	changeDue = changeDue % 100 = 81 
//	7:	quartersDue = (int) changeDue / 25 = 3
//	8:	changeDue = changeDue % 25 = 6
//	9:	nickelsDue = changeDue / 5 = 1
//	10:	changeDue = changeDue % 5 = 1
//	11:	penniesDue = changeDue / 1 = 1
//		
//      make a switch that toggles on cases if the bill variables > 0,
//		print those variables on one line with + "dollar bills, "
//

