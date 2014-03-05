import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame
	{
	static String name;
	static int secretNumber;
	static int randomNumber;
	static int userGuess;
	static int guessCount = 0;
	
	public static void main(String[] args)
		{
		greetPlayer();
		generateNumber();
		System.out.println("I'm thinking of a number between 1 and 20, inclusive.");
		while (userGuess != secretNumber)
			{
			takePlayerGuess();
			evaluateGuess();
			guessCount++;
			}
		if (guessCount == 1)
			System.out.println("Amazing, you guessed it on the first try!");
		else
			System.out.println("That took you " + guessCount + " tries");
		}
	
	public static String greetPlayer()
		{
		System.out.println("What is your name? ");
		Scanner userInput = new Scanner(System.in);
		name = userInput.nextLine();
		System.out.println("Hi, " + name + "!");
		return name;
		}
		
	public static int generateNumber()
		{
		Random randomNumber = new Random();
		secretNumber = 1 + randomNumber.nextInt(20);
		return secretNumber;
		}
	
	public static int takePlayerGuess()
		{
		System.out.print("What is your guess?  ");
		Scanner userInput = new Scanner(System.in);
		userGuess = userInput.nextInt();
		return userGuess;
		}
	
	public static void evaluateGuess()
		{		
		if (userGuess == secretNumber)
			{
			System.out.println();
			System.out.println("Congratulations, you're right, " + name + "!");
			System.out.println();
			}
		else if (userGuess < 0 || userGuess > 20)
			{
			System.out.println("That's outside the range. Try again.");
			}
		else if (userGuess < secretNumber)
			{
			System.out.println("Nope, that's too low. Try again.");
			}
		else if (userGuess > secretNumber)
			{
			System.out.println("Nope, that's too high.  Try again.");
			}
		}
	}
