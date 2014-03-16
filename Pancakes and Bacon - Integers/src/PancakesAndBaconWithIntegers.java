import java.util.Scanner;

class PancakesAndBaconWithIntegers
	{
	public static void main(String[] args) 
		{
		int choice;  // Notice that I'm looking for integer input from the user.
		
		System.out.println("Choose the number of your favorite breakfast: (1) pancakes or (2) bacon?");  // I tell the user I want integer input.
		
		Scanner userInput = new Scanner(System.in);
		choice = userInput.nextInt();		// Because it's integer input, I'm using the nextInt() method.	
		if (choice == 1)		// This condition in the parentheses is how you compare numbers.
			{
			System.out.println("I like pancakes, too.");
			}
		else if (choice == 2)
			{
			System.out.println("Good choice - more protein, less sugar.");
			}
		else
			{
			System.out.println("Ah, you must like something else then...");
			}
		}
	}