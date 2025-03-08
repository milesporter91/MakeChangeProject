package makechange;

import java.util.Scanner;

public class MakeChangeProject {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		printCashRegisterLogo();
		boolean keepShopping = true;
		while (keepShopping) {
			System.out.println();
			System.out.println("Please enter the total purchase price: ");
			System.out.println();
			double purchasePrice = kb.nextDouble();
			System.out.println();
			System.out.println("Please enter amount paid:");
			System.out.println();
			double amountPaid = kb.nextDouble();
			if (amountPaid < purchasePrice) {
				double amountNeeded = purchasePrice - amountPaid;
				System.out.println();
				System.out.println("Sorry, that isn't enough money! " + "You need another $" + amountNeeded + ".");

			}

			if (amountPaid == purchasePrice) {
				System.out.println();
				System.out.println("Change due: $0.00");
				System.out.println("Thank you for your purchase! Have a great day!");
			}

			double changeDue = amountPaid - purchasePrice;
			if (amountPaid > purchasePrice) {
				System.out.println();
				System.out.println("Change due: " + changeDue);
				System.out.println("Change given: ");
			}
			changeDue = (changeDue * 100) + .0000001;

			int twentyDue = (int) changeDue / 2000;
			changeDue = changeDue % 2000;
			int tenDue = (int) changeDue / 1000;
			changeDue = changeDue % 1000;
			int fiveDue = (int) changeDue / 500;
			changeDue = changeDue % 500;
			int dollarDue = (int) changeDue / 100;
			changeDue = changeDue % 100;
			int quarterDue = (int) changeDue / 25;
			changeDue = changeDue % 25;
			int dimeDue = (int) changeDue / 10;
			changeDue = changeDue % 10;
			int nickelDue = (int) changeDue / 5;
			changeDue = changeDue % 5;
			int pennyDue = (int) changeDue / 1;
			if (twentyDue > 0) {
				System.out.print(twentyDue + " twenty dollar bill");
				if (twentyDue > 1) {
					System.out.print("s");
				}
				if (tenDue > 0 || fiveDue > 0 || dollarDue > 0 || quarterDue > 0 || dimeDue > 0 || nickelDue > 0
						|| pennyDue > 0) {
					System.out.print(", ");
				} else {
					System.out.print(".");
				}
			}
			if (tenDue > 0) {
				if ((twentyDue > 0 && fiveDue == 0 && dollarDue == 0) && quarterDue == 0 && dimeDue == 0
						&& nickelDue == 0 && pennyDue == 0) {
					System.out.print("and ");
				}
				System.out.print(tenDue + " ten dollar bill");
				if (tenDue > 1) {
					System.out.print("s");
				}
				if (fiveDue > 0 || dollarDue > 0 || quarterDue > 0 || dimeDue > 0 || nickelDue > 0 || pennyDue > 0) {
					System.out.print(", ");
				} else {
					System.out.print(".");
				}
			}
			if (fiveDue > 0) {
				if ((twentyDue > 0 || tenDue > 0 && dollarDue == 0) && quarterDue == 0 && dimeDue == 0 && nickelDue == 0
						&& pennyDue == 0) {
					System.out.print("and ");
				}
				System.out.print(fiveDue + " five dollar bill");
				if (fiveDue > 1) {
					System.out.print("s");
				}
				if (dollarDue > 0 || quarterDue > 0 || dimeDue > 0 || nickelDue > 0 || pennyDue > 0) {
					System.out.print(", ");
				} else {
					System.out.print(".");
				}
			}
			if (dollarDue > 0) {
				if ((twentyDue > 0 || tenDue > 0 || fiveDue > 0) && quarterDue == 0 && dimeDue == 0 && nickelDue == 0
						&& pennyDue == 0) {
					System.out.print("and ");
				}
				System.out.print(dollarDue + " one dollar bill");
				if (dollarDue > 1) {
					System.out.print("s");
				}
				if (quarterDue > 0 || dimeDue > 0 || nickelDue > 0 || pennyDue > 0) {
					System.out.print(", ");
				} else {
					System.out.print(".");
				}
			}
			if (quarterDue > 0) {
				if ((twentyDue > 0 || tenDue > 0 || fiveDue > 0 || dollarDue > 0 && dimeDue == 0) && nickelDue == 0
						&& pennyDue == 0) {
					System.out.print("and ");
				}
				System.out.print(quarterDue + " quarter");
				if (quarterDue > 1) {
					System.out.print("s");
				}
				if (dimeDue > 0 || nickelDue > 0 || pennyDue > 0) {
					System.out.print(", ");
				} else {
					System.out.print(".");
				}
			}
			if (dimeDue > 0) {
				if ((twentyDue > 0 || tenDue > 0 || fiveDue > 0 || dollarDue > 0 || quarterDue > 0) && nickelDue == 0
						&& pennyDue == 0) {
					System.out.print("and ");
				}
				System.out.print(dimeDue + " dime");
				if (dimeDue > 1) {
					System.out.print("s");
				}
				if (nickelDue > 0 || pennyDue > 0) {
					System.out.print(", ");
				} else {
					System.out.print(".");
				}
			}
			if (nickelDue > 0) {
				if ((twentyDue > 0 || tenDue > 0 || fiveDue > 0 || dollarDue > 0 || quarterDue > 0 || dimeDue > 0)
						&& pennyDue == 0) {
					System.out.print("and ");
				}
				System.out.print(nickelDue + " nickel");
				if (nickelDue > 1) {
					System.out.print("s");
				}
				if (pennyDue > 0) {
					System.out.print(", ");
				} else {
					System.out.print(".");
				}
			}
			if (pennyDue > 0) {
				if (twentyDue > 0 || tenDue > 0 || fiveDue > 0 || dollarDue > 0 || quarterDue > 0 || dimeDue > 0
						|| nickelDue > 0) {
					System.out.print("and ");
				}
				System.out.print(pennyDue + " penn");
				if (pennyDue > 1) {
					System.out.print("ies.");
				} else {
					System.out.print("y.");
				}
			}
			System.out.println();
			System.out.println();
			System.out.println("Would you like to make another purchase?");
			System.out.println("1. Yes \t 2. No");
			String anotherPurchase = kb.next();
			switch (anotherPurchase) {
			case "2":
			case "no":
			case "No":
			case "NO":
				keepShopping = false;
				break;
			}
		}
		System.out.println();

		printFarewellMessage();
		kb.close();
	}
	
	public static void printCashRegisterLogo() {
		 	System.out.println("       __________________");
	        System.out.println("      |       JAVA       |");
	        System.out.println("      |   CASH REGISTER  |");
	        System.out.println("      |__________________|");
	        System.out.println("      |  [====]  [====]  |");
	        System.out.println("      |  [====]  [====]  |");
	        System.out.println("      |  [====]  [====]  |");
	        System.out.println("      |__________________|");
	        System.out.println("      |                  |");
	        System.out.println("      |   TOTAL: $0.00   |");
	        System.out.println("      |__________________|");
	        System.out.println("             |   |");
	        System.out.println("             |___|");
	        System.out.println("            (_____)  ");
	        System.out.println("           (_______)  ");
	}
	
	public static void printFarewellMessage() {
		System.out.println();
        System.out.println("    +----------------------+  ");
        System.out.println("    |   THANK YOU!         |  ");
        System.out.println("    |   COME AGAIN SOON!   |  ");
        System.out.println("    +----------------------+  ");
        System.out.println("         $$$      $$$        ");
        System.out.println("        $   $    $   $       ");
        System.out.println("         $$$      $$$        ");
	}

}
