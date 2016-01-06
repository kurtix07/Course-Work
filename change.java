import java.util.Scanner;

public class Change
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double bill, tip, bill2;
		System.out.print("Enter the amount of your bill: ");
		bill = input.nextDouble();
		tip = tipCalc(bill);
		System.out.println("Your tip should be "  + tip + ".");
		double party;
		System.out.print("Enter the number of people in the party: ");
		party = input.nextDouble();
		System.out.print("Enter the amount of your bill: ");
		bill2 = input.nextDouble();
		group = splitCalc(bill2);
		System.out.println("Your split check should be " + group + ".");
	}	
	
	static double tipCalc(double amount) {
		return amount * .15;
	}
	
	static double splitCalc(double amount) {
		return amount / 2;
	}	
}

	
		