import java.util.Scanner;

public class JavaLessonTwo
{
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main (String[] args)
	{
		System.out.print("Your favorit number: ");
		
		if (userInput.hasNextInt())
		{
			
			int numberEntered = userInput.nextInt();
			
			System.out.println("You entered " + numberEntered);
			
			int numEnteredTimes2 = numberEntered + numberEntered;
			System.out.println(numberEntered + " + " + numberEntered + " = " + numEnteredTimes2);
		
			int numEnteredMinus2 = numberEntered - 2;
			System.out.println(numberEntered + " -  2 = " + numEnteredMinus2);
			
			int numEnteredSelf = numberEntered * numberEntered;
			System.out.println(numberEntered + " * " + numberEntered + " = " + numEnteredSelf);		
		
			int numEnteredRemainder = numberEntered % 3;
			System.out.println(numberEntered + " % 3= " + numEnteredRemainder);
			
			numberEntered += 2;
			numberEntered -= 2;
			
			numberEntered --;
			numberEntered ++;
			
			int numberABS = Math.abs(numberEntered);
			int wichISBigger = Math.max(5, 6); //7
			int wichISLess = Math.min(5, 6);    //5
		
			
			double numSqrt = Math.sqrt(5.23);
			
			
			int numCeiling = (int) Math.ceil(5.23); //6
			int numFlour = (int) Math.floor(5.23); //5
			
			
			int numRound = (int) Math.round(5.6); //5
			
			double random = (Math.random());
			
			int integerRandom = (int) (random * 11);
			
			
			double doubleNumCeiling = Math.ceil(5.23); //6.0
			double doubleNumFlour = Math.floor(5.23); //5.0
			
			double doubleRandom = (random * 11);
			
			System.out.println("random = " + random);
						
			System.out.println("double random = " + random + " * 11 = " + doubleRandom);
			
			System.out.println("integer random = " + integerRandom);
			

			
			/*
			 * 
			 * COMMENT4
			 * 
			 * 
			 * */
			 
		} else		{
			
			System.out.println("Enter an integer next time ");
			
		}
		
		
		
		
		
		
		
		
		
	}
	
}
