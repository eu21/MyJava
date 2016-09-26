import java.util.Scanner;

public class JavaLessonFive
{
	
	static int randomNumber;  //Class Variable

	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		System.out.println(getRandomNum());
		
		int guessResult  = 1;
		int userGuess = 1;
		
		while(guessResult != -1)
		{
			System.out.print("Guess a number between 0 and 50: ");
			
			userGuess = userInput.nextInt();
			
			guessResult = checkGuess(userGuess);
			
		}
			
		System.out.println("Yes the random number is " + userGuess);

	}
	
	public static int getRandomNum ()
	{
		randomNumber = (int) (Math.random()*51); //Between 0 and 50
		return randomNumber;
	}

	public static int checkGuess(int guess)
	{
		if(guess == randomNumber)
		{
			return -1;
		} else {
			return guess;
		}
	}
	
}