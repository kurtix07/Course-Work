import java.util.Scanner;

public class kerri
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String answer = "more than anything";
		String response = "";
		System.out.println("Let's play a guessing game. You get three tries.");
		System.out.print("How much does Adam love you? ");
		response = input.nextLine();
		if (response.equals(answer))
			System.out.println("That's right, I love you kerri.");
		else {
			System.out.print("Sorry sweetheart. Guess again: ");
			response = input.nextLine();
			if (response.equals(answer))
				System.out.println("That's right, I love you kerri.");
			else {
				System.out.println("Sorry, still not right. I know you know this Kerri, one more guess: ");
				response = input.nextLine();
				if (response.equals(answer))
					System.out.println("That's right, I love you kerri.");
				else 
					System.out.println("Wrong again. I love you more than anything. ");
			}
		}
	}
}