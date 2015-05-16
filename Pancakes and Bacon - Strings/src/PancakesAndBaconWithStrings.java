import java.util.Scanner;

class PancakesAndBaconWithStrings
	{
	public static void main(String[] args) 
		{
		String choice;  // Notice that I'm looking for String input from the user.
		
		System.out.println("Do you prefer pancakes or bacon?");
		
		Scanner userInput = new Scanner(System.in);
		choice = userInput.nextLine();		// Because it's String input, I'm using the nextLine() method.	
		if ("pancakes".equals(choice))		// This condition in the parentheses is how you compare Strings.
			{
			System.out.println("I like pancakes, too.");
			}
		else if ("bacon".equals(choice))
			{
			System.out.println("Good choice - more protein, less sugar.");
			}
		else
			{
			System.out.println("Ah, you must like something else then...");
			}
		}
	}